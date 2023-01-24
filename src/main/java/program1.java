import java.util.Arrays;

public class program1 {
    public static int findMax(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return  max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int findAverageValue(int[] arr){
        int averageValue = 0;
        for(int i = 0; i < arr.length; i++) averageValue += arr[i];
        averageValue /= arr.length;
        return averageValue;
    }

    public static void main(String[] args){
        int size = 20;
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*300);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное число: " + Integer.toString(findMax(arr)));
        System.out.println("Минимальное число: " + Integer.toString(findMin(arr)));
        System.out.println("Среднее значение: " + Integer.toString(findAverageValue(arr)));
    }
}
