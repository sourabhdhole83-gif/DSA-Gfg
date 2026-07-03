package ArraysGPT;

public class Ques {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 4 , 7};

        //reverse the array
//         int left = 0;
//         int right = a.length-1;
//
//         while(left<right){
//             int temp = a[left];
//             a[left]  = a[right];
//             a[right] = temp;
//
//             left++;
//             right--;
//         }
//       for(int arr:a){
//           System.out.println(arr);
//       }
//        time = O(n) , space = O(1);

//===========find largest============

//        int max = 0;
//        for(int i =0;i<a.length;i++){
//            if(max<a[i]){
//                max = a[i];
//                i++;
//            }
//        }
//        System.out.println(max);
//        time = O(n) , space = O(1);

//=============2nd largest============

//        int max = Integer.MIN_VALUE;
//        int secMax=Integer.MIN_VALUE;
//        for(int num:a){
//
//            if(num>max){
//                max=num;
//            }
//            else if(num>max )


//=================Check Array is Sorted=========================

//        boolean sorted = true;
//        for(int i = 0;i< arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                sorted = false;
//                break;
//            }
//        }
//        System.out.println(sorted);

//==================Remove Duplicates from Sorted Array==================================

        int[] nums = {1,1,2,2,3,4,4};

        int i = 0; // Points to the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        System.out.println(i + 1);

        }

    }
