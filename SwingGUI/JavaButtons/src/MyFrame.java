
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class MyFrame extends JFrame implements ActionListener {
    
    JButton button;
    
    MyFrame(){
        
        //how to make button
        JButton button = new JButton();
        //this takes x,y,width and height
        button.setBounds(200,100,100,50);
        
        
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        //this shows button
        this.add(button);
    }

    //this listens for events
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //to see if event that occurs is our button
        
        if(e.getSource()== button){
            System.out.println("poo");
            
        }
       
      
    }

}
