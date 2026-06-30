package Arrays;

public class Two2Sum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,-3,5,9};
        int target = 140;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    found = true;
                    System.out.println("founded at "+i+" " +j);
                }
            }
            if(found) break;
        }
        if(!found) System.out.println("not there");
    }
}
