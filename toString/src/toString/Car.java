/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

/**
 *
 * @author kevinestrella
 */


public class Car {


 String make = "Ford";
 String model = "Mustang";
 String color = "red";
 int year = 2021;
 
 public String toString() {
     
 //String myString = make+ "/n"+model+ "/n"+color "/n"+year; //or we can just return it
//return myString;

  return make +"\n"+model+"\n"+color+"\n"+year; //returns string representation of it all

 } 
}


