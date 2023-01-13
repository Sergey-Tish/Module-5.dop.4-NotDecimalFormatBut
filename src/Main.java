public class Main {
    public static void main(String[] args) {
        MyDecimalFormat myDecimalFormat = new MyDecimalFormat(1234567);
        System.out.println(myDecimalFormat.getInputInt());
        myDecimalFormat.printInFormat();
    }
}
