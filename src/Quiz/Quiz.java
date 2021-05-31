package Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz{
    private static int no;
    private static String question;
    private static HashMap<Integer,String> options= new HashMap<>();
    private static String correctanswer;


    public  Quiz(Integer newNo,String newQuestion,HashMap<Integer,String> newOptions,String newCorrectanswer)
    {
        no = newNo;
        question = newQuestion;
        options = newOptions;
        correctanswer = newCorrectanswer;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public HashMap<Integer,String> getOptions() {
        return options;
    }

    public void setOptions(HashMap<Integer,String> options) {
        this.options = options;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }

    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }

    @Override
    public String toString() {
        return getNo() + "\n" +
                getQuestion() + "\n" +
                getOptions() + "\n";
    }
}
