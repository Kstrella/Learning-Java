/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinestrella
 */

import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Main {
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        //array list to hole all our cards
        ArrayList<JLabel> deck = new ArrayList<JLabel>();
        
        //long way of adding a card(J clubs)
        //we would have to do all of this for every card
        /*
        ImageIcon JC = new ImageIcon("src\\cards\\1.png");
        JLabel JClabel = new JLabel(JC);
        deck.add(JClabel);
        frame.add(deck.get(0));
        */
        
        //we can do the above using a nameless object
        /*
        deck.add(new JLabel(new ImageIcon("src\\cards\\1.png")));
        frame.add(deck.get(0));
        */
        //now to add all the cards(we name all the cards with numbers and for loop)
       for(int i =1;i<=52;i++) {
	deck.add(new JLabel(new ImageIcon("src\\cards\\"+i+".png")));
	frame.add(deck.get(i-1));
		}
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
    
}
