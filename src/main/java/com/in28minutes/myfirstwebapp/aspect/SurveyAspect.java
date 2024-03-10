package com.in28minutes.myfirstwebapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class SurveyAspect {
    @Before(value = "execution(* com.in28minutes.myfirstwebapp.survey.SureveyController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint)
    {
        System.out.println
                ("Request to "+joinPoint.getSignature()+" started at "+new Date());
    }

    @After(value = "execution(* com.in28minutes.myfirstwebapp.survey.SureveyController.*(..))")
    public void afterAdvice(JoinPoint joinPoint)
    {
        System.out.println
                ("Request to "+joinPoint.getSignature()+" ended at "+new Date());
    }
}
