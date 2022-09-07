package _7_Strings._2_Immutable_String;

public class _1_comparing_immutable_string
{
    public static void main(String[] args)
    {
        String data = new String("Nandan");
        String s = "Nandan";

        //compare using "=="
        boolean isEqual_way_1 = data==(s);
        System.out.println("Equality between strings: "+isEqual_way_1);

        //compare using "equals"
        boolean isEqual_way_2 = data.equals(s);
        System.out.println("Equality between strings: "+isEqual_way_2);

        //compare using "equalsIgnorecase"
        boolean isEqual_way_3 = data.equalsIgnoreCase(s);
        System.out.println("Equality between strings: "+isEqual_way_3);

        //compare using "contentEquals"
        boolean isEqual_way_4 = data.contentEquals(s);
        System.out.println("Equality between strings: "+isEqual_way_4);

        //compare using "compareTo"
        int isEqual_way_5 = data.compareTo(s);
        String comparision;
        if(isEqual_way_5 ==0)
        {
            comparision = "true";
            System.out.println("Equality between strings: "+comparision);
        }
        else
        {
            comparision = "false";
            System.out.println("Equality between strings: "+comparision);
        }

        //compare using "compareTo"
        int isEqual_way_6 = data.compareToIgnoreCase(s);
        String comparision_result;
        if(isEqual_way_6 ==0)
        {
            comparision_result = "true";
            System.out.println("Equality between strings: "+ comparision_result);
        }
        else
        {
            comparision_result = "false";
            System.out.println("Equality between strings: "+ comparision_result);
        }
    }
}
//output
//Equality between strings: false
//Equality between strings: true
//Equality between strings: true
//Equality between strings: true
//Equality between strings: true
//Equality between strings: true
