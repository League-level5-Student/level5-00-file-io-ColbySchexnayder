package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{

	JFrame frame;
	JPanel panel;
	JButton addTask;
	JButton viewTasks;
	JButton removeTasks;
	JButton saveList;
	JButton loadList;
	
	ArrayList<String> tasks;
	
	String fileLocation = "src/_03_To_Do_List/";
	String lastFileOpened = "last.txt";
	
	ToDoList(){
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("To Do List");
		
		panel = new JPanel();
		frame.add(panel);
		
		addTask = new JButton();
		addTask.setText("Add Task");
		addTask.addActionListener(this);
		panel.add(addTask);
		
		viewTasks = new JButton();
		viewTasks.setText("View Tasks");
		viewTasks.addActionListener(this);
		panel.add(viewTasks);
		
		removeTasks = new JButton();
		removeTasks.setText("Remove Tasks");
		removeTasks.addActionListener(this);
		panel.add(removeTasks);
		
		saveList = new JButton();
		saveList.setText("Save List");
		saveList.addActionListener(this);
		panel.add(saveList);
		
		loadList = new JButton();
		loadList.setText("Load List");
		loadList.addActionListener(this);
		panel.add(loadList);
		
		String lastSave = readFile(lastFileOpened);
		
		if (lastSave != null) {
			String taskStr = readFile(lastSave);
			
			if (taskStr != null) {
				String[] taskArr = taskStr.split("\n");
				tasks.clear();
				
				for (String s : taskArr) {
					tasks.add(s);
				}
			}
		}
		
		frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		
		if (button == addTask) {
			String input = JOptionPane.showInputDialog("Add Task");
			tasks.add(input);
		}
		else if (button == removeTasks) {
			String input = JOptionPane.showInputDialog("Remove Which Task");
			
			if (!tasks.remove(input)) {
				
			}
			
		}
		else if (button == viewTasks) {
			
		}
		else if (button == saveList) {
			
		}
		else if (button == loadList) {
			
		}

	}
	
	public String readFile(String fileName) {
		String readFromFile = "";
		try {
			String file = fileLocation+fileName;
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = br.readLine();
			
			while (line != null) {
				readFromFile += line +'\n';
				line = br.readLine();
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			readFromFile = null;
		}
		catch(IOException e) {
			e.printStackTrace();
			readFromFile = null;
		}
		
		return readFromFile;
	}
	
	public boolean writeFile(String fileName, String message) {
		try {
			FileWriter fw = new FileWriter(fileLocation+fileName);
			
			fw.write(message);
			fw.close();
			return true;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 * 
	 * The program will also have a text field for user input and
	 *  a submit button used when the previous options require input
	 */

	
	
	
}
