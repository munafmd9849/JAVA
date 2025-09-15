import java.util.function.Predicate;

public class Main
{
	public static void main(String[] args) {
		Predicate <String> p=s->s.startsWith("k");
		String a[]={"kaif","kamlesh","kbsir","saquib"};
		for(String i:a){
		    System.out.println(p.test(i));
		}

	}
}




// public class Main
// {
// 	public static void main(String[] args) {
// 		Predicate<Integer> p1=i->i>=0;
// 		System.out.println(p1.test(10));
		
// 		Predicate<String> p2=s->s.length()>0;
// 		System.out.println(p2.test("munaf"));
		
		
		

// 	}
// }






// interface Sample{
//     int getLength(String a);
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 		Sample ref=a->a.length();
// 		System.out.println(ref.getLength("pwioi"));
// 	}
// }


// interface Sample{
//     int SquareIt(int a);
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 		Sample ref=a->a*a; 
// 		System.out.println(ref.SquareIt(5));
// 	}
// }





// interface Sample{
//     public int add(int a,int b); 
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    Sample ref=(a,b)->a+b;
	    
// 	    System.out.println(ref.add(3,30));
	    
// 	}
// }









// class SampleTest{
//     public int add(int a,int b){
//         return a+b;
//     }
// }















// public class Main
// {
// 	public static void main(String[] args) {
// 	    SampleTest st=new SampleTest();
// 	    System.out.println(st.add(20,30));
	    
// 	}
// }






