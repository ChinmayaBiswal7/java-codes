package Day_1;

import java.util.*;

class second_largest{
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
                }
            int finding(){

            int temp;

           for(int i =0 ; i<arr.length;i++){

              for(int j =i+1;j<arr.length;j++){

                     if(arr[i]<arr[j]){

                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]= temp;
                    } 
                }
            }
              return arr[1];

           }
     public static void main(String [] args){

        second_largest obj = new second_largest();
        obj.input();
        int n = obj.finding();
        System.out.println(n);

    }


}
