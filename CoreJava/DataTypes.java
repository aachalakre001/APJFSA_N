package CoreJava;
//wap for all predefined Datatypes
public class DataTypes {

	public static void main(String[] args) {
		int i=10; //-2,147,483,648-2,147,483,648 to 2,147,483,647
		float f=13.9456f; //upto 7 decimal digits
		double d=3000000.674555; //upto 16 decimal digits
		char s='A'; //ASCII values 0 to 255
		boolean b=true;
		byte b1=40;
		short s1=30000; //-32,768 to 32,767
		long l=20000000;//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		System.out.println(" All DataTypes are shown below:- ");
		System.out.println(" 1) Integer= "+i);
		System.out.println(" 2) Float= "+f);
		System.out.println(" 3) Double= "+d);
		System.out.println(" 4) Character= "+s);
		System.out.println(" 5) Boolean= "+b);
		System.out.println(" 6) Byte= "+b1);
		System.out.println(" 7) Short= "+s1);
		System.out.println(" 8) Long= "+l);
		
	}

}
/*output:
All DataTypes are shown below:- 
 1) Integer= 10
 2) Float= 13.9456
 3) Double= 3000000.674555
 4) Character= A
 5) Boolean= true
 6) Byte= 40
 7) Short= 30000
 8) Long= 20000000
*/
