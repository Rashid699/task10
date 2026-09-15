public class Task397 {

    public static String toBinary(int number) {

        // Base Case
        if (number == 0 || number == 1) {
            return String.valueOf(number);
        }

        return toBinary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {

        System.out.println(toBinary(2));
        System.out.println(toBinary(5));
        System.out.println(toBinary(10));
        System.out.println(toBinary(1));
    }
}
