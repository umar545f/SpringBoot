package com.in28minutes.myfirstwebapp.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class SureveyController {
    @Autowired SureveyService sureveyService;

    @GetMapping("/surveys")
    public List<Survey> getAllSurveys(){
        return sureveyService.getAllSurveys();
    }
    @GetMapping("/surveys/{surveyId}")
    public Survey getSurveyById(@PathVariable String surveyId)
    {

        Optional<Survey> survey = sureveyService.getSurveyById(surveyId);
        if(survey.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return survey.get();
    }
    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> getAllSurveyQuestions(@PathVariable String surveyId){
         List<Question> questionList =
                 sureveyService.getAllSurveyQuestions(surveyId);
         if(questionList==null)
         {
             throw new ResponseStatusException(HttpStatus.NOT_FOUND);
         }
         return questionList;
    }

    @GetMapping("/surveys/{surveyId}/questions/{questionId}")
    public Question getSurveyQuestionById(@PathVariable String surveyId,
                                        @PathVariable String questionId)
    {

        Question question = sureveyService.getSurveyQuestionById(surveyId,questionId);
        if(question == null)
        {
            if(question==null)
            {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        }
        return question;
    }

    @PostMapping("/surveys/{surveyId}/questions")
    public ResponseEntity<Object> addQuestionToSurvey(@RequestBody Question q,
                                                      @PathVariable String surveyId){
        Question questions= sureveyService.addQuestionToSurvey(surveyId,q);
        if(questions==null)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.created(null).build();
    }
   @DeleteMapping("/surveys/{surveyId}/questions/{questionId}")
    public ResponseEntity<Object> deleteQuestionFromSurvey(@PathVariable String surveyId,
                                         @PathVariable String questionId){
        sureveyService.deleteQuestionFromSurvey(surveyId,questionId);
        return ResponseEntity.noContent().build();
   }

    @PutMapping("/surveys/{surveyId}/questions/{questionId}")
    public ResponseEntity<Object> updateSurveyQuestion(@PathVariable String surveyId,
                                                           @PathVariable String questionId,
                                                       @RequestBody Question question){
        sureveyService.updateSurveyQuestion(surveyId,questionId,question);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
    }
}
