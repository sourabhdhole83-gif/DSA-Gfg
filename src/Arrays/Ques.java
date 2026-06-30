package Arrays;

import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
//Multiply odd indexed elements by 2 and add 10 to even indexed elements

        int[] arr = {2,3,4,5,6,7};

//        for(int i=0;i<arr.length;i++){
//            if(i%2==0){
//                arr[i] += 10;
//            }else{
//                arr[i] *= 2;
//            }
//
//        }
//        System.out.print(Arrays.toString(arr));


        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.println(arr[i] += 10);
            else System.out.println(arr[i] *= 2);
        }
        System.out.println(arr.toString());

//Product of array
        int product = 1;
        for(int i =0; i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
