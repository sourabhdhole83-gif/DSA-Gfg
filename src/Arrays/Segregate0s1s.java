package Arrays;

import java.util.Arrays;

public class Segregate0s1s {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 0, 1, 0};

//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            while (left < right && arr[left] == 0) {
//                left++;
//            }
//            while (left < right && arr[right] == 1) {
//                right--;
//            }
//            if (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i]==0) i++;
           else if(arr[j]==1)j--;
//            if(i>j)break; //agar else nhi lagau toh ye krna padega
          else  if (arr[i]==1 && arr[j]==0){
                 arr[i] = 0;
                 arr[j]=1;
                 i++;
                 j--;

            }
        }
//        for(int ele:arr){
//            System.out.print(ele);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
