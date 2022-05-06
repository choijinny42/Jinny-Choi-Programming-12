import java.util.Arrays;

public class Sort {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while(index1 < arr1.length && index2 < arr2.length) {
            if(arr1[index1] > arr2[index2]) {
                result[index] = arr1[index1];
                index1++;
            }
            else {
                result[index] = arr2[index2];
                index2++;
            }
            index++;
        }
        while(index1 < arr1.length) {
            result[index] = arr1[index1];
            index1++;
            index++;
        }
        while(index2 < arr2.length) {
            result[index] = arr2[index2];
            index2++;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {27, 24, 15, 10, 8};
        int[] arr2 = new int[] {84, 81, 35, 25, 14, 11, 8, 5, 2};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
