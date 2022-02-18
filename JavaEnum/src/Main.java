/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */


enum Planet{
    
    //list things in upper case
    
  
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    JUPITER(5),
    MARS(4),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);
    
    int number;
    
    Planet(int number){
        this.number = number;
    }
    
}

public class Main {
    
    public static void main(String[] args){
        // enum =enumerated(orderd listing of items in a collection)
        //grouping (listing) of constants that behave similarly to objects
        
        Planet myPlanet = Planet.EARTH;
        
        canILiveHere(myPlanet);
        
    }
    
    static void canILiveHere(Planet myPlanet){
        
        switch(myPlanet){
            case EARTH:
                System.out.println("You can live here");
                System.out.println("This is planet number "+myPlanet.number);
                break;
                
            default:
                System.out.println("You cant live here......yet");
                System.out.println("This is planet number "+myPlanet.number);
                break;
        }
        
    }
}
