package Arrays;

public class MissingEle {
 static int missingNo(int[] arr){
        int n = arr.length+1;

        int t = n*(n+1)/2;//this will find the expected sum with missing element

        int arraySum = 0;

        for(int ele:arr){
            arraySum += ele;
        }
       return t - arraySum;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        missingNo(arr);
        System.out.println(missingNo(arr));

    }
}
