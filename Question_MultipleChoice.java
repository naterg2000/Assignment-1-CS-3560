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
public class Question_MultipleChoice extends Question {
       

    public Question_MultipleChoice(int t, int numAnswers, int corrAnswer) {
        
        super(t, numAnswers, corrAnswer);
        
        
    }
    
    public int getQuestionType() { return this.qType; }
        
    public int getNumChoices() { return this.numOfAnswers; }
    
    public int getCorrectAnswer() { return this.correctAnswer; }
    
}

