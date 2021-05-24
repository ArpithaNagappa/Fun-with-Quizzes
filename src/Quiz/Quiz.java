package Quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz {
    static Scanner in = new Scanner(System.in);
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
                String columnChoice = getUserSelection("Type of Question to ADD:", columnChoices);
                break;
            } else if (actionChoice.equals("run")) {
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
}
