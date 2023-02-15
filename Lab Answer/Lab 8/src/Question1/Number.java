
package Question1;

import java.util.Arrays;
import java.util.Random;

public class Number {
    private int[] arr;
    private Random rmd = new Random();
    
    public Number() {
        this(10, 101);
    }
    
    public Number(int num) {
        this(num, 101);
    }
    
    public Number(int num, int limit) {
        arr = new int[num];
        for(int i = 0; i<num; i++) {
            arr[i] = rmd.nextInt(limit+1);
        }
    }
    
    public void display() {
        System.out.print("Arrays list: ");
        System.out.println(Arrays.toString(arr));
    }
    
    public void evenNumber() {
        System.out.print("Even number: ");
        for(int x : arr) {
            if(x%2==0) {
                System.out.print(x+" ");
            }
        }
        System.out.println("");
    }
    
    public void primeNumber() {
        System.out.print("Prime number: ");
        for(int x : arr) {
            if(x==0||x==1) continue;
            boolean prime = true;
            for(int i = 2; i<x; i++) {
                if(x%i==0) prime=false;
            }
            if(prime) System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public void max() {
        System.out.print("Max number: ");
        int max = Integer.MIN_VALUE;
        for(int x:arr) {
            max = Math.max(max, x);
        }
        System.out.println(max);
    }
    
    public void min() {
        System.out.print("Min number: ");
        int min = Integer.MAX_VALUE;
        for(int x:arr) {
            min = Math.min(min, x);
        }
        System.out.println(min);
    }
    
    public void average() {
        System.out.print("Average: ");
        int total = 0;
        int count=0;
        for(int x:arr) {
            total += x;
            count++;
        }
        System.out.println((double)total/count);
    }
    
    public void square() {
        System.out.print("Square number: ");
        for(int x: arr) {
            int temp = (int)Math.sqrt(x);
            if(temp*temp==x) System.out.print(x + " ");
        }
        System.out.println("");
    }
}
