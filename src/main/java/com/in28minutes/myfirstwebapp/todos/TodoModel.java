package com.in28minutes.myfirstwebapp.todos;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity(name = "todo")
@Table
public class TodoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String username;
    @Size(min = 10 , message = "add atleast 10 characters")
    String description;
    LocalDate date;
    boolean done;

    public TodoModel() {
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public TodoModel(int id, String username, String description, LocalDate date, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.date= date;
        this.done = done;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", Date=" + date +
                ", isDone=" + done +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
