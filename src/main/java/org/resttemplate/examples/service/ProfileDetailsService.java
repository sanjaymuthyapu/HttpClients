package org.resttemplate.examples.service;

import org.resttemplate.examples.domain.ProfileDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ProfileDetailsService {

    private static final WebClient webClient = WebClient.create("http://localhost:3000/profile");

    public ProfileDetails getProfileDetailsById(String id) {
        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(ProfileDetails.class)
                .block();
    }

    public List<ProfileDetails> getProfileDetails() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(ProfileDetails.class)
                .collectList()
                .block();
    }

    public void createProfileDetails(ProfileDetails profileDetails) {
        webClient.post()
                .bodyValue(profileDetails)
                .retrieve()
                .bodyToMono(ProfileDetails.class)
                .block();
    }

    public void deleteProfileDetails(String id) {
        webClient.delete()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Void.class)
                .block();
    }

    public ProfileDetails updateProfileDetails(String id, ProfileDetails profileDetails) {
        return webClient.put()
                .uri("/{id}", id)
                .bodyValue(profileDetails)
                .retrieve()
                .bodyToMono(ProfileDetails.class)
                .block();
    }
}
