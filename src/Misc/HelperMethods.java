package Misc;

import java.util.Scanner;

public class HelperMethods {
    private static final Scanner s = new Scanner(System.in);

    public static Option options() {
        System.out.println("Please select an option below: \n1. New Game\n2. Load Game\n3. Options\n4. Exit");
        String in = s.nextLine();
        while (!in.equals("4")) {
            switch (in){
                case "1":
                    return Option.NEW_GAME;
                case "2":
                    return Option.SAVE_GAME;
                case "3":
                    return Option.OPTIONS;
                default:
                    in = s.nextLine();
            }
        }
        return Option.EXIT;
    }
}
