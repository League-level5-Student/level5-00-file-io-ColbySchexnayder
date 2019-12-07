package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane by reversing the steps you used to encrypt.
	// You may use the class you created for FileEncryptor for this as well
	public static void main(String[] args) {
		String decrypt = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/encrypt.txt"));
			
			decrypt = br.readLine();
			
			decrypt = Encryption.encrypt(decrypt, 1);
			decrypt = Encryption.encrypt(decrypt, 2);
			JOptionPane.showMessageDialog(null, decrypt);
			br.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
