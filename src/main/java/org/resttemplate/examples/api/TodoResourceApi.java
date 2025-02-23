package org.resttemplate.examples.api;


import org.resttemplate.examples.domain.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/todos")
public interface TodoResourceApi {

    @GetMapping("")
    ResponseEntity<List<Todo>> getAllTodos();

    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable String id);

    @PostMapping("")
    ResponseEntity<Todo> createTodo (@RequestBody Todo todo);
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteTodo (@PathVariable String id);
    @PutMapping("/{id}")
    ResponseEntity<Todo> updateTodo (@PathVariable String id, @RequestBody Todo todo);

}
