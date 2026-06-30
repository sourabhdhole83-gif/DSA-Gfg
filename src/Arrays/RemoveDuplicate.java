package Arrays;

public class RemoveDuplicate {

    public static int removeDup(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,5,5,6};

        int i = RemoveDuplicate.removeDup(arr);
        System.out.println(i);

    }
}
