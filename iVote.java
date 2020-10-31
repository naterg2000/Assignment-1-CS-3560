/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nathangoshay
 */
public class iVote extends SimulationDriver {
    
    public int aSubmissions = 0, bSubmissions = 0, cSubmissions = 0, dSubmissions = 0, trueSubmissions = 0, falseSubmissions = 0, typeOfQuestion, correctAnswers = 0, incorrectAnswers = 0;
    
    Random rand = new Random(); 
    int randomNum;
    //public ArrayList<Student> classroom;
    
    public iVote() {
        
        getStudentSubmissions();
        
    }
    
    
    //gets answers from students and displays the statistics
     public void getStudentSubmissions() {
        
        typeOfQuestion = getQuestionType();
        
        int currentStudentAnswer;
        
        int willStudentResubmit = rand.nextInt(10);
        
        //if the question is a multiple choice question
        if(typeOfQuestion == 0) {
            
            //get each student's answer and compare it with the correct answer from the question in SimulationDriver
            for(int i = 0; i < classroom.size(); i++) {
                
                currentStudentAnswer = classroom.get(i).selectMultipleChoiceAnswer();
                
                //will student resubmit an answer?
                for(int j = 0; j < willStudentResubmit; j++) {
                    if(willStudentResubmit > 7) {
                    currentStudentAnswer = classroom.get(i).selectMultipleChoiceAnswer();
                    }
                }
                
                
                //checks which student selected which answer and then checks whether that answer was correct or not then stores that information
                switch (currentStudentAnswer) {
                    case 0:
                        aSubmissions++;
                        checkIfCorrectMCAnswer(currentStudentAnswer);
                        break;
                    case 1:
                        bSubmissions++;
                        checkIfCorrectMCAnswer(currentStudentAnswer);
                        break;
                    case 2:
                        cSubmissions++;
                        checkIfCorrectMCAnswer(currentStudentAnswer);
                        break;
                    case 3:
                        dSubmissions++;
                        checkIfCorrectMCAnswer(currentStudentAnswer);
                        break;
                    default:
                        break;
                }
            }
            //print classroom size and stats of correct answers
            System.out.println("There were " + classroom.size() + " students.");
            System.out.println(correctAnswers + " students answered correctly. " + aSubmissions + " students chose A, " + bSubmissions + " students chose B, " + cSubmissions + " students chose C, and " + dSubmissions + " students chose D. ");
            
        }
        //if the question a true/ false game
        else {
            
            for(int i = 0; i < classroom.size(); i++) {
                
                currentStudentAnswer = classroom.get(i).selectTrueFalseAnswer();
                
                for(int j = 0; j < willStudentResubmit; j++) {
                    if(willStudentResubmit > 7) {
                    currentStudentAnswer = classroom.get(i).selectTrueFalseAnswer();
                    }
                }
                
                //this will need to be modified later because the statistics need to display how many students selected each answer------------------------------------------------------------------------------------------------
                if(currentStudentAnswer == 0) {
                    trueSubmissions++;
                    checkIfCorrectTFAnswer(currentStudentAnswer);
                }
                else {
                    falseSubmissions++;
                    checkIfCorrectTFAnswer(currentStudentAnswer);
                }
                
            }
            //print classroom size and stats of answers
            System.out.println("There were " + classroom.size() + " students.");
            System.out.println(correctAnswers + " students answered correctly. " + trueSubmissions + " students chose true and " + falseSubmissions + " students answered incorrectly.");
            
        }
        
        
    } 
    
    //takes the current student's answer and checks to see if it is the same as the chosen correct answer. then updates the respective variable
    public void checkIfCorrectMCAnswer(int n) {
        if(n == mCQuestion.correctAnswer) {
            correctAnswers++;
        }
        else {
            incorrectAnswers++;
        }
    }
    //takes the current student's answer and checks to see if it is the same as the chosen correct answer. then updates the respective variable
    public void checkIfCorrectTFAnswer(int n) {
        if(n == tFQuestion.correctAnswer) {
            correctAnswers++;
        }
        else {
            incorrectAnswers++;
        }
    } 
    
    public int chooseQuestionType() {
        
        randomNum = rand.nextInt(2);
        
        if(ranNum == 0) {
            makeMultipleChoiceQuestion(4, rand.nextInt(4));
            return 0;
        }
        else {
            makeTrueFalseQuestion(2, rand.nextInt(2));
            return 1;
        }
        
    } 
    
    //-------------------------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
}
