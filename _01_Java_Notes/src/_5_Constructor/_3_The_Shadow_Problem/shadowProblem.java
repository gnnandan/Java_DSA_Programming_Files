package _5_Constructor._3_The_Shadow_Problem;

public class shadowProblem
{
    //global or instance variable
    private int a = 10;
    private String s = "Ten";
    shadowProblem()
    {
        //shadow problem occurred here
        //compiler gibes first preference to local variable

        //local variable
        int a = 20;
        String s = "Twenty";
        System.out.println("a: "+a);
        System.out.println("s: "+s);
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method");
        new shadowProblem();
    }
}
//output
//Main Method
//a: 20
//s: Twenty