package ArraysGPT;

public class Ques {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4, 5};

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
//        for(int i =0;i<a.length-1;i++){
//            if(temp<a[i]){
//                max = a[i];
//                i++;
//            }
//        }
//        System.out.println(max);
//        time = O(n) , space = O(1);

//=============2nd largest============

        int max = Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int num:a){

            if(num>max){
                max=num;
            }
//            else if(num>max )
        }

    }
}