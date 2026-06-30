package Arrays;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {23, 4, 2, 11, 55, 32, 21,22,56,78};
        int n = arr.length;
//        int i = 0;
        int j=arr.length-1;
//
//        while(i<j){
//            int temp = arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//
//            i++;
//            j--;
//        }
//        for(int r : arr) System.out.print(r+" ");
//    }

//================================== 2 approaches 1st one is clean



//        for(int i=0;i<n/2;i++){
//            int temp = arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
//        for(int x:arr){
//            System.out.print(x+" ");
//        }

//===================i want to reverse from arr[3] to arr[6]

//        int i =3,j=6  ;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));


        for (int i=0;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

}
