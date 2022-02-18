/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiersP2;

/**
 *
 * @author kevinestrella
 */

//public = seen by all packages in project folder
//protected = accessable to different class in different package is a sub class of the class that has the protected in it
//privite = only seen by class that contains itself so only class B will have 
//default = only seen by classes in the same package

public class C {
    
     String defaultMessage = "This is the default";
     public String publicMessage = "This is public";
     
     protected String protectedMessage = "This is protected";
     private String privateMessage = "This is private";
    
}
