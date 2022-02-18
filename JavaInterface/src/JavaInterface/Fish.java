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
//to implement 2 interfaces we just use a comma
public class Fish implements Prey,Predator {

    @Override
    public void flee() {
        System.out.println("The fish is fleeing from a larger fish");
    }

    @Override
    public void hunt() {
        System.out.println("the fish is hunting smaller fish");
    }
    
}
