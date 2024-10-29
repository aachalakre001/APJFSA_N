package CoreJava;
//WAP for print grade by marks
public class ControlFlow {
	public static void main(String[] args) {
		int marks=70;//predefine input as a 70
		if(marks>90) {
			System.out.println("A grade");
		}
		else if(marks>80) {
			System.out.println("B grade");
		}
		else if(marks>70)
		{
			System.out.println("C grade");
		}
		else if(marks>60) {
			System.out.println("D grade");
		}
		else {
			System.out.println("Fail");
		}
	}
}
//output:D grade

