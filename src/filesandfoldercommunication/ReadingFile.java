package filesandfoldercommunication;


import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azra
 */
public class ReadingFile {
    static List PrintFile() 
     {
        
        String maindirpath = "C:\\Users\\Azra\\Desktop\\Sixth sem";
        List<String> results = new ArrayList<String>();
        File[] files = new File(maindirpath).listFiles();
        for (File file : files) {
        if (file.isFile()) {
        results.add(file.getName());
        
    
    
 } 
}
        return results; 
}
}
