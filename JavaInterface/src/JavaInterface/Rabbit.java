/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterface;

/**
 *
 * @author kevinestrella
 */
//we write implements so that we can use the interface for the class
public class Rabbit implements Prey {

    @Override
    public void flee() {
        
        System.out.println("The rabbit is fleeing");
    }
    
}
