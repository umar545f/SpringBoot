package com.in28minutes.myfirstwebapp.survey;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Survey {
    String id ;
    String title;
    String description;
    List<Question> questionList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", questionList=" + questionList +
                '}';
    }

    public Survey() {
    }

    public Survey(String id, String title, String description, List<Question> questionList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questionList = questionList;
    }
}
