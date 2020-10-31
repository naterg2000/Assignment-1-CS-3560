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
public class Question_TrueFalse extends Question {
    
    
    public Question_TrueFalse(int t, int num, int correctAns) {
        
        super(t, num, correctAns);
        
    }
    
    public int getQuestionType() { return this.qType; }
        
    public int getNumChoices() { return this.numOfAnswers; }
    
    public int getCorrectAnswer() { return this.correctAnswer; }
    
}
