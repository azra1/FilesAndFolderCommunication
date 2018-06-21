/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesandfoldercommunication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Azra
 */
public class RecievingFiile {
    static void recieveFile()
    {
        List<String> results=new ArrayList<String> ();
        ReadingFile rf= new ReadingFile();
        results=rf.PrintFile();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
         try{
    // Create file 
            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            Iterator<String> itr = results.iterator();
            while(itr.hasNext()){
            out.write(dtf.format(now)+" "+itr.next());
            out.append(System.lineSeparator());
    //Close the output stream
            }out.close();
        }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
    }
    
}
