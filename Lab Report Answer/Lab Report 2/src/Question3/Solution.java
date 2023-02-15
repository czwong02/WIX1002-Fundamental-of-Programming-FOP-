
package Question3;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sampleInput = input.nextLine();
    sampleInput = sampleInput.replace("\"", "");
    sampleInput = sampleInput.replace(" ", "");
    
    String[] array = sampleInput.split(",");
    
    String[] word = array[0].split("=");
    String s = word[1];
    
    String[] Num = array[1].split("=");
    int k = Integer.parseInt(Num[1]);
    
    int sum = 0, count = 0;
    int[] counter = new int[3];
    int[] digit = new int[s.length()];
    int[] temp = new int[s.length()];
    
    
for(int i=0;i<digit.length;i++){
            digit[i] = s.charAt(i)-48;          
            if(digit[i]==15){
	    //take a note which number has '?' symbol, and save in an array call counter
                counter[count] = i;       
                count ++ ;
            }
            if(digit[i]==15 && i!=0){
    //because all positions that have '?' symbol will change to 0~9,except the position at the 
//    first one(0)
                digit[i] = 0;                     
      }
            if(digit[0]==15){
    //because all position that has '?' symbol will change to 0~9,except the position at the 
    //first one(0)
                digit[0] = 1;               
            }
//save the number by using a new integer array to become a backup,it is used later 
            temp[i] = digit[i];             
        }
        
        switch(count){
//means has one '?' only
            case 1:                                 
    //indicate the '?' is the first position or not
                if(counter[0] != 0){                
                    for(int l=0;l<=9;l++){
 //counter[0] because it has only one '?',and then it no need to change to the 
//original value inside temp,because it has only one '?'.
                        digit[counter[0]] = l;     
                        sum += Find(digit,k);
                    }
                }
                else{
                    for(int l=1;l<=9;l++){
//counter[1] because it has only one '?',and then it no need to change to the 
//original value inside temp,because it has only one '?'.
                        digit[counter[0]] = l;      
                        sum += Find(digit,k);
                    }
                }
                break;

            //means has two '?' only
            case 2:                                 
    //indicate the '?' is the first position or not
                if(counter[0] != 0){                
                    for(int j=1;j<=9;j++){
                        for(int l=0;l<=9;l++){
//counter[1] because its maximum has two '?',counter[1] will only run 0~9,because it is not first position
                            digit[counter[1]] = l;  
                            sum += Find(digit,k);
                        }
//to return back the value counter[1] to the original (array temp) that has been 
//saved already before
                        digit[counter[1]] = temp[counter[1]]; 
//counter[0] = j,because it will run 1~9,because its original is 0,just change the 
//value to j for the next looping
                        digit[counter[0]] = j;      
                    }
                }
                else{
                    for(int j=2;j<=9;j++){
                        for(int l=0;l<=9;l++){
//counter[1] because its maximum has two '?',counter[1] will only run 
//0~9,because it is not first position
                            digit[counter[1]] = l;  
                            sum += Find(digit,k);
                        }
                        digit[counter[1]]=temp[counter[1]]; 
//counter[0] = j,because it will run 1~9,because its original is 1,just change the //value to j for the next looping
                        digit[counter[0]] = j;      
                    }
                }
                break;
                
//means has three '?' only
            case 3:
    //indicate the '?' is the first position or not                                 
                if(counter[0] != 0){                
                    for(int i=1;i<=10;i++){
                        for(int j=1;j<=10;j++){
                            for(int l=0;l<=9;l++){
			//counter[2]because its maximum has three '?', counter[2] will only 
//run 0~9,because it is not first position
                                digit[counter[2]] = l;  
                                sum += Find(digit,k);
                            }
//to return back the value counter[2] to the original (array temp) that has been //saved already before
                            digit[counter[2]] = temp[counter[2]];   
//counter[1] = j,because it will run 1~9,because its original is 0,just change the //value to j for the next looping
                            digit[counter[1]] = j;                  
                        }
 //to return back the value counter[1] to the original (array temp) that has been 
//saved already before
                    digit[counter[1]] = temp[counter[1]];  
//counter[0] = i,because it will run 2~9,because its original is 1,just change the 
//value to j for the next looping
                    digit[counter[0]] = i;                  
                }
                }
                else{
                    for(int i=2;i<=10;i++){
                        for(int j=1;j<=10;j++){
                            for(int l=0;l<=9;l++){
		        //if yes,the first value becomes 1
                                digit[counter[2]] = l;              
                                sum += Find(digit,k);
                            }
                            digit[counter[2]]=temp[counter[2]];
    //counter[1] will only run 0~9,because it is not first position
                            digit[counter[1]] = j;  
                        }
                        digit[counter[1]]=temp[counter[1]];
 //counter[0] = j,because it will run 1~9,because its original is 1,just change the //value to j for the next looping
                        digit[counter[0]] = i;                 
                    }
                }
                break;
        }
        //Output
        System.out.println("Sample output\n"+sum);
    }
    //create a method to find the total number of numbers formed which are divisible by k.
    public static int Find(int[]j,int a){
        //initialize variable needed
        int sum = 0,k = 1,total = 0;
        int[]l = new int[j.length];
        
        for(int i=0; i<l.length;i++){
            l[i] = j[i];
        }
        
        //form a number from the integer array by using multiply with number and power of i
        for(int i=1;k<=l.length;i*=10,k++){
            l[l.length-k] = l[l.length-k] * i;
            sum =  sum + l[l.length-k];
        }
        //Detect the number can be divided by 2 or not
        if(Total(sum,a)){
            total = 1;
        }
        return total;
    }
    //create a method Total to detect the number can be divided by 2 or not
    public static boolean Total(int s,int k){
        boolean total = false;
        int a = s;
        if(a%k==0){
            total = true;
        }
        return total;
    }   
}
