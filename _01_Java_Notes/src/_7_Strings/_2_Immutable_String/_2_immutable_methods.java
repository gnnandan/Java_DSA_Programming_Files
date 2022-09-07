package _7_Strings._2_Immutable_String;

import java.util.Arrays;
public class _2_immutable_methods
{
    public static void main(String[] args)
    {
        String data = "Curious Developers Community A Open-Source Initiative";

        System.out.println("concat(): "+data.concat(" Dev Forum India"));
        System.out.println("contains(): "+data.contains("Curious"));
        System.out.println("contentEquals(): "+data.contentEquals("Curious"));
        System.out.println("charAt(): "+data.charAt(0));
        System.out.println("compareTo(): "+data.compareTo("Developers"));
        System.out.println("compareToIgnoreCase(): "+data.compareToIgnoreCase("Curious Developers Community A Open-Source Initiative"));
        System.out.println("contentEquals(): "+data.contentEquals("Curious"));
        System.out.println("contentEquals(): "+data.contentEquals("Curious Developers Community A Open-Source Initiative"));

        System.out.println("equals(): "+data.equals("Curious Developers Community A Open-Source Initiative"));
        System.out.println("equalsIgnoreCase(): "+data.equalsIgnoreCase("Curious Developers Community A Open-Source Initiative"));
        System.out.println("endsWith(): "+data.endsWith("e"));

        System.out.println("intern(): "+data.intern());
        System.out.println("indexOf(): "+data.indexOf("Curious"));
//        System.out.println("isBlank(): "+data.isBlank());
        System.out.println("isEmpty(): "+data.isEmpty());

        System.out.println("length(): "+ data.length());

        System.out.println("matches(): "+ data.matches("a"));

        System.out.println("replace(): "+ data.replace("Curious", "curious"));
        System.out.println("replaceAll(): "+ data.replaceAll("Curious", "curious"));
        System.out.println("replaceFirst(): "+ data.replaceFirst("^","CURIOUS "));

        System.out.println("split(): "+ Arrays.toString(data.split(" ")));
        System.out.println("startsWith(): "+data.startsWith("Curious"));
//        System.out.println("strip(): "+ data.strip());
        System.out.println("substring(): "+ data.substring(0,7));
        System.out.println("subSequence(): "+ data.subSequence(0,7));

        System.out.println("toUpperCase(): "+ data.toUpperCase());
        System.out.println("toLowerCase(): "+ data.toLowerCase());
    }
}
//output
//concat(): Curious Developers Community A Open-Source Initiative Dev Forum India
//contains(): true
//contentEquals(): false
//charAt(): C
//compareTo(): -1
//compareToIgnoreCase(): 0
//contentEquals(): false
//contentEquals(): true
//equals(): true
//equalsIgnoreCase(): true
//endsWith(): true
//intern(): Curious Developers Community A Open-Source Initiative
//indexOf(): 0
//isBlank(): false
//isEmpty(): false
//length(): 53
//matches(): false
//replace(): curious Developers Community A Open-Source Initiative
//replaceAll(): curious Developers Community A Open-Source Initiative
//replaceFirst(): CURIOUS Curious Developers Community A Open-Source Initiative
//split(): [Curious, Developers, Community, A, Open-Source, Initiative]
//startsWith(): true
//strip(): Curious Developers Community A Open-Source Initiative
//substring(): Curious
//subSequence(): Curious
//toUpperCase(): CURIOUS DEVELOPERS COMMUNITY A OPEN-SOURCE INITIATIVE
//toLowerCase(): curious developers community a open-source initiative