package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr= {2,5,1,4,5};

        for(int ele : arr){//the for-each loop is read-only because it gives you a copy of each value. To modify the array elements, use an index-based loop
            ele *= 2;      // isse kn hoga
//        }
//        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
