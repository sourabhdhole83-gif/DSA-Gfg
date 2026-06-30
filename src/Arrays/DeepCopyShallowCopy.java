package Arrays;
import java.util.Arrays;

public class DeepCopyShallowCopy {
    public static void main(String[] args) {
        int b = 10;//4 bytes
        int[] x = {10, 20, 30, 40};//16 bytes

        int[] a = x;//a is shallow copy of x
        a[0] = 11;
        System.out.println(x[0]);

        int[] z = Arrays.copyOf(x,x.length);//deep copy (it will create new array)
        z[0] = 100;
        System.out.println(z[0]);
        System.out.println(x[0]);

    }
}
