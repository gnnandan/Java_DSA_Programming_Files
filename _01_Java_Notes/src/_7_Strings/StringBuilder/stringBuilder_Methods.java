package _7_Strings.StringBuilder;

import java.util.Arrays;

public class stringBuilder_Methods
{
    public static void main(String[] args)
    {
        StringBuilder data = new StringBuilder("Curious Developers Community");

        System.out.println("append(): "+data.append(" A Open Source Initiative"));

        System.out.println("capacity() of a string: " + data.capacity());

        System.out.println("delete(start_index,end_index); "+data.delete(10, 15));
        System.out.println("deleteCharAt(index); "+data.deleteCharAt(10));

        System.out.println("equals(): "+data.equals("Curious"));
        data.ensureCapacity(20);
        System.out.println("ensurecapacity(): " + data.capacity());

        char[] chars = new char[10];
        data.getChars(2, 7, chars, 0);
        System.out.println("getChars(sourceBegin, sourceEnd, char_array, destinationBegin): "+ Arrays.toString(chars));

        System.out.println("index(string): "+data.indexOf("Curious"));
        System.out.println("insert(offset, string): "+data.insert(10, "> CODE <"));

        System.out.println("lastIndexOf(string): "+data.lastIndexOf("s"));
        System.out.println("lastIndexOf(string, startIndex): "+data.lastIndexOf("ss",5)); //-1
        System.out.println("length(): "+data.length());

        StringBuilder newdata = new StringBuilder("Curious Developers Community");
        System.out.println("replace(startindex, endindex, string): "+newdata.replace(0,8,"I am in Curious ")); //The string is: I am in Curious Developers Community
        //System.out.println("reverse(): "+newdata.reverse());

        newdata.setCharAt(0,'c');
        System.out.println("setCharAt(index, character): "+newdata);

        //newdata.setLength(10);
        //System.out.println("setLength(number): "+newdata);
        System.out.println("substring(start, end): "+newdata.substring(0,10));
        System.out.println("subSequence(start, end): "+newdata.subSequence(0, 19));

        newdata.trimToSize();
        System.out.println("trimToSize(): " + newdata);
    }
}

//output
//append(): Curious Developers Community A Open Source Initiative
//capacity() of a string: 90
//delete(start_index,end_index); Curious Deers Community A Open Source Initiative
//deleteCharAt(index); Curious Ders Community A Open Source Initiative
//equals(): false
//ensurecapacity(): 90
//getChars(sourceBegin, sourceEnd, char_array, destinationBegin): [r, i, o, u, s,  ,  ,  ,  ,  ]
//index(string): 0
//insert(offset, string): Curious De> CODE <rs Community A Open Source Initiative
//lastIndexOf(string): 19
//lastIndexOf(string, startIndex): -1
//length(): 55
//replace(startindex, endindex, string): I am in Curious Developers Community
//setCharAt(index, character): c am in Curious Developers Community
//substring(start, end): c am in Cu
//subSequence(start, end): c am in Curious Dev
//trimToSize(): c am in Curious Developers Community