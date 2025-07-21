public class Main
{
	public static void main(String[] args) {
		String strg="madam";
		String str="";
		for(int i=0;i<strg.length();i++){
		    char ch=strg.charAt(i);
		    if(Character.isLetter(ch)){
		        str+=ch;
		    }
		}
		
		char []c=str.toCharArray();
		int s=0,e=c.length-1;
		while(s<e){
		    char ch=c[s];
		    c[s]=c[e];
		    c[e]=ch;
		    e--;s++;
		}
		
		System.out.println(str.equals(new String(c)));
	}
}
