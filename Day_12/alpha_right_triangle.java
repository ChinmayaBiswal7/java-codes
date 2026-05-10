package Day_12;

public class alpha_right_triangle {
   public static void main(String args[]){
    int n = 5;
    
    for(int row = 1; row<=n;row++){
        int temp = n;
        for(int col=1;col<=row;col++){
            System.out.print((char)('A'+ temp-1)+" ");
            temp --;
            
        }
        System.out.println();
    }
}
}


