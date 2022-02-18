
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */
public class MyFrame extends JFrame {
    
    MyFrame(){
         
    
        this.setTitle("JFrame title goes here");
        
        
        //closes application when you exit
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //This doesnt let us resize the window
        this.setResizable(false);
        
        //this sets the x and y demension
        this.setSize(420,420); 
        
        //this makes the this visible
        this.setVisible(true);
        
        
        //this changes icon of this
        ImageIcon image = new ImageIcon("Pika.jpg"); 
        //changes it to the custom pic
        this.setIconImage(image.getImage());
        ////////////////////////////////////////////////////////////////
        
        //how to change background color of this
        //this.getContentPane().setBackground(Color.green);
        //has some pre set color but you can make a custom one        
        ///////////////////////////////////////////////red,green,blue 255 is max
        this.getContentPane().setBackground(new Color(123,50,250));
    }
     
    

    
}
