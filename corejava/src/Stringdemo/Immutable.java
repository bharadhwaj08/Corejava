package Stringdemo;

public class Immutable {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
   String str1="bharadhwaj";
   String str2= str1;
   String str3=str2;
   System.out.println("before mosdification");
   System.out.println("str1"+str1);
   System.out.println("str2"+str2);
   System.out.println("str3"+str3);
   str1="mintu";
   System.out.println("after mosdification");
   System.out.println("str1"+str1);
   System.out.println("str2"+str2);
   System.out.println("str3"+str3);
	}

}
