package Quiz;

import java.util.*;

public class Main{
    static Scanner in = new Scanner(System.in);

    public static int no;
    public static String question;
    public static HashMap<Integer,String> options= new HashMap<Integer,String>();
    public static String correctanswer;
    public static ArrayList<Question> list = new ArrayList<>();
    public static int count = 0;
    public static void main(String[] args) {
        // Initialize our field map with key/name pairs
        HashMap<String, String> columnChoices = new HashMap<>();
        columnChoices.put("multi", "Multiple Choice");
        columnChoices.put("check", "Check Box");
        columnChoices.put("trufls", "True/False");

        // Top-level menu options
        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("add", "Add questions");
        actionChoices.put("run", "Run or carry out the quiz");
        actionChoices.put("grade", "Grade the quiz");

        System.out.println("Welcome to LaunchCode's Quiz App!");

        // Allow the user to quiz until they manually quit
        while (true) {

            String actionChoice = getUserSelection("Use Quiz App by selecting one of the options(type 'x' to quit):", actionChoices);

            if (actionChoice == null) {
                break;
            } else if (actionChoice.equals("add")) {
                count++;
                String columnChoice = getUserSelection("Type of Question to ADD:", columnChoices);
                //Quiz q1 = new Quiz();
                Questions q1 = new Questions();
                no = q1.getQuestionNo();
                question = q1.getQuestionDetails();
                if(columnChoice.equals("trufls")) {
                    options = q1.setOptionsTrueFalse();
                }
                else {
                    options = q1.getOptionDetails();
                }
                correctanswer = q1.getCorrectanswerDetails();
                if(count == 1) {
                    Question que1 = new Question(no, question, options, correctanswer);
                    list.add(que1);
                }
                else if(count == 2) {
                    Question que2 = new Question(no, question, options, correctanswer);
                    list.add(que2);
                }
                else if(count == 3) {
                    Question que3 = new Question(no, question, options, correctanswer);
                    list.add(que3);
                }
                else if(count == 4) {
                    Question que4 = new Question(no, question, options, correctanswer);
                    list.add(que4);
                }
                else if(count == 5) {
                    Question que5 = new Question(no, question, options, correctanswer);
                    list.add(que5);
                }
                else if(count == 6) {
                    Question que6 = new Question(no, question, options, correctanswer);
                    list.add(que6);
                }
                else if(count == 7) {
                    Question que7 = new Question(no, question, options, correctanswer);
                    list.add(que7);
                }
                else if(count == 8) {
                    Question que8 = new Question(no, question, options, correctanswer);
                    list.add(que8);
                }
                else if(count == 9) {
                    Question que9 = new Question(no, question, options, correctanswer);
                    list.add(que9);
                }
                else if(count == 10) {
                    Question que10 = new Question(no, question, options, correctanswer);
                    list.add(que10);
                }
                else if(count == 11) {
                    Question que11 = new Question(no, question, options, correctanswer);
                    list.add(que11);
                }
                else if(count == 12) {
                    Question que12 = new Question(no, question, options, correctanswer);
                    list.add(que12);
                }
                else if(count == 13) {
                    Question que13 = new Question(no, question, options, correctanswer);
                    list.add(que13);
                }
                else if(count == 14) {
                    Question que14 = new Question(no, question, options, correctanswer);
                    list.add(que14);
                }
                else if(count == 15) {
                    Question que15 = new Question(no, question, options, correctanswer);
                    list.add(que15);
                }
                else if(count == 16) {
                    Question que16 = new Question(no, question, options, correctanswer);
                    list.add(que16);
                }
                else if(count == 17) {
                    Question que17 = new Question(no, question, options, correctanswer);
                    list.add(que17);
                }
                else if(count == 18) {
                    Question que18 = new Question(no, question, options, correctanswer);
                    list.add(que18);
                }
                else if(count == 19) {
                    Question que19 = new Question(no, question, options, correctanswer);
                    list.add(que19);
                }
                else if(count == 20) {
                    Question que20 = new Question(no, question, options, correctanswer);
                    list.add(que20);
                }
                System.out.println(list);
            } else if (actionChoice.equals("run")) {
                runQuiz();
                break;
            }else if (actionChoice.equals("grade")) {
                break;
            }
        }
    }

    private static String getUserSelection(String menuHeader, HashMap<String, String> choices) {
        int choiceIdx = -1;
        Boolean validChoice = false;
        String[] choiceKeys = new String[choices.size()];

        // Put the choices in an ordered structure so we can
        // associate an integer with each one
        int i = 0;
        for (String choiceKey : choices.keySet()) {
            choiceKeys[i] = choiceKey;
            i++;
        }

        do {

            System.out.println("\n" + menuHeader);

            // Print available choices
            for (int j = 0; j < choiceKeys.length; j++) {
                System.out.println("" + j + " - " + choices.get(choiceKeys[j]));
            }

            if (in.hasNextInt()) {
                choiceIdx = in.nextInt();
                in.nextLine();
            } else {
                String line = in.nextLine();
                boolean shouldQuit = line.equals("x");
                if (shouldQuit) {
                    return null;
                }
            }

            // Validate user's input
            if (choiceIdx < 0 || choiceIdx >= choiceKeys.length) {
                System.out.println("Invalid choice. Try again.");
            } else {
                validChoice = true;
            }

        } while(!validChoice);

        return choiceKeys[choiceIdx];
    }

    public static void runQuiz(){
        System.out.println(list);
        for (Quiz str_arr : list) {
            if(str_arr.getQuestion() != null) {
                System.out.println(str_arr.getNo());
                System.out.println(str_arr.getQuestion());
                options = str_arr.getOptions();
                Iterator optionIterator = options.entrySet().iterator();
                while (optionIterator.hasNext()) {
                    Map.Entry mapElement = (Map.Entry)optionIterator.next();
                    System.out.println(mapElement.getKey()+". "+mapElement.getValue());
                }
            }
        }
    }
}
