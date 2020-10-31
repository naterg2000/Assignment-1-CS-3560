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
public class SimulationDriver {
    
    //SimulationDriver simulate = new SimulationDriver();
    iVote poll;
    Random ranD = new Random();
    int ranNum;
    public ArrayList<Student> classroom = initClassroom(8);
    
    int typeOfQuestion;
    
    
    Question_MultipleChoice mCQuestion;
    Question_TrueFalse tFQuestion;
      
    
    public SimulationDriver() {
        
        initClassroom(8);
        typeOfQuestion = chooseQuestionType();
        
        iVote poll = new iVote();
        
    }   
    
    public static void main(String[] args) {
        
        SimulationDriver sim = new SimulationDriver();
        
    }
    
    
     //set up a classroom of n students
    public ArrayList<Student> initClassroom(int len) {
        
        classroom = new ArrayList<Student>();
        
        Student student1 = new Student(len);
        Student student2 = new Student(len);
        Student student3 = new Student(len);
        Student student4 = new Student(len);
        Student student5 = new Student(len);
        Student student6 = new Student(len);
        Student student7 = new Student(len);
        Student student8 = new Student(len);
        Student student9 = new Student(len);
        Student student10 = new Student(len);
        Student student11 = new Student(len);
        Student student12 = new Student(len);
        Student student13 = new Student(len);
        Student student14 = new Student(len);
        Student student15 = new Student(len);
        Student student16 = new Student(len);
        Student student17 = new Student(len);
        Student student18 = new Student(len);
        Student student19 = new Student(len);
        Student student20 = new Student(len);
        Student student21 = new Student(len);
        Student student22 = new Student(len);
        Student student23 = new Student(len);
        Student student24 = new Student(len);
        Student student25 = new Student(len);
        
        classroom.add(student1);
        classroom.add(student2);
        classroom.add(student3);
        classroom.add(student4);
        classroom.add(student5);
        classroom.add(student6);
        classroom.add(student7);
        classroom.add(student8);
        classroom.add(student9);
        classroom.add(student10);
        classroom.add(student11);
        classroom.add(student12);
        classroom.add(student13);
        classroom.add(student14);
        classroom.add(student15);
        classroom.add(student16);
        classroom.add(student17);
        classroom.add(student18);
        classroom.add(student19);
        classroom.add(student20);
        classroom.add(student21);
        classroom.add(student22);
        classroom.add(student23);
        classroom.add(student24);
        classroom.add(student25);
       
        
        return classroom;
    }
    
    //figure out whether the question will be multiple choice or true/ false
    public int chooseQuestionType() {
        
        ranNum = ranD.nextInt(2);
        
        if(ranNum == 0) {
            makeMultipleChoiceQuestion(4, ranD.nextInt(4));
            return 0;
        }
        else {
            makeTrueFalseQuestion(2, ranD.nextInt(2));
            return 1;
        }
        
    }
        
    public Question_MultipleChoice makeMultipleChoiceQuestion(int numAns, int corrAns) {
        
        mCQuestion = new Question_MultipleChoice(0, numAns, corrAns);       
        return null;
    }
    
    public Question_TrueFalse makeTrueFalseQuestion(int numAns, int corrAns) {
        
        tFQuestion = new Question_TrueFalse(1, numAns, corrAns); 
        
        return null;
        
    }   
    
    public int getQuestionType() {
        return this.ranNum;
    }
    
}



//CHANGES
/*

- make initClassroom() set up a random sized classroom  -> i don't think students have to have individual object names because 



*/