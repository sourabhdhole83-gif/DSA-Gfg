package Arrays;
import java.util.Arrays;

public class SortBuiltIn {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 6, -1, 9};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    public static void print(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+" ");
        }
        System.out.println();
    }

//    =======================Ques=========
//


}
