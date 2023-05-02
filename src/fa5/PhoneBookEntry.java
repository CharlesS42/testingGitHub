package fa5;
public class PhoneBookEntry {
    private String name;
    private int phoneNumber;
    
    PhoneBookEntry(String n, int phone){
        this.name = n;
        this.phoneNumber = phone;
    }
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    
    public void setPhoneNumber(int phone){
        this.phoneNumber = phone;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
}