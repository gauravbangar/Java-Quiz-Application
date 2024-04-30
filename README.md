# Java Quiz Application
 This Java application allows users to participate in a quiz to test their knowledge of Java programming language concepts. It presents a set of predefined questions with multiple-choice answers and calculates the user's score based on their responses.



Features

* Quiz Gameplay: Users can play the quiz by answering a series of questions presented one by one.
* Score Calculation: The application calculates the user's score based on the correctness of their answers.
* Simple Console Interface: The quiz is presented in a console interface, making it easy to use.


Components-

Main Class (Main.java)
* Contains the main method serving as the entry point of the program.
* Creates an instance of QuestionService and invokes methods to play the quiz and display the score.

QuestionService Class (QuestionService.java)
* Manages the quiz logic, including presenting questions, receiving user input, and calculating the score.
* Holds an array of Question objects and an array to store user selections.
* Provides methods to play the quiz and print the user's score.

Question Class (Question.java)
* Represents a single question in the quiz.
* Contains fields for the question ID, the question itself, answer options, and the correct answer.
* Provides getters and setters for accessing and modifying question details.

