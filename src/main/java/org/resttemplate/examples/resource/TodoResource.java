package org.resttemplate.examples.resource;

import lombok.RequiredArgsConstructor;
import org.resttemplate.examples.api.TodoResourceApi;
import org.resttemplate.examples.domain.Todo;
import org.resttemplate.examples.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoResource implements TodoResourceApi {

    private final TodoService todoService;
    @Override
    public ResponseEntity<List<Todo>> getAllTodos () {
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @Override
    public ResponseEntity<Todo> getTodoById (String id) {
        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    @Override
    public ResponseEntity<Todo> createTodo (Todo todo) {
        todoService.createTodo(todo);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteTodo (String id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Todo> updateTodo (String id, Todo todo) {
        return ResponseEntity.ok(todoService.updateTodo(id, todo));
    }

}
