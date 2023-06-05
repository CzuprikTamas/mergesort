import java.util.Arrays;

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
        if(isSorted(array)) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array,0,array.length / 2);
        int[] right = Arrays.copyOfRange(array,array.length / 2, array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        int[] merged = merge(left,right);
        return merged;
    }
}