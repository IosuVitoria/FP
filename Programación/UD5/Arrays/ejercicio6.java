
// Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

public class ejercicio6 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {6, 2, 3, 4, 5, 6};
        int[] array3 = {1, 2, 3, 4, 5, 6};
        int[] array4 = {6, 2, 3, 4, 5, 6};

        System.out.println(firstLast6(array1));
        System.out.println(firstLast6(array2));
        System.out.println(firstLast6(array3));
        System.out.println(firstLast6(array4));

    }

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
