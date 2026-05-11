package Day_13;

public class gcd {
     int g(int a,int b){
        while(b!=0){
            int oldb = b;
            b = a%b;
            a = oldb;
        }
        int ans = a;
        return ans;
    }
    public static void main(String args []){
        gcd n = new gcd();
        System.out.println(n.g(12,4));
    }
}
