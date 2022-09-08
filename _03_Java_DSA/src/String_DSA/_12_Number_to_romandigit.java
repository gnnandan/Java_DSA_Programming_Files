package String_DSA;

public class _12_Number_to_romandigit
{
    public static void main(String[] args)
    {
        int num = 777;
        int numSet[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romanSet[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder romanNumber = new StringBuilder();

        for(int i=0;i< numSet.length;i++)
        {
            while(num>=numSet[i])
            {
                num = num - numSet[i];
                romanNumber.append(romanSet[i]);
            }
        }

        System.out.println("The roman equivalent is: "+romanNumber);
    }
}
