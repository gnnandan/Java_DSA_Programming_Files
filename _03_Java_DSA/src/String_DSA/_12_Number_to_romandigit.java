package String_DSA;

public class _12_Number_to_romandigit
{
    public static void main(String[] args)
    {
        int num = 1000;
        int numEq = num;
        int numSet[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanSet[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numSet.length; i++) //pos = 0
        {
            while (num >= numSet[i]) // numSet[0] 1000
            {
                num = num - numSet[i]; // 1000 - numset[0]-> 1000
                result.append(romanSet[i]);
            }
        }

        System.out.println("The roman equivalent of number " + numEq + " is: " + result);
    }
}
