package com.in28minutes.myfirstwebapp.survey;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SureveyService {
    private static List<Survey> surveys = new ArrayList<>();
    static {
        Question question1 = new Question("Question1",
                "Most Popular Cloud Platform Today", Arrays.asList(
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "AWS");
        Question question2 = new Question("Question2",
                "Fastest Growing Cloud Platform", Arrays.asList(
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "Google Cloud");
        Question question3 = new Question("Question3",
                "Most Popular DevOps Tool", Arrays.asList(
                "Kubernetes", "Docker", "Terraform", "Azure DevOps"), "Kubernetes");

        List<Question> questions = new ArrayList<>(Arrays.asList(question1,
                question2, question3));

        Survey survey = new Survey("Survey1", "My Favorite Survey",
                "Description of the Survey", questions);

        surveys.add(survey);
    }

    public List<Survey> getAllSurveys() {
        return surveys;
    }

    public Optional<Survey> getSurveyById(String surveyId) {
        Optional<Survey> survey = surveys.stream().filter
                (survey1 -> survey1.getId().equalsIgnoreCase(surveyId)).findFirst();
        if(survey.isPresent())return survey;
        return null;
    }

    public Question getSurveyQuestionById(String surveyId, String questionId)
    {
        Optional<Survey> survey = surveys.stream()
                .filter(survey1 -> survey1.getId().equalsIgnoreCase(surveyId))
                .findFirst();
        if(!survey.isEmpty())
        {
            Survey surveyObject = survey.get();
            List<Question> questions = surveyObject.getQuestionList();
            Optional<Question> question = questions.stream().filter
                    (question1 -> question1.getId().equalsIgnoreCase(questionId)).
                    findFirst();
            if (!question.isEmpty())
            {
                return question.get();
            }
            return null;
        }
        return null;
    }

    public List<Question> getAllSurveyQuestions(String surveyId) {
        Optional<Survey> survey = surveys.stream()
                .filter(survey1 -> survey1.getId().equalsIgnoreCase(surveyId))
                .findFirst();
        if(!survey.isEmpty())
        {
            Survey surveyObject = survey.get();
            List<Question> questions = surveyObject.getQuestionList();
            return  questions;
        }
        return null;
    }

    public Question addQuestionToSurvey(String surveyId,
                                        Question q)
    {
        List<Question> questions = getAllSurveyQuestions(surveyId);
        if(!questions.isEmpty())
        {
            q.setId(String.valueOf(Math.random()));
            questions.add(q);
            return q;
        }
        return null;
    }

    public List<Question> deleteQuestionFromSurvey(String surveyId, String questionId) {
        List<Question> questions = getAllSurveyQuestions(surveyId);
        if(!questions.isEmpty())
        {
            Optional<Question> question= questions.stream()
                    .filter(question1 -> question1.getId().equalsIgnoreCase(questionId))
                    .findFirst();
            if(!question.isEmpty()){
               Question q = question.get();
               questions.remove(q);
            }
            return null;
        }
        return null;
    }

    public void updateSurveyQuestion(String surveyId, String questionId,Question question) {
        List<Question> questions = getAllSurveyQuestions(surveyId);
        questions.removeIf(question1 -> question1.getId().equalsIgnoreCase(questionId));
        questions.add(question);
    }
}
