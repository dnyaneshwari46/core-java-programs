package controlStatements;

public class MaxOfThree {

	public static void main(String[] args) {
		int a=10,b=30,c=50;
		if(a>b && a>c) {
			System.out.println("a is max");
		}else if (b>a && b>c){
			System.out.println("b is max");
		}else {
			System.out.println("c is max");
		}
	}

}


