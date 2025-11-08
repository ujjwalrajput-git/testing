package selday1;

public class P21_InvalidException {
	public static void main(String[] args) {
		int num = 10;
		try {
			if(num == 10)
				throw new InvalidDataException("Data is Invalid");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
