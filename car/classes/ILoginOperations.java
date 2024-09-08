package interfage;
public interface ILoginOperations {
     public boolean matchAdmin(String id, String pass);
     public boolean matchOwner(String id, String pass); 
     public boolean matchDriver(String id, String pass); 
     public boolean matchCustomer(String id, String pass);
    
}
