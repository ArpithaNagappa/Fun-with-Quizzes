package Quiz;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;
public class Questions{
    private static int no;
    private static String question;
    private static HashMap<Integer,String> options= new HashMap<Integer,String>();
    private static String correctanswer;
    public ArrayList<Question> list = new ArrayList<>();

     public int getQuestionNo(){
        System.out.println("enter a question no");
        //int num;
        Scanner num = new  Scanner(System.in);
        return num.nextInt();
    }

    public String getQuestionDetails(){
        System.out.println("enter question");
        Scanner f = new Scanner(System.in);
        return f.nextLine();

    }

    public  HashMap<Integer,String> getOptionDetails(){
        System.out.println("enter options");
        int count =1;
        String q;
        Scanner str = new Scanner(System.in);
        while(count<5){
            System.out.println("set option "+count);
            q= str.nextLine();
            System.out.println("count "+count+" q  "+q);
            options.put(count,q);
            count++;
        }
        return options;
    }

    public  HashMap<Integer,String> setOptionsTrueFalse(){
        int count =1;
        options.put(count,"True");
        count++;
        options.put(count,"False");
        return options;
    }

    public  String getCorrectanswerDetails(){
        System.out.println("enter correct answer");
        Scanner d = new Scanner(System.in);
        return d.nextLine();
    }

}
