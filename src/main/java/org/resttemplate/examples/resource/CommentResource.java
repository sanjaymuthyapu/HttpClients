package org.resttemplate.examples.resource;

import lombok.RequiredArgsConstructor;
import org.resttemplate.examples.api.CommentResourceApi;
import org.resttemplate.examples.domain.Comment;
import org.resttemplate.examples.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentResource implements CommentResourceApi {

    private final CommentService commentService;

    @Override
    public ResponseEntity<List<Comment>> getAllComments() {
        return ResponseEntity.ok(commentService.getAllComments());
    }

    @Override
    public ResponseEntity<Comment> getCommentById(String id) {
        return ResponseEntity.ok(commentService.getCommentById(id));
    }

    @Override
    public ResponseEntity<Comment> createComment(Comment comment) {
        commentService.createComment(comment);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteComment(String id) {
        commentService.deleteComment(id);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Comment> updateComment(String id, Comment comment) {
        return ResponseEntity.ok(commentService.updateComment(id, comment));
    }
}
