package Quiz;
import java.util.Scanner;
import java.util.*;
public class Question {
    String question ;
    int no;
    HashMap<Integer,String> options;
    String correctanswer;
    ArrayList<Question> list = new ArrayList<Question>();

    public static void  q_no(){
        System.out.println("enter a question no");
        int num;
        Scanner no = new  Scanner(System.in);
        num = no.nextInt();
    }
    public static void set_question(){
        System.out.println("enter question");
        Scanner f = new Scanner(System.in);
        String question = f.nextLine();

    }
    public  void set_options(){
        System.out.println("enter options");
        int count =1;
        String q;
        Scanner str = new Scanner(System.in);
        while(count<5){
            System.out.print("set option "+count);
            q= str.nextLine();
            options.put(count,q);
            count++;
        }
    }
    public  void set_correctanswer(){
        System.out.println("enter correct answer");
        Scanner d = new Scanner(System.in);
        String ans = d.nextLine();


    }

    public ArrayList<Question> adding(Question q){
        list.add(q);
        return list;
    }

    public void show(){
        int g = list.size();
        int count =0;
        while(count<g){
            list.get(count);
        }
    }

}
