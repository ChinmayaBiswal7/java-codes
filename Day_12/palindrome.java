package Day_12;

public class palindrome {

    int rev = 0;

    int reverse(int n){

        if(n == 0){
            return rev;
        }

        rev = rev * 10 + n % 10;

        return reverse(n / 10);
    }

    boolean palindromeCheck(int n){

        int reversed = reverse(n);

        return n == reversed;
    }

    public static void main(String args[]){

        palindrome p = new palindrome();

        int n = 121;

        System.out.println(p.palindromeCheck(n));
    }
}