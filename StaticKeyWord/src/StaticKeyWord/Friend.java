/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyWord;

/**
 *
 * @author kevinestrella
 */
public class Friend {
    
    String name;
    static int numberOfFriends;
    
    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
    
    static void displayFriends(){
        System.out.println("YOu have "+numberOfFriends+" friends in a string");
    }
    
}
