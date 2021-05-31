package Quiz;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;
public class Question extends Quiz{
    public  Question(Integer newNo,String newQuestion,HashMap<Integer,String> newOptions,String newCorrectanswer)
    {
        super(newNo,newQuestion,newOptions,newCorrectanswer);
    }

}
