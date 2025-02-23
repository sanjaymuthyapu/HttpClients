package org.resttemplate.examples.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProfileDetails {
    private String id;
    private String name;
    private String age;
    private String mailId;
    private String phone;
    private String location;
    private String rating;
}
