package org.resttemplate.examples.service;

import lombok.AllArgsConstructor;
import org.resttemplate.examples.domain.Todo;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final RestClient restClient;

    public List<Todo> getAllTodos () {
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });
    }

    public Todo getTodoById (String id) {
        return restClient.get()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Todo.class);
    }

    public Todo createTodo (Todo todo) {
        return restClient.put()
                .uri("/todos", todo)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }

    public void deleteTodo (String id) {
        restClient.delete()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Void.class);
    }

    public Todo updateTodo (String id, Todo todo) {
        return restClient.put()
                .uri("/todos/{id}", id)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }

}
