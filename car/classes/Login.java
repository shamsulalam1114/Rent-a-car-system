package classes;
import interfage.*;
import data.*;
import images.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
import javax.swing.JOptionPane;

import interfage.*;
 
public class Login implements ILoginOperations{
   
    @Override
    public boolean matchOwner(String id, String pass) {
     
try (BufferedReader br = new BufferedReader(new FileReader("data\\OwnerInfo.txt"))){
       
         String line;
       
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
              
                if (line.replace("-", "").isEmpty()) {
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 7) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        String storedPassword = userInfo[2].split(":")[1].trim();
 
                        if (storedUsername.equals(id) && storedPassword.equals(pass)) {
                            return true;
                        }
                    }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                } else {
                    userInfoBuilder.append(line).append("\n");
                    
                    
                }
            }
        } catch (IOException e) {
           System.out.println("FIle not found");
        }
        return false;
     
    }
 
 
    @Override
    public boolean matchCustomer(String id, String pass) {
                 
        try (BufferedReader br = new BufferedReader(new FileReader("data\\CustomerInfo.txt"))){
       
         String line;
       
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
              
                if (line.replace("-", "").isEmpty()) {
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 6) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        String storedPassword = userInfo[2].split(":")[1].trim();
 
                        if (storedUsername.equals(id) && storedPassword.equals(pass)) {
                            return true;
                        }
                    }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                } else {
                    userInfoBuilder.append(line).append("\n");
                    
                    
                }
            }
        } catch (IOException e) {
           System.out.println("FIle not found");
        }
        return false;
     
    }
 
 
    @Override
    public boolean matchAdmin(String id, String pass) {
        try (BufferedReader br = new BufferedReader(new FileReader("data\\AdminInfo.txt"))){
       
         String line;
       
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
              
                if (line.replace("-", "").isEmpty()) {
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 2) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        String storedPassword = userInfo[1].split(":")[1].trim();
 
                        if (storedUsername.equals(id) && storedPassword.equals(pass)) {
                            return true;
                        }
                    }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                } else {
                    userInfoBuilder.append(line).append("\n");
                    
                    
                }
            }
        } catch (IOException e) {
           System.out.println("FIle not found");
        }
        return false;
     
    }
 
 
    @Override
    public boolean matchDriver(String id, String pass) {
        try (BufferedReader br = new BufferedReader(new FileReader("data\\DriverInfo.txt"))){
       
         String line;
       
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
              
                if (line.replace("-", "").isEmpty()) {
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 14) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        String storedPassword = userInfo[2].split(":")[1].trim();
 
                        if (storedUsername.equals(id) && storedPassword.equals(pass)) {
                            return true;
                        }
                    }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                } else {
                    userInfoBuilder.append(line).append("\n");
                    
                    
                }
            }
        } catch (IOException e) {
           System.out.println("FIle not found");
        }
        return false;
    }
    
   
   
}
