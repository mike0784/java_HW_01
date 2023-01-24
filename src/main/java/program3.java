public class program3 {
    public static void main(String[] args){
        int min = 2;
        int max = 100;
        boolean mask = true;
        System.out.println(Integer.toString(3/2));
        for(int i = min; i <= max; i++){
            mask = true;
            //System.out.print(Integer.toString(i));
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0) mask = false;
            }
            if(mask) System.out.print(Integer.toString(i) + " ");
        }
    }
}
