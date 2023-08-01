package com.sirbrian.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

   private final AuthenticationService service;

   @PostMapping("/register")
   public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {

//      return new ResponseEntity<>(service.register(request));
      return ResponseEntity.ok(service.register(request));
   }

   @PostMapping("/authenticate")
   public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
//      return new ResponseEntity<>(service.authenticate(request));
      return ResponseEntity.ok(service.authenticate(request));
   }

}
