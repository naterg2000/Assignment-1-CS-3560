 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.util.Random;

/**
 *
 * @author nathangoshay
 */
public class Student {
    
    private Random rand = new Random();
    String studentID;
    int selectedAnswer;
    
    //SimulationDriver simulte = new SimulationDriver();
    
    public Student(int idLength) {
        
        studentID = randAlphaNumeric(idLength);
        
        
    }
    
    //make a random alphanumeric code for the student ID based on a given length
    private String randAlphaNumeric(int length) {
        
        String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        
        StringBuilder builder = new StringBuilder();
        while(length-- != 0) {
            
            //pick a random character from alphaNumeric to append to the output of this method
            int character = (int)(Math.random()*alphaNumeric.length());
            builder.append(alphaNumeric.charAt(character));
            
        }
        
        return builder.toString();
    }
    
    //selects a random answer and submits it to iVote
    public int selectMultipleChoiceAnswer() {
        //pick a number between 0 and 3, then submit to iVote
        
        selectedAnswer = rand.nextInt(4);
        return selectedAnswer;
    }
    
    public int selectTrueFalseAnswer() {
        //pick a number between 0 and 1 then submit to iVote
        
        selectedAnswer = rand.nextInt(2);
        
        return selectedAnswer;
    }
    
    
    
    
}
