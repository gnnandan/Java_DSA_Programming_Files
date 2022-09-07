package Object_Oriented_Concepts._01_class_and_object;

class account_simple_example
{
    private double balance = 50000;
    private double getBalance(int accountNumber)
    {
        return balance;
    }
    public static void main(String[] args)
    {
        account_simple_example acc = new account_simple_example();
        double balance = acc.getBalance(1234567);
        System.out.println("The account_simple_example balance is: " + balance);
    }
}
//output
//The account_simple_example balance is: 50000.0
