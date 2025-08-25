public class Pass_by_value {
    public static void changeValue(int x){
        x = 100;
    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
//        System.out.println(a + " "  + b);
    }
    // array and objects (can modify orignal value) copy of the reference is send so they point to same memory
    public static void changeArray(int[] arr){
        arr[0] = 99;
    }

    public static void main(String[] args) {
//        int x = 10;
//        changeValue(x);//copy of x is send to meathod
//        System.out.println(x);//no change in orignal value
        //swap
//        int a = 20 ;
//        int b = 10;
//        swap(a,b);
//        System.out.println(a + " "  + b); // orignal value is not changed because copy of the value is send to the meathod
        int[] nums = {1,2,3};
        changeArray(nums);
        System.out.println(nums[0]);
    }
}
