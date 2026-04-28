package Day_1;
import java.util.*;
import java.io.*;

class min_max{

    int [] arr;

void input(){
  int size;
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter size of array\n");
  size = sc.nextInt();

   arr = new int[size];

   for(int i = 0;i<size;i++){

     System.out.println("Enter the " + i + " element" );
     arr[i] = sc.nextInt();
}

   
}
void Max(){

       int max = arr[0];
       for(int i=0;i<arr.length;i++){

          if(arr[i]>max){
   
            max=arr[i];
         }
      
    } 
    System.out.println("Max is "+max);
}


 void Min(){

       int min = arr[0];
       for(int i=0;i<arr.length;i++){

          if(arr[i]<min){
   
            min=arr[i];
         }
      
    }
    System.out.println("Min is "+min);
}

  public static void main(String [] args){

     min_max obj = new min_max();
     obj.input();
     obj.Max();
     obj.Min();
     
  }
}






