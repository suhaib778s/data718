/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhaib2;

/**
 *
 * @author Suhaib Al-Qadasi
 */
public class Task3 { 
    public static void repeatedOne(int[] arr)
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
                return;
            }
        }
    }
    
    //  repeated numbers 
    public static void repeatedFive(int[] arr)
    {
        int counter=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                
                System.out.println(arr[i]);
                counter++;
                if(counter==5)
                    return;
            }
        }
    }
    
    // add element 
    public static void add(int[] arr,int s)
    {
        System.out.println(arr.length);
        
        arr[arr.length]=s;
    }

    
    
    public static void main(String[] args)
    {
        int[] x={2,5};
       
         
        
    }
    
}
