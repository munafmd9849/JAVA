import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String S="MUNAFmd";
	    System.out.println(StringDemo.toLowerCase(S));
	    String s="munafMD";
	    System.out.println(StringDemo.toUpperCase(s));
	    

	}
}
class StringDemo{
    public static String toLowerCase(String s){
        char []c=new char[s.length()];
        for(int i=0;i<c.length;i++){
            c[i]=s.charAt(i);
            if(!(c[i]>96)){
                c[i]+=32;
            }
        }
        return new String(c);
    }
    public static String toUpperCase(String s){
        char []c=new char[s.length()];
        for(int i=0;i<c.length;i++){
            c[i]=s.charAt(i);
            if(c[i]>96){
                c[i]-=32;
            }
        }
        return new String(c);
    }
}
