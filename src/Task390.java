public class Task390 {

    public static int countDigit(int number, int digit) {

        // Base Case
        if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10;

        if (lastDigit == digit) {
            return 1 + countDigit(number / 10, digit);
        }

        return countDigit(number / 10, digit);
    }

    public static void main(String[] args) {

        System.out.println(countDigit(2222, 2));
        System.out.println(countDigit(12321, 1));
        System.out.println(countDigit(5050, 0));
        System.out.println(countDigit(789, 6));
    }
}
