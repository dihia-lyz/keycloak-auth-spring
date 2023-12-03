package com.auth.keycloak.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping()
    @PreAuthorize("hasRole('client_admin')")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("hello !", HttpStatus.OK);
    }
}
