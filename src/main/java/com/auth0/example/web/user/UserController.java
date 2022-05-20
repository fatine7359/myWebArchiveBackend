package com.auth0.example.web.user;

import com.auth0.example.model.Message;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.auth0.example.security.Utils;
import com.auth0.example.model.Users.User;

import java.util.List;

import org.springframework.http.HttpStatus;
/**
 * Handles requests to "/api" endpoints.
 * 
 * @see com.auth0.example.security.SecurityConfig to see how these endpoints are
 *      protected.
 */
@RestController
@RequestMapping(path = "api/users", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class UserController {

	private Utils utils;
	private UserService userService;

	public UserController(Utils utils, UserService userService) {
		this.utils = utils;
		this.userService = userService;
	}

	@GetMapping(value = "/public")
	public @ResponseBody Message publicEndpoint() {
		return new Message("All good. You DO NOT need to be authenticated to call /api/public.");
	}

	@GetMapping(value = "/private")
	
	public @ResponseBody Message privateEndpoint(@RequestHeader("Authorization") String authHeader) {
		String user = this.utils.getUser(authHeader);
		return new Message("All good. You can see this because you are Authenticated. " + user);
	}

	@GetMapping(value = "/private-scoped")
	public @ResponseBody Message privateScopedEndpoint() {
		return new Message(
				"All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope");
	}
	
	@GetMapping(value="/getAll")
	public @ResponseBody List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(value="/getuser/{uid}")
	public @ResponseBody User[] getUserById(@RequestHeader String authHeader, @RequestParam String uid) {
		String user =this.utils.getUser(authHeader);
		return userService.getUserById(authHeader, uid);
	}
	
	//nom complet, email, type(professeur ) ou promo(si �tudiant)
	//modified  revoir
	//boujida yzid mle
	@PostMapping(value="/adduser", consumes = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody void addUser(@RequestBody User user) {
		//@RequestParam String displayName, @RequestParam String email, @RequestParam String type, @RequestParam String mle, @RequestParam String niveauetudes
        //User user = new User(null, displayName, null, mle, type, niveauetudes);
		userService.addUser(user);
    }

	@PutMapping(value = "/updateuser/{uid}")
	public void updateUser(@RequestBody User user, @PathVariable String uid){
		userService.updateUser(user, uid);
	}
	
	//@requestheader string user
	//this.util.get
	//changed successfully
	@PutMapping(value="/updateuser/{uid}/email", consumes = {"application/json"})
	public void updateUserEmail(@RequestBody User user, @PathVariable String uid) {

		userService.updateUser(user, uid);
	}
	
//	@PutMapping(value="/updateuser/{imageUrl}")
//	public void updateUserImage(@RequestBody User user, @RequestParam String imageUrl) {
//		userService.updateUserEmail(user, imageUrl);
//	}
	
	//v�rifier si l'utilisateur existe d�j� chez nous
	
	//delete plusieurs id
	@DeleteMapping(value="/deleteuser/{uid}")
	public @ResponseBody void deleteUser(@PathVariable String uid) {

		userService.deleteUser(uid);
	}
	
	//upload files
	@SuppressWarnings("rawtypes")
	@PostMapping("/uploaduser")
    public ResponseEntity uploadAndAddUser(@RequestParam ("user") MultipartFile user){
        String message = "";
            try{
               userService.uploadUser(user);
               message ="upload the file successfully: " + user.getOriginalFilename();
//               User u = new User(String uid, String email, String displayName, String imageUrl, String mle, String type, String niveauetudes);
//               userService.addUser(u);
               return ResponseEntity.status(HttpStatus.OK).body(message);
            }catch (Exception e){
                message ="could not upload file ";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
            }
	}
	
}
