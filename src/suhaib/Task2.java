/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhaib;

/**
 *
 * @author Suhaib Alqadasi
 */
public class Task2 {
//Reverse.
        public static  void rev(int[] x)
        {
            int j=0;
            int[] z=new int[x.length];
            for (int i=1-x.length;i>=0;i--)
            {
                z[j]=x[i];
                System.out.println(z[j]);
                j++;
            }
        }
        
   // backup 
    public static void backup(int[] x)
        {
            int[] y= new int[x.length];
            
            for(int i=0;i<x.length;i++){
                y[i]=x[i];
                System.out.println(y[i]);
            }
        }
    
    //remove 
    public static void remove(int[] x,int index){
        for(int i=0;i<x.length;i++)
        {
            if(index<x.length)
            {
                x[index]=0;
               
            }
              
        }
    }
    public static void main(String[] args) {
        
        int[] x={10,20,30};
     rev(x);
       backup(x);
        remove(x,1);
                      
    }
    
}
