public class _06_sum_of_naturals
{
    public static void main(String[] args)
    {
        int startNum = 10;
        int endNum = 100;
        int result=0;
        for(int i=startNum;i<=endNum;i++)
        {
            result = result+i;
        }
        System.out.println("The sum is: "+result);
    }
}
