/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author kevinestrella
 */
public class OverloadedMethods {
    //overloaded methods = methods with same names but diff peramters
    //method name + perameters = method signature
    
public static void main(String[] args)
{
    int x = add(1,2);
    System.out.println(x);
    
    int y = add(1,2,3);
    System.out.println(y);
    
    int z = add(1,2,3,4);
    System.out.println(z);
    
    double a = add(1.0,2.0);
    System.out.println(x);
    
    double b = add(1.0,2.0,3.0);
    System.out.println(y);
    
    double c = add(1.0,2.0,3.0,4.0);
    System.out.println(z);
    
}
    
    public static int add(int a,int b){
        System.out.println("Overload 1");

return a+b;

}
    
    public static int add(int a,int b,int c){
        System.out.println("Overload 2");

return a+b+c;

}
    
     public static int add(int a,int b,int c,int d){
         System.out.println("Overload 3");

return a+b+c+d;

}
     
      public static double add(double a,double b){
        System.out.println("Overload 5");

return a+b;
}
      
            public static double add(double a,double b,double c){
        System.out.println("Overload 6");

return a+b+c;
}
            
                  public static double add(double a,double b,double c, double d){
        System.out.println("Overload 7");

return a+b+c+d;
}
      

                  
                  
                  
                  
                  
}
      
      


     

    

