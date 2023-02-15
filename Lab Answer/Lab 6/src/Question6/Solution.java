package Question6;

public class Solution {
    public static void main(String[] args) {
        int cnt = 0;
        int start = 2;
        System.out.println("First 20 palindromic prime: ");
        while(cnt < 20) {
            if(isPalindromicPrime(start)) {
                System.out.print(start + " ");
                cnt++;
            }
            start++;
        }
        System.out.println("\nFirst 20 emirp number: ");
        start = 2;
        cnt = 0;
        while(cnt < 20) {
            if(isEmirp(start)) {
                System.out.print(start + " ");
                cnt++;
            }
            start++;
        }    
        System.out.println("");
    }
    
    public static boolean isPrime(int n) {
        for(int i = 2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
      
    public static boolean isPalindromicPrime(int n) {
        if(n == reverse(n) && isPrime(n)) return true;
        return false;
    }
    
    public static int reverse(int n) {
        int rmd = 0;
        while(n>0) {
            int temp = n%10;
            rmd = (rmd*10+temp);
            n/=10;
        }
        return rmd; 
    }
    
    public static boolean isEmirp(int n) {
        if(isPrime(n) && isPrime(reverse(n)) && !isPalindromicPrime(n)) {
            return true;
        }
        return false;
    }
}