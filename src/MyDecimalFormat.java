import java.util.Scanner;

public class MyDecimalFormat {
    private final int inputInt;
    static String stringInt;

    public MyDecimalFormat() {
        System.out.println("vvedite chislo:");
        Scanner sc = new Scanner(System.in);
        inputInt = sc.nextInt();
        sc.close();
        stringInt = "" + inputInt;
    }

    public MyDecimalFormat(int inputInt) {
        this.inputInt = inputInt;
        stringInt = "" + inputInt;
    }

    public int getInputInt() {
        return inputInt;
    }

    public void printInFormat() {

        int i = 0;
        int k = 1;
        if (stringInt.length() % 3 == 1) {
            i = IncrementIAndPrintNumber(i);
            printThePoint();
        } else if (stringInt.length() % 3 == 2) {
            i = IncrementIAndPrintNumber(i);
            i = IncrementIAndPrintNumber(i);
            printThePoint();
        }
        while (i < stringInt.length()) {
            printStringIntCharAt(i);
            if ((k) % 3 == 0 && (i + 1) < stringInt.length()) {
                printThePoint();
            }
            i++;
            k++;
        }
    }

    private static int IncrementIAndPrintNumber(int i) {
        printStringIntCharAt(i);
        i++;
        return i;
    }

    private static void printStringIntCharAt(int i) {
        System.out.print(stringInt.charAt(i));
    }

    private static void printThePoint() {
        System.out.print(",");
    }
}
