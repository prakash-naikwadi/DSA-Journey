import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        boolean swapped = false;
        //passes
        for (int i = 0; i < arr.length; i++){
            //inner loop
            for (int j = 1; j < arr.length - i; j++){ //j will run only upto i because array is sorted upto every pass value
                if(arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped){
                break;
            }
        }
    }
}
