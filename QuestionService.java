import java.util.Scanner;

public class QuestionService {
    
Question[] questions = new Question[6];
String[] inputValue = new String[6];

public QuestionService(){
questions[0] = new Question(1, "Net worth of Amazon", "$1.95 trillion", "$545 billion", "$987 billion", "$5 trillion", "$1.95 trillion");
questions[1] = new Question(2, "Net worth of Apple", "$6.21 trillion", "$3.41 trillion", "$845 billion", "$8.21 trillion", "$3.41 trillion");
questions[2] = new Question(3, "Net worth of Google", "$2.21 trillion", "$55 billion", "$97 billion", "$554 billion", "$2.21 trillion");
questions[3] = new Question(4, "Net worth of Microsoft", "$1.95 trillion", "$3.11 trillion", "$987 billion", "$2.85 trillion", "$3.11 trillion");
questions[4] = new Question(5, "Net worth of Netflix", "$1.95 trillion", "$276 billion", "$458 billion", "$1.52 trillion", "$276 billion");
questions[5] = new Question(6, "Net worth of Atlassians", "$1 trillion", "$45 billion", "$87 billion", "$2 trillion", "$45 billion");
}

public void playQuiz(){
    int j = 0;
    for(int i=0; i<questions.length; i++ ){
        System.out.println(questions[i].getId());
        System.out.println(questions[i].getQuestion());
        System.out.println(questions[i].getOpt1());
        System.out.println(questions[i].getOpt2());
        System.out.println(questions[i].getOpt3());
        System.out.println(questions[i].getOpt4());

        Scanner scanner = new Scanner(System.in);
            inputValue[j]= scanner.nextLine();
        
        j++;
    }
    for (String selection : inputValue) {
        System.out.println(selection);
    }
}

public void score(){
    int score =0 ;

    for(int i=0; i<questions.length; i++){
        String correctAnswer = questions[i].getAnswer();
        String userAnswer = inputValue[i];

        if(correctAnswer.equals(userAnswer)){
            score++;
        }

    }

    System.out.println("Your Score is " + score);
}

}
