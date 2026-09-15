public class Task391 {

    public static boolean isSorted(int[] array, int index) {


        if (index >= array.length - 1) {
            return true;
        }


        if (array[index] > array[index + 1]) {
            return false;
        }


        return isSorted(array, index + 1);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 5, 2, 8};
        int[] arr3 = {10, 20, 30};
        int[] arr4 = {3, 3, 3};

        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));
        System.out.println(isSorted(arr3, 0));
        System.out.println(isSorted(arr4, 0));
    }
}
