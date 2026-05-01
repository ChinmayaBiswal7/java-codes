package Day_4;

import java.util.*;

public class first_duplicate {
    int [] arr;
    int count = 0;
    


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
                    if(count>0){
                        System.out.println("The first duplicate element is: " + arr[i]);
                        break;
                    }

            }
        }

      public static void main(String [] args){

        first_duplicate obj = new first_duplicate();
        obj.input();
        obj.finding();
    
    }
}


