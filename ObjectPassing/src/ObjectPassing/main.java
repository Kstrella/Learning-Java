/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassing;

/**
 *
 * @author kevinestrella
 */
public class main {
    
    public static void main(String[] args)
    {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Tesla");
        
        garage.park(car);
        garage.park(car2);
    }
    
}
