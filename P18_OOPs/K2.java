//Use of ACCESS MODIFIERS and GETTER SETTERS
public class K2 {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        //myAccount.password="abcde1230"; (Gives Error) use setter
        myAccount.setPassword("abcde1230");
        System.out.println("Password is:"+myAccount.getPassword());
    }
}

class BankAccount{
    private String username;
    private String password;
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}