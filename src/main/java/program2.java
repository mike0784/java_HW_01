import java.util.Arrays;

public class program2 {
    public static void main(String[] args){
        int size = 10;
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
