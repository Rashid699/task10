public class Task396 {

    public static int sumEvenIndex(int[] array, int index) {

        // Base Case
        if (index >= array.length) {
            return 0;
        }

        return array[index] + sumEvenIndex(array, index + 2);
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 5, 20, 5, 30};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {7};
        int[] arr4 = {2, 9};

        System.out.println(sumEvenIndex(arr1, 0));
        System.out.println(sumEvenIndex(arr2, 0));
        System.out.println(sumEvenIndex(arr3, 0));
        System.out.println(sumEvenIndex(arr4, 0));
    }
}
