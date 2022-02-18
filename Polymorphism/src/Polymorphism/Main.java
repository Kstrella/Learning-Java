/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author kevinestrella
 */


public class Main {
    
    
    
    
    
    public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//The ability of an object to identify as more than one data type
		
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();
		 // we want an array but array of what?
                //we can call this object instead 
		Vehicle[] racers = {car,bike,boat};
		
                 //instead of
                 //    car.go();
                 //    bike.go();
                 //    boat.go();
    
                  //we can make an enhanced for loop
                //for every string index in Vehicle (:) out array of racers 
		for(Vehicle x : racers) {
			x.go();
		}
		
	}
    
    
    
}
