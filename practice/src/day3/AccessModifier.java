package day3;

class UserData{
	private int privateNum = 10;
	int defaultNum = 20;
	protected int protectedNum = 30;
	public int publicNum = 40;
	
	int getPrivateNum() {
		return privateNum;
	}
}

public class AccessModifier extends UserData{
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
        System.out.println(obj.defaultNum+" "+obj.protectedNum+" "+obj.publicNum);
        System.out.println(obj.getPrivateNum());

	}
}
