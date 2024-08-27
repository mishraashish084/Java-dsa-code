package Arrays;

import java.util.HashSet;

public class LonelyInteger {
    // Correct method signature to accept an array of integers
    public static int Lonely(int[] a) {
        HashSet<Integer> s = new HashSet<>();
        for (int i : a) {
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }
        for (int i : s) {
            return i; // Return the lonely integer
        }
        return -1; // Return -1 if no lonely integer is found
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 2, 4};
        System.out.println(LonelyInteger.Lonely(a)); // Call the method with int[] and print the result
    }
}
