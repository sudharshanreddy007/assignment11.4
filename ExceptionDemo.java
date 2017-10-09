package demo2;

	import java.io.IOException;
	
	public class ExceptionDemo 
	
		{
		void show() throws ArithmeticException
		//we created the validate method that takes integer value as paramter.If the age is less than 18  
		//we are throwing the ArithmeticException otherwise it will print welcome to vote//
		//this will help to display the message
		{
			System.out.println("parent class");
		}
	}
	class Child extends ExceptionDemo{//subclass creation here it extends the values of class1 to class2
		void show() throws IOException{//compilation error
			System.out.println("child class");
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 try{
		 ExceptionDemo sub=new Child();//creating an object
		 sub.show();//prints the value
	 }
	 catch(Exception e){
		/*the code is prone to exceptions is placed in the try block
		 *when exception occurs that exception occurred is handled by the 
		 *catch block associated with it
		 */
	 }
		}

	}
