package String_DSA;

public class _16_Generating_Substring
{
    public static void main(String[] args)
    {
        String str = "ABC".toLowerCase();
        subSet_way1(str);
        subString_way2(str);
    }

    static void subSet_way1(String str)
    {

        for(int i=0;i<str.length();i++)
        {
            String subString = "";
            for(int j=i;j<str.length();j++)
            {
                subString=subString+str.charAt(j);
                System.out.print(subString+" ");
            }
        }
    }

    static void subString_way2(String str)
    {
        int len = str.length();
        String arr[] = new String[len*(len+1)/2];

        int temp=0;

        for(int i=0;i< len;i++)
        {
            for(int j=i;j< len;j++)
            {
                arr[temp] = str.substring(i,j+1);
                temp++;
            }
        }

        System.out.println("\nThe substring is: ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
