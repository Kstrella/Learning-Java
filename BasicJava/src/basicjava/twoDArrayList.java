/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;
import java.util.*;
/**
 *
 * @author kevinestrella
 */
public class twoDArrayList {
 public static void main(String [] args)
 {
     //2D array lists = dynamic list of listis
     
     
     //2d one
     ArrayList<ArrayList<String>> groceryList = new ArrayList();
     
     
     ArrayList<String> bakeryList = new ArrayList();
     
     bakeryList.add("Pasta");
     bakeryList.add("Garlic bread");
     bakeryList.add("Dohnuts");
     
     ArrayList<String> produceList = new ArrayList();
     
     produceList.add("tomato");
     produceList.add("pepper");
     produceList.add("lettuce");
     
     ArrayList<String> drinkList = new ArrayList();
     
     drinkList.add("soda");
     drinkList.add("coffee");
     
     groceryList.add(bakeryList);
     groceryList.add(produceList);
     groceryList.add(drinkList);
     
     

          
     
     
     System.out.println(groceryList);
      System.out.println(groceryList.get(2).get(1));
     
 }
}
