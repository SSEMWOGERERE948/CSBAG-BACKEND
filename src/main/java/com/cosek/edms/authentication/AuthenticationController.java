package com.cosek.edms.authentication;

import com.cosek.edms.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register/{roleID}")
    public ResponseEntity<AuthenticationResponse> register(
            @PathVariable Long roleID,
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authenticationService.register(request, roleID));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) throws NotFoundException {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
