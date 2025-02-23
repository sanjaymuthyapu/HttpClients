package org.resttemplate.examples.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Comment {
    private Integer postId;
    private Integer id;
    private String name;
    private String email;
    private String body;
}