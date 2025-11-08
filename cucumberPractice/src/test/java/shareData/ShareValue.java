package shareData;

public class ShareValue {
	private static ThreadLocal<String> companyName=new ThreadLocal<String>();

	public static String getCompanyName() {
		return companyName.get();
	}

	public static void setObj(String value) {
		companyName.set(value);
	}
	
}
