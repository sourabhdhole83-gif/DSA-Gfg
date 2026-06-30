package Arrays;

public class Second2Max {
    public static void main(String[] args) {
        int[] arr = {2,3,10,20,20,5};
        int max =arr[0];
        int smax = arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(smax<arr[i] && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
