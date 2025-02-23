package org.resttemplate.examples.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Todo {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
