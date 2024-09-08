package classes;
import interfage.*;
import data.*;
import images.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Forget {
    protected void ResetPassword(String File,String ID, String Password)throws IOException{
     

            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + ID)) {
                    line=lines[i+2];
                    found = true;
                    // int index = line.indexOf("Password :") + "Password :".length();
                    // int endIndex = line.indexOf("\n", index);
                    String oldPassword = line.substring(10);
                    line = line.replace(oldPassword, Password);
                    lines[i+2] = line;
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

            protected String readFile(String file) throws IOException {
                StringBuilder content = new StringBuilder();
             
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                }
             
                return content.toString();
            }
             
            protected void writeFile(String file, String content) throws IOException {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write(content);
                }
            }
        
                   
}

