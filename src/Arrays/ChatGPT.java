package Arrays;
import java.util.*;
public class ChatGPT {
    public static void main(String[] args) {
        int[] arr = {3,4,5,3,2,7,5};

        //1.Find maximum and minimum element in array
        int max = 0;
        int min = arr[0] ;
//        for(int i = 0; i<arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

//        for(int i = 0; i<arr.length; i++){
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

//===============================================================

    //2.Reverse an array (in-place)


        int j  = arr.length-1;

        for(int i = 0;i<j;i++,j--){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
