/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayOfObjects;

/**
 *
 * @author kevinestrella
 */
public class main {
    public static void main(String[] args){
        //how is usually done for normal array
        //we need to make an array of objects. its in food
        /*
        int[]numbers = new int[3];
        char[] characters = new char[4];
        String[] string = new String[5];
*/
        /*
        Food[] fridge = new Food[3];//fridge that can gold 3 food items
        
        Food food1= new Food("pizza"); //next we set up constructor in food class
        Food food2= new Food("burger");
        Food food3= new Food("hotdog");
        
        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;
        */
        ////OR WE CAN DO IT LIKE THIS
        Food food1= new Food("pizza"); 
        Food food2= new Food("burger");
        Food food3= new Food("hotdog");
        
        Food[] fridge = {food1,food2,food3};
        
        
        
        System.out.println(fridge[0]);//prints adress
        System.out.println(fridge[0].name);//prints name
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);

    }
}
