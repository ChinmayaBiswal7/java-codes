package Day_13;

public class lcm {
    int l(int a,int b){
        int x =a ;
        int y = b;
        while(b!=0){
            int oldb = b;
            b = a%b;
            a = oldb;
        }
        int ans = a;
        return (x*y)/ans;
    }
    public static void main(String args []){
        lcm n = new lcm();
        System.out.println(n.l(12,4));
    }
}
