package com.in28minutes.myfirstwebapp.todos;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<TodoModel> list= new ArrayList<>();
    private static int counter = 0 ;
    static {
        list.add(new TodoModel(++counter,"in28minutes",
                "learn spring-boot", LocalDate.now(),false));
        list.add(new TodoModel(++counter,"in28minutes",
                "learn devops", LocalDate.now().plusMonths(1),false));
        list.add(new TodoModel(++counter,"in28minutes",
                "learn react", LocalDate.now().plusMonths(2),false));
        list.add(new TodoModel(++counter,"in28minutes",
                "learn system design", LocalDate.now().plusMonths(3),false));
    }

    public List<TodoModel> findByUsername(String name) {
        Predicate<? super TodoModel> p = (todoModel) ->
        {
            return todoModel.getUsername().equalsIgnoreCase(name);
        };
        return list.stream().filter(p).toList();
    }

    public void addTodo(String name, String description, LocalDate plusMonths, boolean b) {
        list.add(new TodoModel(++counter,name,description,plusMonths,b));
    }

    public void removeById(int id) {
        list.removeIf(todoModel -> todoModel.getId()==id);
    }

    public TodoModel findById(int id) {
        Predicate<? super TodoModel> p = todoModel -> todoModel.getId()==id;
        TodoModel model = list.stream().filter(p).findFirst().get();
        return model;
    }

    public void updateTodo(TodoModel todo) {
        removeById(todo.getId());
        list.add(todo);
    }
}
