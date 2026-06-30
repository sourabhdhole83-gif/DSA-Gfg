package Arrays;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class RotateArray {


    int[] arr = {1,2,3,4,5,6,7,8};
    //Rotate the array by 2 elements in counter-clockwise direction.Q.{1,2,4,5,6,7,3}
    //Counter-clockwise means left rotation.//output{4,5,6,7,3,1,2}
    //So move the first 2 elements to the end.
    static void rotateArray(int[] arr,int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        rotateArray(arr, d);

        System.out.println(Arrays.toString(arr));
    }

}
