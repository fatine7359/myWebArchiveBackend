package com.auth0.example.web.user;

import com.auth0.example.model.Message;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
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
	
	//nom complet, email, type(professeur ) ou promo(si étudiant)
	//modified à revoir
	//boujida yzid mle
	@PostMapping(value="/adduser")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody void addUser(@RequestParam String displayName, @RequestParam String email, @RequestParam String type, @RequestParam String mle, @RequestParam String niveauetudes) {
        User user = new User(null, displayName, null, mle, type, niveauetudes);
		userService.addUser(user);
    }
	
	//@requestheader string user
	//this.util.get
	//changed successfully
	@PutMapping(value="/updateuser/{id}")
	public void updateUserEmail(@RequestBody User user) {
		userService.updateUser(user);
	}
	
//	@PutMapping(value="/updateuser/{imageUrl}")
//	public void updateUserImage(@RequestBody User user, @RequestParam String imageUrl) {
//		userService.updateUserEmail(user, imageUrl);
//	}
	
	//vérifier si l'utilisateur existe déjà chez nous
	
	//delete plusieurs id
	@DeleteMapping(value="/deleteuser/{uid}")
	public @ResponseBody void deleteUser(@RequestBody String uid) {
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
