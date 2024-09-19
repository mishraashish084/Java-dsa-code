package Arrays;

public class Rotate1Place {
    public static void onerotate(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
    }

    public static void main(String[] arg) {
        int[] a = {1, 2, 3, 4, 5};
        onerotate(a);
        
        // Print the array elements in one line
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        // Print a newline at the end to avoid prompt overlap
        System.out.println();
    }
}
