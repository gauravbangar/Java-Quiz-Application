import java.util.Scanner;

public class QuestionService {

        Question[] questions = new Question[5];
        String selection[] = new String[5];

        public QuestionService() {
                questions[0] = new Question(1, "Which of the following is not a Java features?", "Dynamic",
                                "Architecture Neutral", "Use of pointers", "Object-oriented", "Use of pointers");
                questions[1] = new Question(2, "_____ is used to find and fix bugs in the Java programs.", "JVM", "JRE",
                                "JDK",
                                "JDB", "JDB");
                questions[2] = new Question(3,
                                " In which memory a String is stored, when we create a string using new operator?",
                                "Stack",
                                "String memory", "Heap memory", "Random storage space", "Heap memory");
                questions[3] = new Question(4, "Which of the following is a reserved keyword in Java?", "object",
                                "strictfp",
                                "main", "system", "strictfp");
                questions[4] = new Question(5, "Which class in Java is used to take input from the user?", "Scanner",
                                "Input",
                                "Applier", "None of these", "Scanner");
        }

        public void playQuiz() {

                int i = 0;
                for (Question q : questions) {
                        System.out.println("Question No: " + q.getId());
                        System.out.println(q.getQuestion());
                        System.out.println(q.getOpt1());
                        System.out.println(q.getOpt2());
                        System.out.println(q.getOpt3());
                        System.out.println(q.getOpt4());
                        Scanner sc = new Scanner(System.in);
                        selection[i] = sc.nextLine();
                        i++;

                }
                for (String s : selection) {
                        System.out.println(s);
                }
        }

        public void printScore() {
                int score = 0;
                for (int i = 0; i < questions.length; i++) {
                        Question que = questions[i];
                        String actualAnswer = que.getAnswer();

                        String userAnswer = selection[i];

                        if (actualAnswer.equals(userAnswer)) {
                                score++;
                        }
                }

                System.out.println("Hey User Your Score For Quiz is:" + score);

        }
}
