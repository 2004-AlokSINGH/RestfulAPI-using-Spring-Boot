//package test.userAuth.controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import test.userAuth.model.User;
//import test.userAuth.service.UserService;
//
//
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//	
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody User user) {
//        try {
//            userService.registerUser(user);
//            return ResponseEntity.ok("User registered successfully");
//        } catch (Exception e) {
//            if (e.getMessage().equals("Mail already registered")) {
//                return ResponseEntity.status(400).body("Mail already registered");
//            }
//            return ResponseEntity.status(500).body("Error registering user: " + e.getMessage());
//        }
//    }
//    
//
//
//    @GetMapping("/fetch")
//    public ResponseEntity<Object> fetchUser(@RequestParam String email, @RequestParam String password) {
//        try {
//            User user = userService.fetchUser(email, password);
//            if (user != null) {
//                return ResponseEntity.ok(user);
//            } else {
//                return ResponseEntity.status(404).body("Invalid credentials, no user found");
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Internal server error");
//        }
//    }
//
//}

package test.userAuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import test.userAuth.model.User;
import test.userAuth.service.UserService;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Management System", description = "Operations related to user management")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @Operation(summary = "Register a new user", description = "Registers a new user in the system")
    public ResponseEntity<String> registerUser(
            @Parameter(description = "User object to be registered", required = true) @RequestBody User user) {
        try {
            userService.registerUser(user);
            return ResponseEntity.ok("User registered successfully");
        } catch (Exception e) {
            if (e.getMessage().equals("Mail already registered")) {
                return ResponseEntity.status(400).body("Mail already registered");
            }
            return ResponseEntity.status(500).body("Error registering user: " + e.getMessage());
        }
    }
    
    @GetMapping("/fetch")
    @Operation(summary = "Fetch a user by email and password", description = "Fetches a user by their email and password")
    public ResponseEntity<Object> fetchUser(
            @Parameter(description = "Email of the user to fetch", required = true) @RequestParam String email,
            @Parameter(description = "Password of the user to fetch", required = true) @RequestParam String password) {
        try {
            User user = userService.fetchUser(email, password);
            if (user != null) {
                return ResponseEntity.ok(user);
            } else {
                return ResponseEntity.status(404).body("Invalid credentials, no user found");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Internal server error");
        }
    }
}

