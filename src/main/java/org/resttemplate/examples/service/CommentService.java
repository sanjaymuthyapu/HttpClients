package org.resttemplate.examples.service;

import lombok.AllArgsConstructor;
import org.resttemplate.examples.domain.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    public static final String url = "http://localhost:3000/comments";
    private final RestTemplate restTemplate;

    public Comment getCommentById (String id) {
        return restTemplate.getForObject(url + "/{id}", Comment.class, id);
    }

    public List<Comment> getAllComments () {
        return restTemplate.getForObject(url, List.class);
    }

    public void createComment (Comment comment) {
        restTemplate.postForObject(url, comment, Comment.class);
    }

    public void deleteComment (String id) {
        restTemplate.delete(url + "/{id}", id);
    }

    public Comment updateComment (String id, Comment comment) {
        restTemplate.put(url + "/{id}", comment, id);
        return comment;
    }


}
