package _5_Constructor._3_The_Shadow_Problem;

public class shadowProblemSolution
{
    //global or instance variable
    private int a = 10;
    private String s = "Ten";

    shadowProblemSolution()
    {
        //shadow problem solution
        //this - keyword points the current executing object
        this.a=a;
        this.s=s;
        System.out.println("a: "+a);
        System.out.println("s: "+s);
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method");
        new shadowProblemSolution();
    }
}

//output
//Main Method
//a: 10
//s: Ten