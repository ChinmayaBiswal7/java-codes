package Day_16;

public class arr_avg {
    float average(int arr[]){
        float sum = 0 ;
        float avg = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i] ;
        }
        avg = sum /arr.length;
        return avg ;
    }
    public static void main(String args []){
        int arr [] = {1,2,3,4,5,6};
        arr_avg a = new arr_avg() ;
        System.out.println(a.average(arr));
    }
}
