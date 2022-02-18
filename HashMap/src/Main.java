/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinestrella
 */

import java.util.HashMap;
public class Main {
    
  public static void main(String[]args)
  {
      //hash map implements the MAP interface (need import)
      //Hash map is simmilar to arrayList, but with key and value pair
      //stores objects, need to use wrapper class
      //ex. (name,email),(username,userID),(Country,capital)
      
      // if an int write Intiger 
      HashMap<String,String> countries = new HashMap<String,String>();
      
      //add a key and value
      countries.put("USA", "Washington DC");
      countries.put("India", "New Delhi");
      countries.put("Russia", "Moscow");
      countries.put("China", "Bejing");
      
      //System.out.println(countries);
      
      //countries.remove("USA");
    
      //System.out.println(countries);
      
      //this gets us the value of key russia
      //System.out.println(countries.get("Russia"));
       
       //this gives os the size of hash maps
       //System.out.println(countries.size());
       
      //this clears the hash map
      //countries.clear(); 
      
      //how we find if a certain key is within the hashmap
      //System.out.println(countries.containsKey("England"));
      
      //how we find if a certain value is within the hashmap
      System.out.println(countries.containsValue("Bejing"));
      
      //this is how we replace values of the a key
      //countries.replace("USA", "Detroit");
      
     
      
      
      //countries.clear();
      
      //this is how we display all the key value pairs in a hash map
      //we use for each loop
      
      for(String i :countries.keySet()){
          System.out.print(i +"\t"+ "= ");
          System.out.println(countries.get(i));

      }
       
       System.out.println(countries);

      
  }
    
}
