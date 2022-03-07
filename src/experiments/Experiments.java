package experiments;

public class Experiments {
    public static void main(String[] args) {
        System.out.print("0: ");
        switchWithMissingBreak(0);
        System.out.print("1: ");
        switchWithMissingBreak(1);
        System.out.print("2: ");
        switchWithMissingBreak(2);
        System.out.print("3: ");
        switchWithMissingBreak(3);
        System.out.print("4: ");
        switchWithMissingBreak(4);
    }

    private static void switchWithMissingBreak(int number) {
        switch (number) {
            case 0:
                ++number;
            case 1:
                System.out.println("Small");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("Large");
                break;
            default:
                System.out.println("Too big.");
                break;
        }
    }
}
