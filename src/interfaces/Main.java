package interfaces;

public class Main {

    public static void main(String[] args) {
        // DECLARE THE INTERFACE CLASS TO USE SPECIFIC METHODS
        ITelephone myPhone;
        // INSTANTIATE THE CLASS THAT IMPLEMENT THESE METHODS
        myPhone = new DeskPhone(2102218282);
        myPhone.powerOn();
        myPhone.callPhone(2102218282);
        myPhone.answer();


        myPhone = new MobilePhone(2122278805);
        myPhone.powerOn();
        myPhone.callPhone(2122278805);
        myPhone.answer();
    }

}
