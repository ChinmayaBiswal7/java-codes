package Day_16;

public class elemnt_mul_10 {
   
    int [] multiply(int arr[]){
        for(int i = 0;i<arr.length;i++){
             arr[i] = arr[i]*10 ;
        }
        
        return arr ;
    }
    public static void main(String args []){
        int arr [] = {1,2,3,4,5,6};
        elemnt_mul_10 a = new elemnt_mul_10() ;
        a.multiply(arr);
        for(int x : arr){
            System.out.println(x);
        }
    }
}


