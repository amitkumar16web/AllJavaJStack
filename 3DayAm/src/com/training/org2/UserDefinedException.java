package com.training.org2;

class InvaliedAgeException extends Exception{
	public InvaliedAgeException(String s) {
		super(s);
	}

	public String getMyMessage() {
		return "MY MEssage";
	}
}


class TestCustomException{
	public static void validate(int age) throws InvaliedAgeException {
		if(age<18) {
			throw new InvaliedAgeException("Not valied age");
		}
		else
			System.out.println("Everything is ok for vote");
	}
}





public class UserDefinedException {
	public static void main(String[] args) {
		try {
			TestCustomException.validate(12);

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

