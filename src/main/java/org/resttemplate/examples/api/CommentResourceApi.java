package org.resttemplate.examples.api;


import org.resttemplate.examples.domain.Comment;
import org.resttemplate.examples.domain.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/comments")
public interface CommentResourceApi {

    @GetMapping("")
    ResponseEntity<List<Comment>> getAllComments();

    @GetMapping("/{id}")
    ResponseEntity<Comment> getCommentById(@PathVariable String id);

    @PutMapping("/{id}")
    ResponseEntity<Comment> updateComment(@PathVariable String id, Comment comment);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteComment(@PathVariable String id);

    @PostMapping("")
    ResponseEntity<Comment> createComment(@RequestBody Comment comment);

}
