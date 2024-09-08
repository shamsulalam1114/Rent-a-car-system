package classes;
import interfage.*;
import data.*;
import images.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerInfoUpdate {
    CustomerInfoUpdate(){}

    CustomerInfoUpdate(String Name,String Phone,String Email,String Nid,String Gender) throws IOException{

           ResetEmail("data\\CustomerInfo.txt", Name, Email);
           ResetPhone("data\\CustomerInfo.txt", Name, Phone);
           ResetNid("data\\CustomerInfo.txt", Name, Nid);
           ResetGender("data\\CustomerInfo.txt", Name, Gender);
         
    }

    private void ResetPhone(String File,String Name,String Phone)throws IOException{
     

            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+3];
                    found = true;
                    String oldPhone = line.substring(7);
                    line = line.replace(oldPhone,Phone );
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

         private void ResetNid(String File,String Name,String Nid)throws IOException{
     

            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+4];
                    found = true;
                    String oldNid = line.substring(5);
                    line = line.replace(oldNid,Nid);
                    lines[i+4] = line;
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

          
             private void ResetGender(String File,String Name,String Gender)throws IOException{
     

            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+7];
                    found = true;
                    String oldGender = line.substring(8);
                    line = line.replace(oldGender,Gender );
                    lines[i+7] = line;
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
