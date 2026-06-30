package Arrays;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {12,23,44,23};

        int max= 0;
        int sum = 0;

//        for(int i = 0; i<arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

//=====================================================

//        for(int i = 0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.println(sum);
//

// ================================================

        for(int i = 0; i<arr.length; i++){
           if(max<arr[i]){
               max=arr[i];
           }
        }
        System.out.println(max);
    }
}
