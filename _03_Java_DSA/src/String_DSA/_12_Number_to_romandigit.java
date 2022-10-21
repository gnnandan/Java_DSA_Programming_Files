package String_DSA;

public class _12_Number_to_romandigit
{
    public static void main(String[] args)
    {
        //step -1 take the input num
        int num = 1000;
        int numEq = num;

        //step - 2 = take number and roman equivalent array
        int numSet[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanSet[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //step - 3 take StringBuilder or equivalent to add roman equivalent number
        StringBuilder romanEq = new StringBuilder();

        //step - 4 take for loop and iteration starts from 0 to length of the array
        for(int i=0;i<numSet.length;i++)
        {
            //step - 4.1 take a while loop and check condition whether the given num is greaterthan or equal to each element in the numset[i]
            //{num>=numSet[i]}
            while (num>=numSet[i])
            {
                //step 4.1.1 take the position of number
                num = num-numSet[i];
                romanEq.append(romanSet[i]); //step 4.1.2 append to the string builder/or any
            }
        }

        System.out.println("The roman equivalent of number " + numEq + " is: " + romanEq);
    }
}
