package thiskeyword;

class Calc{
	int num1;
	int num2;
	int result;
	
	//constructor
	public Calc(int num1, int num2) {
		this.num1 = num1;	//current object, thiskeyword does not work static
		this.num2 = num2;
	}
}

public class ThisKeywordConcept {

	public static void main(String[] args) {
		Calc c = new Calc(5, 10);
		System.out.println(c.num1);
		System.out.println(c.num2);

	}

}
