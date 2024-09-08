package classes;
import interfage.*;
import data.*;
import images.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class DriverInfoUpdate {
    DriverInfoUpdate(){}
 
    DriverInfoUpdate(String Name, String Experience,String VehicleType,String Rate,String Location,String Number) throws IOException{
 
           ResetExperience("DriverInfo.txt", Name, Experience);
           ResetNumber("DriverInfo.txt", Name, Number);
           ResetVehicleType("DriverInfo.txt", Name, VehicleType);
           ResetRate("DriverInfo.txt", Name, Rate);
           ResetLocation("DriverInfo.txt", Name, Location);
         
    }
 
    private void ResetExperience(String File,String Name,String Experience)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
 
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+5];
                    found = true;
                    String oldExperience = line.substring(11);
                    line = line.replace(oldExperience,Experience );
                    lines[i+5] = line;
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
 
private void ResetNumber(String File,String Name,String Number)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+1];
                    found = true;
                    String NumberStatus = line.substring(8);
                    line = line.replace(NumberStatus, Number );
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
 
 
         private void ResetVehicleType(String File,String Name,String VehicleType)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+6];
                    found = true;
                    String oldVehicleType = line.substring(6);
                    line = line.replace(oldVehicleType,VehicleType);
                    lines[i+6] = line;
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
 
         private void ResetRate(String File,String Name,String Rate)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+7];
                    found = true;
                    String oldRate = line.substring(6);
                    line = line.replace(oldRate,Rate);
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
 
         
             private void ResetLocation(String File,String Name,String Location)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Name)) {
                    line=lines[i+11];
                    found = true;
                    String oldLocation = line.substring(10);
                    line = line.replace(oldLocation, Location );
                    lines[i+11] = line;
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