package classes;
import interfage.*;
import data.*;
import images.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class OwnerInfoUpdate {
    OwnerInfoUpdate(){}
 
    OwnerInfoUpdate(String Name,String Number,String Email) throws IOException{
 
           ResetNumber("data\\OwnerInfo.txt", Name, Number);
           ResetEmail("data\\OwnerInfo.txt", Name, Email);
           
         
    }
 
    private void ResetNumber(String File,String Name,String Number)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+3];
                    found = true;
                    String oldNumber = line.substring(14);
                    line = line.replace(oldNumber,Number );
                    lines[i+3] = line;
                    break;
                }
            }
         
            if (found) {
                content = String.join("\n", lines);
                writeFile(File, content);
            } else {
                System.out.println("User not found");
            }
           
        }
         private void ResetEmail(String File,String Name,String Email)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+1];
                    found = true;
                    String oldEmail = line.substring(7);
                    line = line.replace(oldEmail,Email);
                    lines[i+1] = line;
                    break;
                }
            }
         
            if (found) {
                content = String.join("\n", lines);
                writeFile(File, content);
            } else {
                System.out.println("User not found");
            }
           
        }
 
       
       
 
         
 
   
      String readFile(String file) throws IOException {
                StringBuilder content = new StringBuilder();
             
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                }
             
                return content.toString();
            }
             
             void writeFile(String file, String content) throws IOException {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write(content);
                }
            }
 
        }
 
 
   
 