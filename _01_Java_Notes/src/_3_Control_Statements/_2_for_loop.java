package _3_Control_Statements;

public class _2_for_loop
{
    public static void main(String[] args)
    {
        int distribute = 1;
        int person = 1;
        int people = 10;

        for(int i=1;i<=people;i++) //iteration
        {
            System.out.println(distribute+" Chocolate to person "+ person);
            distribute++;
            person++;
        }
    }
}

//output
//1 Chocolate to person 1
//2 Chocolate to person 2
//3 Chocolate to person 3
//4 Chocolate to person 4
//5 Chocolate to person 5
//6 Chocolate to person 6
//7 Chocolate to person 7
//8 Chocolate to person 8
//9 Chocolate to person 9
//10 Chocolate to person 10

