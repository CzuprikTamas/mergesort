    public class Main {
    public static void main(String[] args) {
        System.out.println("Merge sort");
    }
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static int[] merge(int[] left, int[] right) {
        return null;
    }

    public static int[] mergeSort(int[] array) {
        return null;
    }
}