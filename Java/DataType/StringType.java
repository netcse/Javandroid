class StringType {
	public static void main(String args[]){
		char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
		System.out.println(helloArray);
		StringBuffer sBuffer = new StringBuffer("test");
		sBuffer.append(" String Buffer added");
		System.out.println(sBuffer);
		System.out.println("My name is ".concat("geo"));
	}
}