package Day_17;

public class print_recss {
    static void print(int n){
        if(n<=0){
            return ;
        }
        System.out.println("Name");
        n--;
        print(n);
    }
    public static void main(String args []){
        print(5);
    }
}
