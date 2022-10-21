package _1_Introduction_to_java;

public class _2_variables
{
    private String global_variable = "Global Variable"; //instance variable
    static String static_variable = "Static Variable"; //static variable
    public static void main(String[] args)
    {
        System.out.println(">>> Execution Starts");
        accessVariables(); //calling method
        //Note
        //global variable can't be access in a static context,
        //so we can access through reference variable by object creation for the class
        _2_variables reference_variable  = new _2_variables(); //creating reference variable (Object creation)
        System.out.println("Accessing Global Variable: "+reference_variable.global_variable);
        System.out.println(">>> Execution Stops");

    }
    public static void accessVariables()
    {
        String local_Variable = "Local Variable"; //local variable
        System.out.println("Accessing Local Variable: "+local_Variable);
        //static variable can be access using
        // 1. classname.static variable name
        // 2. we can access directly
        System.out.println("Accessing Static Variable (classname.variable name): "+ _2_variables.static_variable);
        System.out.println("Accessing Static Variable (directly with variable name): "+static_variable);
    }
}

//Output
//>>> Execution Starts
//Accessing Local Variable: Local Variable
//Accessing Static Variable (classname.variable name): Static Variable
//Accessing Static Variable (directly with variable name): Static Variable
//Accessing Global Variable: Global Variable
//>>> Execution Stops

