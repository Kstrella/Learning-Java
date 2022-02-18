/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKeyWord;

/**
 *
 * @author kevinestrella
 */
public class Hero extends Person {
    
    String power;
    
    Hero(String name,int age,String power)
    {
        //super refers to the parent class person
        super(name,age);
        this.power=power;
    }
         
     public String toString(){
        
        return super.toString()+this.power;
    }
    
}
