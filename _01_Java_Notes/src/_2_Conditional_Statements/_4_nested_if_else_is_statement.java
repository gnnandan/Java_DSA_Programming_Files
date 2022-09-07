package _2_Conditional_Statements;

public class _4_nested_if_else_is_statement
{
    public static void main(String[] args)
    {
        int a = 10;

        if(a>0)
        {
            System.out.println("True the number is positive");
            if(a%2==0)
            {
                System.out.println("True the number is even number");
            }
            else
            {
                System.out.println("False the number is not even number");
            }
        }
        else
        {
            System.out.println("False the number is negative");
            if(a%2==0)
            {
                System.out.println("True the number is even number");
            }
            else
            {
                System.out.println("False the number is not even number");
            }
        }
    }
}
//Output
//True the number is positive
//True the number is even number

