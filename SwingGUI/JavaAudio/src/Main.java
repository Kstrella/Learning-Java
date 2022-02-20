/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;



//703083838
//Sweetcorn38

/**
 *
 * @author kevst
 */
public class Main {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scan = new Scanner(System.in);
        File file = new File("CantinaBand3.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
          
        String response = "";   
        
        while(!response.equals("Q"))
        {
            System.out.println("P = play, S = stop , R = reset, Q = quit ");
            System.out.println("Enter your choice");
            
            response = scan.next();
            response = response.toUpperCase(); 
            
            switch(response){
                case("P"): clip.start();
                break;
                
                case("S"): clip.stop();
                break;
                
                case("R"): clip.setMicrosecondPosition(0);
                break;
                
                case("Q"): clip.close();
                break;
                
                default: System.out.println("Not a valid response");
       
            }
        }
        System.out.println("Byeeeeeee!");
        
        
        
        
    }
}
