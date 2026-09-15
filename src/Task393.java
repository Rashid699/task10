public class Task393 {

    public static long power(long base, int exponent) {


        if (exponent == 0) {
            return 1;
        }

        long half = power(base, exponent / 2);


        if (exponent % 2 == 0) {
            return half * half;
        }


        return base * half * half;
    }

    public static void main(String[] args) {

        System.out.println(power(2, 10));
        System.out.println(power(3, 4));
        System.out.println(power(5, 3));
        System.out.println(power(2, 0));
    }
}
