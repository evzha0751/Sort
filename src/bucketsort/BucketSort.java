/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucketsort;

import java.util.*;
public class BucketSort {

    public static void BucketSort(int[] a,int max,int min){
        String listOutput = "";
        int bucketCount =10;
        int size = (max-min)/10+1;
        //Creat a list of bucket 
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for(int i=0;i<bucketCount;i++)
        bucket.add(new ArrayList<>());
        //Add the numbers to the buckets
        for (int i=0; i<a.length; i++){
            int x = (a[i]-min)/size; 
           bucket.get(x).add(a[i]);
        }
        System.out.println("");
        
        //Sort each bucket and add to output
        for (int i=0;i<bucketCount;i++){
           Collections.sort(bucket.get(i));
           for(int j=0;j<bucket.get(i).size();j++){
               listOutput += ((bucket.get(i).get(j))+" ");
           }
        }
        //Print out the output
        System.out.println(listOutput);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,max= Integer.MIN_VALUE,min= Integer.MAX_VALUE;
        System.out.println("Please enter the number of elements");
        number = input.nextInt();
        int[] num = new int[number];
        int inputNumber,x;
        
        //Get thee max value and min value of the array
        for(int i=0;i<number;i++){
            inputNumber = input.nextInt();
            if(inputNumber>max){
                max = inputNumber;
            }if(inputNumber<min){
                min = inputNumber;
            }
            num[i]=inputNumber;
        }
        
        
        //Print out the array before sorted
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
        BucketSort(num,max,min);
    }
    
}