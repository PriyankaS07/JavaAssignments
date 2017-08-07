class ComplexNumber{
	private int real;
	private int imaginary;

	public ComplexNumber(){
		this.real=0;
		this.imaginary=0;
	}
	public ComplexNumber(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}

	public void addComplexNumbers(ComplexNumber num){
		this.real=real+num.real;
		this.imaginary=imaginary+num.imaginary;
		System.out.println("Real part "+real);
		System.out.println("imaginary part "+imaginary);
	}
	public void subtractComplexNumbers(ComplexNumber num){
		this.real=real-num.real;
		this.imaginary=imaginary-num.imaginary;
		System.out.println("Real part "+real);
		System.out.println("Imaginary part "+imaginary);
	}

		public void multiplyComplexNumbers(ComplexNumber num1, ComplexNumber num2){
		this.real=num1.real*num2.real-num1.imaginary*num2.imaginary;
		this.imaginary=num1.imaginary*num2.real+num1.real*num2.imaginary;
		System.out.println("After Multiplication:");
		System.out.println("Real part "+real);
		System.out.println("Imaginary part "+imaginary);
	}



}
	

public class ComplexNumberTest{
	public static void main(String args[]){
		ComplexNumber c=new ComplexNumber();
		ComplexNumber c1=new ComplexNumber(10,15);
		ComplexNumber c2=new ComplexNumber(7,8);
		c1.addComplexNumbers(c2);
		c1.subtractComplexNumbers(c2);
		c.multiplyComplexNumbers(c1,c2);



	}
}