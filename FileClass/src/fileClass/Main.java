/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileClass;

import java.io.File;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    public static void main(String[] args)
    {
        //file = An abstract representation of file and directory pathnames
        
        File file = new File("Message.txt");//OR you can put location directory
        
        if(file.exists())
        {
            System.out.println("that file exists 0w0");
            System.out.println(file.getPath());//gets file name 
            System.out.println(file.getAbsolutePath());//gets location of file on computer
            System.out.println(file.isFile());//if the file is a file it returns true
            file.delete();//deletes file by name or by path
        }else{
            System.out.println("FILE DNE :(");
        }
    }
    
}
