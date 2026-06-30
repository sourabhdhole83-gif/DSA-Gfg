package Arrays;



public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4};
        int[] b = {3, 4, 5, 6, 7, 8, 9, 22};

        int[] c = new int[a.length+b.length];
        for (int ele : c) {
            System.out.print(ele+" ");
        }
        System.out.println();
        mergee(a, b, c);
        for (int ele : c) {
            System.out.print(ele+" ");
        }


    }

    private static void mergee(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
}
