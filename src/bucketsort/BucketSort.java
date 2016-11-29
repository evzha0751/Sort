/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucketsort;

import java.util.*;
public class BucketSort {

    public static void BucketSort(int[] a,int max){
        int[] bucket = new int[max+1];
        
        for(int i=0;i<bucket.length;i++){
            bucket[i] = 0;
        }
        
        for(int i=0;i<a.length;i++){
            bucket[a[i]]++;
        }
        
        int num1=0;
        for(int i=0;i<bucket.length;i++){
        for(int j=0;j<bucket[i];j++){
            a[num1]=i;
            num1++;
        }
    }
        
        System.out.println("");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,max= Integer.MIN_VALUE,min= Integer.MAX_VALUE;
        System.out.println("Please enter the number of array");
        number = input.nextInt();
        int[] num = new int[number];
        int inputNumber,bucketNumber;
        
        for(int i=0;i<number;i++){
            inputNumber = input.nextInt();
            if(inputNumber>max){
                max = inputNumber;
            }
            num[i]=inputNumber;
        }
        
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        BucketSort(num,max);
    }
    
}
