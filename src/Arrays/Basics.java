package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static  int fac(int x){//recursion factorial of 5;
       if(x==0)return 1;
       int y=x*fac(x-1);
       return y;
    }

    public static void main(String[] args) {

        System.out.println(fac(5));

//        int[] x = {3,5,4,21,4};
//        //indexing
//        System.out.println(x[1]);//access
//        //updating elements - mutability
//        x[1] = 9;
//        System.out.println(x[1]);

//=======================================================


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//
//        int n = sc.nextInt();
//        int[] arr= new int[n];
//
//        System.out.print("Enter array elements: ");
//
//        for(int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        //printing negatice elements
//        for(int i=0;i<n;i++){
//            if(arr[i]<0){
//                System.out.print(arr[i]);
//            }
//        }

//=================================================================
//finding sum

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.print("Enter array elements: ");
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        //sum of array
//        int sum =1;
//         for(int i=0; i<n;i++){
//             sum *= arr[i];
//         }
//        System.out.print(sum);
//    }

//========================================================================

//
//        int num = 121;
//        int temp = num;
//
//        int rev = 0;
//
//        while(num > 0){
//            rev = rev*10 + num%10;
//            num /= 10;
//        }
//
//        System.out.println(temp == rev);


    }
}
