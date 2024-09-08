package classes;
import interfage.*;
import data.*;
import images.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
import javax.swing.JOptionPane;
 
public class NameException {
    public boolean OwnerNameException(String Id){
          try (BufferedReader br = new BufferedReader(new FileReader("data\\OwnerInfo.txt"))){
       
         String line;
     
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
             
             
                if (line.replace("-", "").isEmpty()) {
                    System.out.println("inside line if");
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 7) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        if (storedUsername.equals(Id) ) {
                          JOptionPane.showMessageDialog(null, "Name Already Taken, Please Fill Up All The Fields Correctly", "Message", JOptionPane.CANCEL_OPTION);
                          return false;
                        }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                }} else {
                    userInfoBuilder.append(line).append("\n");
                    System.out.println("inside line else ");
                }    
 
            }
        }
         catch (IOException e) {
           System.out.println("FIle not found");
        }
        return true;
     
    }
 
     public boolean CustomerException(String Id){
          try (BufferedReader br = new BufferedReader(new FileReader("data\\CustomerInfo.txt"))){
       
         String line;
     
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
             
             
                if (line.replace("-", "").isEmpty()) {
                 
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 8) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        if (storedUsername.equals(Id) ) {
                          JOptionPane.showMessageDialog(null, "Name Already Taken, Please Fill Up All The Fields Correctly", "Message", JOptionPane.CANCEL_OPTION);
                          return false;
                        }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                }} else {
                    userInfoBuilder.append(line).append("\n");
           
                }    
 
            }
        }
         catch (IOException e) {
           System.out.println("FIle not found");
        }
        return true;
     
    }
 
     public boolean DriverException(String Id){
          try (BufferedReader br = new BufferedReader(new FileReader("data\\DriverInfo.txt"))){
       
         String line;
     
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
             
             
                if (line.replace("-", "").isEmpty()) {
                 
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 14) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        if (storedUsername.equals(Id) ) {
                          JOptionPane.showMessageDialog(null, "Name Already Taken, Please Fill Up All The Fields Correctly", "Message", JOptionPane.CANCEL_OPTION);
                          return false;
                        }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                }} else {
                    userInfoBuilder.append(line).append("\n");
           
                }    
 
            }
        }
         catch (IOException e) {
           System.out.println("FIle not found");
        }
        return true;
     
    }
 
     public boolean AdminException(String Id){
          try (BufferedReader br = new BufferedReader(new FileReader("data\\AdminInfo.txt"))){
       
         String line;
     
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
             
             
                if (line.replace("-", "").isEmpty()) {
                 
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 2) {
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        if (storedUsername.equals(Id) ) {
                          JOptionPane.showMessageDialog(null, "Name Already Taken, Please Fill Up All The Fields Correctly", "Message", JOptionPane.CANCEL_OPTION);
                          return false;
                        }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                }} else {
                    userInfoBuilder.append(line).append("\n");
           
                }    
 
            }
        }
         catch (IOException e) {
           System.out.println("FIle not found");
        }
        return true;
     
    }
}
 
