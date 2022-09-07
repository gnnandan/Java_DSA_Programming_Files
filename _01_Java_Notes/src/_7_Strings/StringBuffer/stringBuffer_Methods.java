package _7_Strings.StringBuffer;

import java.util.Arrays;

public class stringBuffer_Methods
{
    public static void main(String[] args)
    {
        StringBuffer data = new StringBuffer("Curious Developers Community");

        System.out.println("append(): "+data.append(" Open source"));

        int capacity = data.capacity();
        System.out.println("capacity() of a string: " + capacity);

        System.out.println("delete(start_index,end_index); "+data.delete(10, 15));
        System.out.println("deleteCharAt(index); "+data.deleteCharAt(10));

        System.out.println("equals(): "+data.equals("Curious"));
        data.ensureCapacity(20);
        System.out.println("ensurecapacity(): " + data.capacity());

        char[] chars = new char[10];
        data.getChars(0, 7, chars, 0);
        System.out.println("getChars(sourceBegin, sourceEnd, char_array, destinationBegin): "+ Arrays.toString(chars));

        System.out.println("index(string): "+data.indexOf("Curious"));
        System.out.println("insert(offset, string): "+data.insert(10, "> CODE <"));

        System.out.println("lastIndexOf(string): "+data.lastIndexOf("s"));
        System.out.println("lastIndexOf(string, startIndex): "+data.lastIndexOf("ss",5));
        System.out.println("length(): "+data.length());

        StringBuffer newdata = new StringBuffer("Curious Developers Community");
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
//append(): Curious Developers Community Open source
//capacity() of a string: 44
//delete(start_index,end_index); Curious Deers Community Open source
//deleteCharAt(index); Curious Ders Community Open source
//equals(): false
//ensurecapacity(): 44
//getChars(sourceBegin, sourceEnd, char_array, destinationBegin): [C, u, r, i, o, u, s,  ,  ,  ]
//index(string): 0
//insert(offset, string): Curious De> CODE <rs Community Open source
//lastIndexOf(string): 36
//lastIndexOf(string, startIndex): -1
//length(): 42
//replace(startindex, endindex, string): I am in Curious Developers Community
//setCharAt(index, character): c am in Curious Developers Community
//substring(start, end): c am in Cu
//subSequence(start, end): c am in Curious Dev
//trimToSize(): c am in Curious Developers Community