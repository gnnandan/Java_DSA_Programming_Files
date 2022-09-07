package Arrays_Examples;

public class _15_ASCII_Value_Of_Given_String
{
    public static void main(String[] args)
    {
        String s1 = "Nandan G N";
        char ch[] = s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]+" "+(int)ch[i]);
        }
    }
}
