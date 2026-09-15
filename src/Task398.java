public class Task398 {

    public static int countUpper(String text) {

        // Base Case
        if (text.isEmpty()) {
            return 0;
        }

        char first = text.charAt(0);

        if (Character.isUpperCase(first)) {
            return 1 + countUpper(text.substring(1));
        }

        return countUpper(text.substring(1));
    }

    public static void main(String[] args) {

        System.out.println(countUpper("Hello"));
        System.out.println(countUpper("JavaProgram"));
        System.out.println(countUpper("ABC"));
        System.out.println(countUpper("lower"));
    }
}
