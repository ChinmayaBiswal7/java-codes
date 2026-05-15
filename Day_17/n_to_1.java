package Day_17;

public class n_to_1 {
    static void print(int n){
        
        if(n<1){
            return ;
        }
        System.out.println(n);
        n--;
        print(n);
    }
    public static void main (String args []){
        print(10);
    }
}
