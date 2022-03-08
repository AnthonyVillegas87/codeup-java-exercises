package mobile;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    // Be sure not to expose the inner workings of the ArrayList to MobilePhone
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }



    /// AddContacts
    /*
    When Adding or Updating be sure to check if it exists (use name)
     */
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }


    /// Modify Contacts

    public boolean updateContact(Contact oldContact, Contact newContact) {
       int foundPosition = findContact(oldContact);
       if(foundPosition < 0) {
           System.out.println(oldContact.getName() + ", was not found");
           return false;
       }

       this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }


    /// Remove Contacts




    /// Query Contacts
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        // loop thru all records & extract the name & compare that to the name thats been passed & compare to whats on file
        for(int i = 0; i < this.myContacts.size(); i++) {
            // Create a new contact object
          Contact contact = this.myContacts.get(i);
          if(contact.getName().equals(contactName)) {
              // i being the position number
              return i;
          }
        }
        // if not found
        return -1;
    }
}
