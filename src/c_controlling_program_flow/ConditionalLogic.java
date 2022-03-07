package c_controlling_program_flow;

import java.util.Random;

public class ConditionalLogic {
    public static void main(String[] args) {
        nestedIfWithoutBrackets(true);
        switchWithEnum(Genre.RPG);
        switchWithNumber();
        switchBasics();
        whileLoopBasics();
        System.out.println();
        doWhileLoopBasics();
        System.out.println();
        forBasics();
        System.out.println();
        enhancedForBasics();
        System.out.println();
        nestedLoops();
        System.out.println();
        normalBreak();
        System.out.println();
        normalContinue();
        System.out.println();
        labelledBreak();
        System.out.println();
        labelledContinue();
    }

    private static void nestedIfWithoutBrackets(boolean isToday) {
        if (isToday)
            if (isToday)
                System.out.println("Today it's today.");
            else System.out.println("No, not today!"); // else grabs on to the first unmatched if
        else System.out.println("No, definitely not today");
    }

    private static void switchWithEnum(Genre genre) {
        switch (genre) {
            case RPG:
                System.out.println("Your brain is your main weapon.");
                break;
            case STORY:
                System.out.println("Don't forget to turn on the sound!");
                break;
            case SHOOTER, POINT_AND_CLICK:
                System.out.println("A mouse is recommended.");
                break;
            default:
                System.out.println("Enjoy!");
                break;
        }
    }

    private static void switchWithNumber(){
        int diceThrow = new Random().nextInt(6)+1;
        System.out.println("You threw a " + diceThrow);

        switch (diceThrow) {
            case 1 -> System.out.println("The loneliest number...");
            case 2, 3, 4, 5 -> System.out.println("");
            case 6 -> System.out.println("Congrats! You can choose how many places you move forward.");
            default -> System.out.println("You cheater!");
        }
    }

    private static void switchBasics(){
        System.out.println("---Switch basics:");
        byte b=4;
        final int ic = 10; // compile-time constant (value known at compile-time)
        int i = 10; // not a constant
        final int c;  // not initiated at compile-time
        c = 20;  // initiated at compile-time
        Byte byteW = 30;   // Byte iw = new Byte(10);

        switch (b){
            case 1+3: // compile time constant, int -> byte
                break;
            case ic: // compile time constant, int -> byte
                break;
            //case i: break; // must be a compile time constant
            //case byteW: break; // must be a compile time constant
            //case c: break; // must be a compile time constant

        }
    }

    private static void whileLoopBasics(){
        System.out.println("---While loop basics:");
        int x= 1;
        // while (x){} // int cannot be converted to boolean
        // while (x=5){} // resolves to 5 (the value of the variable after the assignment)
        while (x==5){
            System.out.println("x==5");
        } // OK
        /* while (true){ // OK but infinite
            System.out.println("true");
        } */
    }

    private static void doWhileLoopBasics(){
        System.out.println("---Do while loop basics:");
        int x = 3;

        do {
            System.out.print(x + " "); //3
        } while (x > 99);
        System.out.println();

        do {
            System.out.print(x + " "); // 3, 2, 1
            --x;
        } while (x > 0);
        System.out.println();
    }

    private static void forBasics(){
        System.out.println("---For basics:");
        // for (int i = 1; i <= 3; i++); //OK

        for (int i = 1; i <= 3; i++){
            System.out.print(i + " "); // 1, 2, 3
        }
        System.out.println();

        for (int i = 3; i >= 1; --i){
            System.out.print(i + " "); // 3, 2, 1
        }
        System.out.println();

        for (int i = 0, j = 0; i < 1 && j < 1; ++i, j+=2){
            System.out.print(i + " " + j + "\t"); // 0 0
        }
        System.out.println();

        for (int i = 0; i < 5; i--){} //infinite loop

        var test = 0;
        for (int i = 0; i < 5; test++) {

        }

        int i = 0;
        // for (int i = 0; i < 5; i++){} // 'i' already declared in this scope

        // for (int j = 0, short k = 0; i < 5 && j < 5; i++, j++){} // mixed types not allowed
    }

    private static void enhancedForBasics(){
        System.out.println("---Enhanced for basics:");
        String[] cars = new String[3];
        cars[0] = "Fiat";
        cars[1] = "Volvo";
        cars[2] = "Tesla";

        //traditinal for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + "\t");
        }
        System.out.println();

        //enhanced-for version
        for (String car : cars) {
            System.out.print(car + "\t");
        }
        System.out.println();

        for (var car : cars) { // var is OK too
            System.out.print(car + "\t");
        }
        System.out.println();

        String[] countries = new String[3];
        countries[0] = "Ireland";
        countries[1] = "US";
        countries[2] = "Canada";

        // for (int country : countries){} // 'country' should be type String

        String name = "";
        /* for (String name : countries) { // 'name' already declared
            System.out.println(name);
        } */

        String player = "Federer";
        // for (String p : player){} // array or Iterable on RHS

        long[] la = {8L, 9L, 10L};
        // for (int n : la){} // 'n' needs to be long
    }
    
    private static void nestedLoops(){
        System.out.println("---Nested loops:");
        String[][] directions = { {"North", "South"}, {"East", "West"}};

        for (String[] row : directions) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + "\t");
            }
        }
        System.out.println();
    }

    private static void normalBreak(){
        System.out.print("---Normal break");
        for (int i = 1; i <= 3; i++) {
            System.out.print("\n" + i + ":");
            for (int j = 1; j <= 5; j++) {
                if (j == 3){
                    System.out.print(" break");
                    break; // breaks out of inner loop
                }
                System.out.print(" " + j);
            }
        }
        System.out.println();
    }

    private static void normalContinue(){
        System.out.print("---Normal continue");
        for (int i = 1; i <= 3; i++) {
            System.out.print("\n" + i + ":");
            for (int j = 1; j <= 5; j++) {
                if (j == 3){
                    System.out.print(" continue");
                    continue; // bypasses and continues with inner loop
                }
                System.out.print(" " + j);
            }
        }
        System.out.println();
    }

    private static void labelledBreak(){
        System.out.print("---Labelled break");
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            System.out.print("\n" + i + ":");
            for (int j = 1; j <= 5; j++) {
                if (j == 3){
                    System.out.print(" break OUTERLOOP");
                    break OUTERLOOP;
                }
                System.out.print(" " + j);
            }
        }
        System.out.println();
    }

    private static void labelledContinue(){
        System.out.print("---Labelled continue");
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            System.out.print("\n" + i + ":");
            for (int j = 1; j <= 5; j++) {
                if (j == 3){
                    System.out.print(" continue OUTERLOOP");
                    continue OUTERLOOP;
                }
                System.out.print(" " + j);
            }
        }
        System.out.println();
    }

    enum Genre {
        RPG, SHOOTER, STORY, POINT_AND_CLICK;
    }
}
