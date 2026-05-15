package Day_17;

public class linear_print {
    static int i = 1;
    static void print(int n){
        
        if(i > n){
            return ;
        }
        System.out.println(i);
        i++;
        print(n);
    }
    public static void main (String args []){
        print(10);
    }
}
