import java.util.*;
import java.util.HashMap; //import Hashmap class
import java.util.Scanner;

public class Quiz {
  public HashMap<String, String> QuestionSet;
  public HashMap<String, String> StudentResponses;
  public int repsonse1;
  public int repsonse2;
  public int repsonse3;
  public int repsonse4;
  public int repsonse5;
  public int repsonse6;
  public int repsonse7;
  public int repsonse8;
  public int repsonse9;
  public int repsonse10;
  public int numTries; //if the user has taken more than two attempts, they can no longer retake


  
  public int score; //total of how many correct answers there are. For loop will add one to correctAnswers everytime there is a match. 
  public String name; //the players username
  

  public Quiz()
  {
    QuestionSet = new HashMap<String, String>(); //questions are not done yet, but this is an idea of how it would work. 
    QuestionSet.put("Q1:","b"); // Question is the key, solution is the value
    QuestionSet.put("Q2:","c");
    QuestionSet.put("Q3:","d");
    QuestionSet.put("Q4:","d");
    QuestionSet.put("Q5:","a");
    QuestionSet.put("Q6:","b");
    QuestionSet.put("Q7:","c");
    QuestionSet.put("Q8:","a");
    QuestionSet.put("Q9:","b");
    QuestionSet.put("Q10:","b");

    StudentResponses = new HashMap<String, String>(); //new hashmap of student's responses
    
  }

  public void play() { //play method to be used in Main.java
    while (true) { //while loop set as true so it will keep on running
      String Homepage = Utils.inputStr("Hello: Please choose an option below: \n Take Pop Quiz \n Pray \n Confess To Cheating \n"); //homepage with three options
      
    switch (Homepage) {
      case "Take Pop Quiz":
    Scanner scan = new Scanner(System.in);
    name = Utils.inputStr("\n This is Marc Shepard's 1st period comp sci class. Today, we will be catching the cheaters with this quiz. Please insert your name: \n");

    numTries = Utils.inputNum("How many times have you taken this test?");

  if (numTries < 3) {
    System.out.println("\nThanks for starting the quiz. For all responses, choose \"a\", \"b\", \"c\", or \"d\". Any other answers will be counted wrong.");
        
    System.out.println("Question 1: What is the name of the coding convention used in Java? \n a. CaMelCaSe \n b. camelCase \n c. Camelcase \n d. CAMELcase "); //question is presented
    String response1 = scan.nextLine(); //response is recorded
      StudentResponses.put("Q1:", response1); //response is put in array
        
      System.out.println("Question 2: What class adds input to your Java program? \n a. Input \n b. Enter \n c. Scanner \n d. Scan");
    String response2 = scan.nextLine();
      StudentResponses.put("Q2:", response2);
        
      System.out.println("Question 3: How many bytes in a double? \n a. 2 \n b. 4 \n c. 32 \n d. 64");
    String response3 = scan.nextLine();
        StudentResponses.put("Q3:", response3);
        
      System.out.println("Question 4: Which of these is not a primitive data type? \n a. Boolean \n b. Enter \n c. Scanner \n d. Scan");
    String response4 = scan.nextLine();
        StudentResponses.put("Q4:", response4);
        
      System.out.println("Question 5: Which symbol terminates a command in Java? \n a. ; \n b. * \n c. \" \n d. : ");
    String response5 = scan.nextLine();
        StudentResponses.put("Q5:", response5);     

      System.out.println("Question 6: What can you type instead of println to go to a new line? \n a. \\t \n b. \\n \n c. \\e \n d. \\l ");
    String response6 = scan.nextLine();
        StudentResponses.put("Q6:", response6);  
        
        System.out.println("Question 7: What does .compareTo do? \n a. Compares two strings \n b. Compares two strings numerically \n c. Compares two strings alphabetically \n d. Compares letters in strings ");
    String response7 = scan.nextLine();
        StudentResponses.put("Q7:", response7); 

        System.out.println("Question 8: If statement only executes only iF a boolean condition is true.  \n a. True \n b. False");
    String response8 = scan.nextLine();
        StudentResponses.put("Q8:", response8); 

        System.out.println("Question 9: What will java do when it is given an int when it was expecting an integer?  \n a. Unboxing \n b. Autoboxing \n c. Converting \n d. Transforming");
    String response9 = scan.nextLine();
        StudentResponses.put("Q9:", response9); 

        System.out.println("Question 10: Who is the best?  \n a. 49ers \n b. Seahawks \n c. Patriots \n d. Broncos");
    String response10 = scan.nextLine();
        StudentResponses.put("Q10:", response10);
// you could do a for loop???

        
        int score = 0;
     
        if (QuestionSet.get("Q1:").equals(StudentResponses.get("Q1:"))){//response is compared to answer key
          score ++; //if it is the same, score is increased by one
        } //we ended up not using the compareTo method since it just didn't work because Hashmaps contain strings        
        if (QuestionSet.get("Q2:").equals(StudentResponses.get("Q2:"))){
          score ++;
        }
        if (QuestionSet.get("Q3:").equals(StudentResponses.get("Q3:"))){
          score ++;
        }
        if (QuestionSet.get("Q4:").equals(StudentResponses.get("Q4:"))){
          score ++;
        }
        if (QuestionSet.get("Q5:").equals(StudentResponses.get("Q5:"))){
          score ++;
        }
        if (QuestionSet.get("Q6:").equals(StudentResponses.get("Q6:"))){
          score ++;
        }
        if (QuestionSet.get("Q7:").equals(StudentResponses.get("Q7:"))){
          score ++;
        }
        if (QuestionSet.get("Q8:").equals(StudentResponses.get("Q8:"))){
          score ++;
        }
        if (QuestionSet.get("Q9:").equals(StudentResponses.get("Q9:"))){
          score ++;
        }
        if (QuestionSet.get("Q10:").equals(StudentResponses.get("Q10:"))){
          score ++;
        }
        System.out.println("Your score is: " + score); 
    
        
        if (score >= 6) {
          System.out.println("Congrats! " + name + ", you have passed the test.");
        }
        else {
          System.out.println(name + " please retake this test if this is your first try. Otherwise, see me in tutorial");
        }
    }
        else {
          System.out.println("Sorry " + name + ", you have reached the maximum possible attempts");
        }
    return;
      case "Pray":
        System.out.println("Sorry, God will not be showing mercy today. Please take the quiz or your course grade will be a 0.");
        
    break;
      case "Confess To Cheating":
        System.out.println("No Mercy for Cheaters. Your course grade is now a 0. You can redeem yourself by taking the quiz by running the program again.");
    return;
      default: 
        System.out.println("Invalid Answer. Please pick one of the choices below. \n");
        
    }
    }
    }
