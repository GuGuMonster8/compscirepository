# Overview
Author - Ryan Gu and Mohammed Abdi

Quiz class - quiz for students to take to evaluate AP Comp Sci Knowledge.

Student Responses will be put into a hashmap. Hashmap will be compared to another Hashmap named QuestionSet. We will be using HashMap Class, Integer Classes, String Classes. We will have one hashmap class that contains the answers that were put in by the student or the test taker and one hashmap that is the QuestionSet. Most likely, we will be using the .get() method to compare student responses vs the QuestionSet. We will use try catch exception handling to catch errors while comparing code to insure that the comparison doesn't stop after one error?




Variables used:
  - response1-10: record the quiz responses of the students. These responses will be static variables. 
  - score will measure the amount of questions that the student gets correct. It will not be a static variable. 
  - the name records the name of the person. it will be a static variable. 

Methods: 
  - possibly a nextquestion method: 
  - inputStr method from Utils.java. This allowed us to get the name of the personas well as choose an option from the Homeescreen
  - used Util.inputNum method to ask for how many attempts they have taken for the test. The user is allowed two attempts. This also fufills the try and catch exception rqeuirements. 
  - we also used the .get method for the comparisons. This is found in lines 123-152. 

