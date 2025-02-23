package org.resttemplate.examples.resource;

import lombok.AllArgsConstructor;
import org.resttemplate.examples.api.ProfileDetailsResourceApi;
import org.resttemplate.examples.domain.ProfileDetails;
import org.resttemplate.examples.service.ProfileDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProfileDetailsResource implements ProfileDetailsResourceApi {

    private final ProfileDetailsService profileDetailsService;

    @Override
    public ResponseEntity<ProfileDetails> getProfileDetailsById(String id) {
        return ResponseEntity.ok(profileDetailsService.getProfileDetailsById(id));
    }

    @Override
    public ResponseEntity<List<ProfileDetails>> getProfileDetails() {
        return ResponseEntity.ok(profileDetailsService.getProfileDetails().stream().toList());
    }

    @Override
    public ResponseEntity<Void> createProfileDetails(ProfileDetails profileDetails) {
        profileDetailsService.createProfileDetails(profileDetails);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteProfileDetails(String id) {
        profileDetailsService.deleteProfileDetails(id);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<ProfileDetails> updateProfileDetails(String id, ProfileDetails profileDetails) {
        return ResponseEntity.ok(profileDetailsService.updateProfileDetails(id, profileDetails));
    }
}
