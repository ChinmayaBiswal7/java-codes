package Day_5;
import java.util.*;

public class dup_once {
                int count = 0;
                int [] arr;
    
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
                   
                   sc.close();
                }

            void finding(){
               
              for(int i =0 ; i<arr.length;i++){
    
                  for(int j =i+1;j<arr.length;j++){
    
                        if(arr[i]==arr[j]){
    
                            count++;
                      } 
                 }
                    if(count==1){
                        System.out.println("The duplicate element is: " + arr[i]);
                    }

            }
        }

      public static void main(String [] args){

        dup_once obj = new dup_once();
        obj.input();
        obj.finding();
    
    }
}



