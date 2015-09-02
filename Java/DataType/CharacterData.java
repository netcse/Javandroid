class CharacterData {

	public static void main(String args[]){
		char ch = 'a';
		char uniChar = '\u039A';
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charArray);
		System.out.println(uniChar);
		System.out.println(ch);
		
		Character character = new Character('a');
		
		System.out.println("\t"+character);
		System.out.println("\t\b"+character);
		System.out.println("\t\'"+character);
		
	}
}