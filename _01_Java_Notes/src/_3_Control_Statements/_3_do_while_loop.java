package _3_Control_Statements;

public class _3_do_while_loop
{
    public static void main(String[] args)
    {
        int distribute = 1;
        int person = 1;

        do
        {
            System.out.println(distribute+" Chocolate to person "+ person);
            distribute++;
        }while(distribute<=10);//repetition
    }
}

//Output
//1 Chocolate to person 1
//2 Chocolate to person 1
//3 Chocolate to person 1
//4 Chocolate to person 1
//5 Chocolate to person 1
//6 Chocolate to person 1
//7 Chocolate to person 1
//8 Chocolate to person 1
//9 Chocolate to person 1
//10 Chocolate to person 1