package Day_3;
import java.util.*;

public class duplicate_element {
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
               
              for(int i =0 ; i<arr.length;i++){
    
                  for(int j =i+1;j<arr.length;j++){
    
                        if(arr[i]==arr[j]){
    
                            System.out.println("The duplicate element is: " + arr[i]);
                      } 
                 }

            }
        }

      public static void main(String [] args){

        duplicate_element obj = new duplicate_element();
        obj.input();
        obj.finding();
    
    }
}

