package String_DSA;

import sun.java2d.pipe.PixelFillPipe;

public class _22_Defanged_Version_IP_Address
{
    public static void main(String[] args)
    {
        String ip = "1.1.1.1";

        String defag = "";
        for (int i = 0; i < ip.length(); i++)
        {
            char c = ip.charAt(i);

            if (c == '.')
            {
                defag+="[.]";
            }
            else
            {
                defag+=c;
            }
        }

        System.out.println("The defanged version of IP address: "+ip+" is: "+defag);
    }
}
