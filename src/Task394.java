public class Task394 {


    public static int countZeros(int number) {

        // Special case
        if (number == 0) {
            return 1;
        }

        return countZerosHelper(number);
    }

    private static int countZerosHelper(int number) {

        // Base Case
        if (number == 0) {
            return 0;
        }

        if (number % 10 == 0) {
            return 1 + countZerosHelper(number / 10);
        }

        return countZerosHelper(number / 10);
    }

    public static void main(String[] args) {

        System.out.println(countZeros(1020));
        System.out.println(countZeros(5000));
        System.out.println(countZeros(123));
        System.out.println(countZeros(908070));
    }
}
