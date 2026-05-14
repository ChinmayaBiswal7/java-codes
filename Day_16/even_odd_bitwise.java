package Day_16;

public class even_odd_bitwise {
    public static void main (String args []){
        int n = 11;
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
