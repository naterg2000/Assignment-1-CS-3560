/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author nathangoshay
 */
public abstract class Question {
    
    public int numOfAnswers, correctAnswer, qType;
    
    public Question(int t, int numChoices, int corrAnswer) {
        
        //questions of type 0 will be multiple choice questions
        //questions of type 1 will be true/false
        
        qType = t;
        numOfAnswers = numChoices;
        correctAnswer = corrAnswer;
        
        
    }
    
    public abstract int getQuestionType();
    public abstract int getNumChoices();
    public abstract int getCorrectAnswer();
    
    
}
