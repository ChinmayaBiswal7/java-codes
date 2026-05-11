package Day_13;

public class perfect_no {
    int sum = 0;
    void find(int n){
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("Perfect no");
        }
        else{
            System.out.println("Not perfct");
        }
    }
    public static void main(String args []){
        perfect_no p = new perfect_no();
        p.find(8);
    }
}
