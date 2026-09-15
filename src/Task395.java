public class Task395 {

    public static boolean contains(String text, char target) {

        // Base Case
        if (text.isEmpty()) {
            return false;
        }

        // Found
        if (text.charAt(0) == target) {
            return true;
        }

        // Search rest of String
        return contains(text.substring(1), target);
    }

    public static void main(String[] args) {

        System.out.println(contains("hello", 'e'));
        System.out.println(contains("world", 'z'));
        System.out.println(contains("java", 'a'));
        System.out.println(contains("", 'x'));
    }
}
