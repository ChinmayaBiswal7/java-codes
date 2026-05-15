package Day_17;

public class shift_by_k {
    
    static void shift(int arr [],int k){
        int [] a = new int[k];
        for(int i =0;i<=k;i--){
            a[i] =arr[arr.length -k+i];
        }

        for(int i = arr.length-1;i>0;i--){
            arr[i]=arr[i-k];
        }
        for(int i =0;i<=k;i++){
            arr[i]=a[i];
        }
        
    }
    public static void main (String args []){
        int arr [] = {1,2,3,4,5,6};
        shift(arr,2);
    }
}


