
package com.mycompany.filescsv.manageFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private File file;  //archivo 
    private FileWriter fileWrite; //escritor 
    private BufferedWriter bufferedWrite; //buffer 

    public WriteFile(File file) throws IOException {
        this.file = file; 
        this.fileWrite= new FileWriter(file); 
        this.bufferedWrite= new BufferedWriter(fileWrite); 
    }
    
    public List <String> load(){
        String line; 
        List<String> data= new ArrayList<>(); 
        
        try{
            
        } catch(){
            
            
        }
      
        
        
        
        
        
        
        
        
    }
    
    
    
}
