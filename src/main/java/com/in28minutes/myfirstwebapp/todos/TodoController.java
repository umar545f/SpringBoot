package com.in28minutes.myfirstwebapp.todos;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.time.LocalDateTime;

//@Controller
@SessionAttributes("name")
public class TodoController {
    TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/toDoList" , method = RequestMethod.GET)
    public String viewPage(Model model)
    {
        String username = getLoggedInUsername();
        model.addAttribute("todo",
                todoService.findByUsername(username));
        return "toDoList";
    }

    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping(value = "/add-todo" , method = RequestMethod.GET)
    public String addToDo(Model model)
    {
        TodoModel todoModel = new TodoModel(0, getLoggedInUsername(),
                "", LocalDate.now().plusMonths(1),false);
        model.addAttribute("todo",todoModel);
        return "toDo";
    }

    @RequestMapping(value = "/add-todo" , method = RequestMethod.POST)
    public String showNewToDoList(ModelMap model, @Valid TodoModel todo , BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            model.addAttribute("todo",todo);
            model.addAttribute("errors", bindingResult.getFieldErrors());
            return "toDo";
        }
        todoService.addTodo(getLoggedInUsername(),todo.getDescription(),
                todo.getDate(),todo.isDone());
        return "redirect:toDoList";
    }

    @RequestMapping(value = "/deleteToDo" , method = RequestMethod.GET)
    public String deleteAToDo(@RequestParam int id)
    {
        todoService.removeById(id);
        return "redirect:/toDoList";
    }

    @RequestMapping(value = "/updateToDo" , method = RequestMethod.GET)
    public String updateToDo(@RequestParam int id, Model model)
    {
        TodoModel todoModel = todoService.findById(id);
        model.addAttribute("todo",todoModel);
        return "toDo";
    }

    @RequestMapping(value = "/updateToDo" , method = RequestMethod.POST)
    public String updateToDo(ModelMap model, @Valid TodoModel todo , BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            model.addAttribute("todo",todo);
            model.addAttribute("errors", bindingResult.getFieldErrors());
            return "toDo";
        }
        todo.setUsername(getLoggedInUsername());
        todoService.updateTodo(todo);
        return "redirect:toDoList";
    }
}
