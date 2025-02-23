package org.resttemplate.examples.api;

import org.resttemplate.examples.domain.ProfileDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("profile")
public interface ProfileDetailsResourceApi {

    @GetMapping("/{id}")
    ResponseEntity<ProfileDetails> getProfileDetailsById (String id);

    @GetMapping("")
    ResponseEntity<List<ProfileDetails>> getProfileDetails ();

    @PostMapping("")
    ResponseEntity<Void> createProfileDetails (ProfileDetails profileDetails);

    @PutMapping("/{id}")
    ResponseEntity<ProfileDetails> updateProfileDetails (String id, ProfileDetails profileDetails);

    @DeleteMapping
    ResponseEntity<Void> deleteProfileDetails (String id);
}
