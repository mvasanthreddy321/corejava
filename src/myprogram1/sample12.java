package myprogram1;

import java.util.Scanner;

public class sample12 {  
    
    public static void main(String[] args) {  
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
         
        int [] fr = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                   
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
       
        System.out.println("---------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("---------------------");  
    }  
}  

/*2.Write a program to construct an array with 10 elements and to find the number of    
occurrences of each element in the Array.*/