package Day_16;

public class pow_2_bitwise {
    public static void main(String args []){
        int n =18;
        int count = 0;
        while(n!=0){
            if((n&1)!=0){
                count ++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
