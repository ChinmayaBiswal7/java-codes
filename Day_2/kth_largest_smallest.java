package Day_2;
import java.util.*;

public class kth_largest_smallest {
    int [] arr;
    int k;


           void input(){
                  
                  Scanner sc = new Scanner(System.in);
                  int size;
            
                  System.out.println("Enter the size of array");
                   size = sc.nextInt();
                   arr = new int[size];

                   for(int i = 0; i<size;i++){
                   System.out.println("Enter the "+ i + "element");
                   arr[i] = sc.nextInt();
                   }

                  System.out.println("Enter the value of k");
                   k = sc.nextInt();
                   
                   sc.close();
                }
            void finding(){

            int temp;

           for(int i =0 ; i<arr.length;i++){

              for(int j =i+1;j<arr.length;j++){

                     if(arr[i]<arr[j]){

                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]= temp;
                    }
                    
                }
                if(i==k-1){
                    System.out.println("The kth largest element is: " + arr[i]) ;
                   }
            }
              

           }
     public static void main(String [] args){

        kth_largest_smallest obj = new kth_largest_smallest();
        obj.input();
        obj.finding();
    
    }


}
