
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */

//stacking componenets on a gui frame
public class Main {
     public static void main(String[] args)
     {
         
         //JLayeredPane = swing container that provides a thirs dimension 
         //for positioning componente, gives a z index
         
         JLabel label1 = new JLabel();
         label1.setOpaque(true);
         label1.setBackground(Color.red);
         label1.setBounds(50,50,200,200);
         
         JLabel label2 = new JLabel();
         label2.setOpaque(true);
         label2.setBackground(Color.green);
         label2.setBounds(100,100,200,200);
         
         JLabel label3 = new JLabel();
         label3.setOpaque(true);
         label3.setBackground(Color.blue);
         label3.setBounds(150,150,200,200);
         
         JLayeredPane layeredPane = new JLayeredPane();
         layeredPane.setBounds(0,0,500,500);
         
         
         
         
         //adding labels to pane
         /*
         layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
         layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
         layeredPane.add(label3,JLayeredPane.DRAG_LAYER);
         */
         
         //or we can do it like this. Higher the layer number the higher the layer using , Integer.valueOf(0)
         layeredPane.add(label1, Integer.valueOf(0));
         layeredPane.add(label2, Integer.valueOf(2));
         layeredPane.add(label3, Integer.valueOf(1));
         
        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
         
     }

}
