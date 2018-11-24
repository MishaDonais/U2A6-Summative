/*
 * This program was made by Misha Donais
 * On November 21st 2018
 * To ask the user various questions and grade the answers
 */
package u2a6summativequiz;

//Imports
import java.util.Scanner;

/**
 *
 * @author misha
 */
public class U2A6SummativeQuiz {

    /**
     * @param args the command line arguments
     */
    
     //Global variables 
    public static int streak = 0;
    public static int score = 0;

    public static void main(String[] args) {
        //Start information
        System.out.println("------------------------------------------------------------------------");
        System.out.println("The program will present you with a series of random math questions.");
        System.out.println("For each question you get right, your score goes up by one.");
        System.out.println("If you answer five questions correctly in a row, you win!");
        System.out.println("However, as soon as you get one wrong, you have to start all over again.");
        System.out.println("Good luck!");
        System.out.println("------------------------------------------------------------------------");
        
        //If the streak is less than or equal to 5, the program will ask another question. The loop ends when streak = 5
        while (streak <=4){
        pickQuestion();
        }  
    }
    
 /*
 * A random number generator chooses a random question, which the user is asked
 */
    public static void pickQuestion(){
        //Variable for the question number
        int questionNumber;
        
        //Random question generator
        questionNumber = makeRandom();
        checkAnswer(questionNumber);
        }
    
    /*
    * Question is asked, answer is given. If the answer is the same as the accepted answer, the boolean result is set to true
    * If the answer is not the same, the boolean result is set to false
    */
    public static boolean checkAnswer(int questionNumber){
        //Questions array
        String [] questions = new String [20];
        questions[0] = "What is 1^7";
        questions[1] = "What is 4x23";
        questions[2] = "What is 18/2+1";
        questions[3] = "What is 7^3";
        questions[4] = "What is 2x3";
        questions[5] = "What is 8^(2/3)";
        questions[6] = "What is 24/8";
        questions[7] = "What is 3x4";
        questions[8] = "What is 90/18";
        questions[9] = "What is 5+3";
        questions[10] = "What is 6+7(2)";
        questions[11] = "What is (12+4)/2+1";
        questions[12] = "What is 17x4+2";
        questions[13] = "What is 2(4+8)-7";
        questions[14] = "What is (4/7)x(7/4)";
        questions[15] = "What is 56/(2x4)";
        questions[16] = "What is 2^6";
        questions[17] = "What is 3^(2^2)";
        questions[18] = "What is 64^(1/2)";
        questions[19] = "What is the capital of Bulgaria";
        
        //Answers array
        String[] answers = new String[20];
        answers[0] = "1";
        answers[1] = "92";
        answers[2] = "10";
        answers[3] = "343";
        answers[4] = "6";
        answers[5] = "4";
        answers[6] = "3";
        answers[7] = "12";
        answers[8] = "5";
        answers[9] = "8";
        answers[10] = "20";
        answers[11] = "9";
        answers[12] = "70";
        answers[13] = "17";
        answers[14] = "1";
        answers[15] = "7";
        answers[16] = "64";
        answers[17] = "81";
        answers[18] = "8";
        answers[19] = "Sofia";
        
          //Scanner
           Scanner keyedInput = new Scanner(System.in);
           
           //Displays the question
           System.out.println(questions[questionNumber]);
            
           //Waits for answer from user
           String answer = keyedInput.nextLine();
            
           boolean result;
           //If correct
           if (answer.equals(answers[questionNumber])){
               result = true;  
           }
            
           //If incorrect
           else{
               result = false;
           }
           scoring(result);  
           return result;
    }
    /*
    * The boolean result is sent to this method, if result = true, score+=1 and streak+=1
    *If the answer is wrong, streak = 0
    */
    public static void scoring(boolean result){
        if (result == true){
        //Tells the user their answer is correct
                System.out.println("Correct!");
                
                //Increases score and streak
                score+=1;
                streak+=1;
                
                //Shows user their score and streak
                System.out.println("Score: " + score);
                System.out.println("Streak: " + streak);
                
                //Checks to see if player won (streak of 5)
                if (streak == 5){
                System.out.println("Congratulations! You have won!");
                }
        }
        if (result == false){
            //Tells the user their answer was incorrect
                System.out.println("Incorrect. Your streak has been set back to zero.");
                
                //Sets streak back to 0
                streak = 0;
                
                //Shows user their score and streak
                System.out.println("Score: " + score);
                System.out.println("Streak: " + streak);
        }
    }
    /*
    * This code picks a random number from 1-20, which will be the number of the question asked 
    */
    public static int makeRandom(){
        int questionNumber;
        questionNumber = (int)Math.round(Math.random()*19+1)-1;
        return questionNumber;
    }

    }

         
    }
    
}
