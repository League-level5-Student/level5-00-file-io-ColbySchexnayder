package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	// Refresh module folders if the program ran but the file doesn't appear
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is the message?");
		
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/savefile.txt");
			
			fw.write(input);
			fw.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
