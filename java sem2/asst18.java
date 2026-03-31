class account{
    void calInterest(){
        System.out.println("General account interest: ");
    }
    final void displayAcctType(){
        System.out.println("This is a bank account...");
    }
}
class savingsAccount extends account{
    void calInterest(){
        System.out.println("Savings account interest 4%..");
    }
}

class crntAccount extends account{
    void calInterest(){
        System.out.println("Current acccount interest 2%..");
    }
}

public class asst18 {

    public static void main(String[] args) {
        account ac;
        ac=new savingsAccount();
        ac.calInterest();
        ac.displayAcctType();

        ac=new crntAccount();
        ac.calInterest();
        ac.displayAcctType();
    }
}