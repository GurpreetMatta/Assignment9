/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import au.com.bytecode.opencsv.CSVWriter;
import java.util.List;
/**
 *
 * @author Gurpreet Singh
 */
public class miniproject {
   public static void main(String a[])
   {
       
                     File cd = new File("."); // current directory
		displayDirectoryContents(cd);
        
   }
	
	public static void displayDirectoryContents(File dir) {
		try {
                    List<String> al1=new ArrayList<String>();
	           
		File[] f = dir.listFiles();
		 FileWriter outputfile = new FileWriter("G:\\Netbeams Project Folder\\AcadView Assignment\\src\\assignment9\\abc.csv"); 
                         CSVWriter writer = new CSVWriter(outputfile); 
                                            	
                for (File file : f) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath()); 
					displayDirectoryContents(file); 
                                       al1.add(file.getCanonicalPath());
                                    
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
                                      al1.add(file.getCanonicalPath());
				}
		
                }
                
                String [] str=new String[100]; 
                 List<String[]> li=new ArrayList<String[]>();
              int i;
              for(i=0;i<al1.size();i++)
              {
                  str[i]=al1.get(i);
                                    
              }
              for(i=0;i<al1.size();i++)
              {
                  li.add(str);
              }
              
              writer.writeAll(li);
                writer.close(); 
		} catch (Exception e) {
			e.getMessage();
		}
               
              
	}
}
