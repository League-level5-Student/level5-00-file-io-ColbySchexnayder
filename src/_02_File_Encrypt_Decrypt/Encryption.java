package _02_File_Encrypt_Decrypt;

public class Encryption {
	public static String encrypt(String s, int step) {
		
		switch (step) {
		case 0:
			s = s.replace('a', '5');
			s = s.replace('e', '4');
			s = s.replace('i', '3');
			s = s.replace('o', '2');
			s = s.replace('u', '1');
			break;
		case 1:
			String reverse = "";
			
			for (int i = s.length()-1; i >= 0; i--) {
				reverse += s.charAt(i);
			}
			
			s = reverse;
			break;
		case 2:
			s = s.replace('5', 'a');
			s = s.replace('4', 'e');
			s = s.replace('3', 'i');
			s = s.replace('2', 'o');
			s = s.replace('1', 'u');
			break;
		default:
			break;
		}
		
		return s;
	}
}
