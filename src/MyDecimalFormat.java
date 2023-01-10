import java.util.Scanner;

public class MyDecimalFormat {
    private int inputInt = 12345678;

    public MyDecimalFormat() {
        Scanner sc = new Scanner(System.in);
        inputInt = sc.nextInt();
        sc.close();
    }
    public MyDecimalFormat(int inputInt) {
        this.inputInt = inputInt;
    }

    public int getInputInt() {
        return inputInt;
    }

    public void printInFormat() {
        String stringInt = "" + inputInt;
        String[] inFormat = new String[(stringInt.length()-1)];
        for (int i = 1; i <= stringInt.length(); i++) {
            //inFormat[i] = String.valueOf(stringInt.charAt(i));
            System.out.print(String.valueOf(stringInt.charAt(i-1)));
            if (i%3 == 0) {
                System.out.print(",");
            }
        }
    }
}
