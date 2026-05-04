package Day_6;
import java.util.*;

public class even_odd {
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
        int Even_sum = 0;
        int Odd_sum = 0;

        System.out.println("Even numbers in the array are: ");
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
                Even_sum=Even_sum+i;
            }
        }

        System.out.println("Sum of even numbers is "+ Even_sum);

        System.out.println("\nOdd numbers in the array are: ");
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]%2!=0){
            
                System.out.print(arr[i] + " ");
                Odd_sum = Odd_sum + i;
            }
        }
        System.out.println("Sum of odd number is "+ Odd_sum);
    }

    public static void main(String [] args){

        even_odd obj = new even_odd();
        obj.input();
        obj.finding();
    
    }
        
}