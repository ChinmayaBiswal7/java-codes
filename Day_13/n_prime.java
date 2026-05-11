package Day_13;

public class n_prime {
    int count = 0;
    void find(int n){
        for(int i=1;i<=n;i++){
            count = 0;
            for(int j =1;j<=i;j++){
                if(i%j==0){
                    count ++;
                }
            }
            if(count ==2 ){
                System.out.println(i);
            }
        }
    }
    public static void main(String args []){
        n_prime np = new n_prime();
        np.find(10);
    }
}
