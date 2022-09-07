package Object_Oriented_Concepts._01_class_and_object;

public class account_example_variable
{
    private double balance = 500.00;  // instance variable
    static int minimumBalance = 200;  // static variable
    public double getBalance(int accountId)
    {
        int withdrawal = 150;           // local variable
        return balance - withdrawal;
    }
    public static void main(String[] args)
    {
        account_example_variable accnt = new account_example_variable();
        double value = accnt.getBalance(123456);
        System.out.println("Initial Balance: "+accnt.balance); //accessing the instance variable
        System.out.println("The balance after debit: " + value);
    }
}
//output
//Initial Balance: 500.0
//The balance after debit: 350.0
