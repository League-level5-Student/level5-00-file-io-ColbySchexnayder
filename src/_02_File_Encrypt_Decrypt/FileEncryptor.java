package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Create a new class to encrypt by replacing characters and reversing the string
	// Output the encrypted form of the message to a file
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("What's the message?");
		input = Encryption.encrypt(input, 0);
		input = Encryption.encrypt(input, 1);
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/encrypt.txt");
			
			fw.write(input);
			fw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
