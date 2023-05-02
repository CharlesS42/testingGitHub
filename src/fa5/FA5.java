package fa5;
import java.util.ArrayList;
public class FA5 {
    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> pBook = new ArrayList<PhoneBookEntry>();
        pBook.add(new PhoneBookEntry("Charles", 3440918));
        pBook.add(new PhoneBookEntry("Felix", 3907412));
        pBook.add(new PhoneBookEntry("Alex", 3431221));
        pBook.add(new PhoneBookEntry("Sabrina", 3440765));
        pBook.add(new PhoneBookEntry("Kristy", 3441518));
        for(int i=0;i<pBook.size();i++){
            System.out.println("--- Student #" + (i+1) + " ---");
            System.out.println(" Name: " + pBook.get(i).getName());
            System.out.println(" Phone number: " + pBook.get(i).getPhoneNumber());
        }
    }
    
}
