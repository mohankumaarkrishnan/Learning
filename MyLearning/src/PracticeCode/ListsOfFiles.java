package PracticeCode;
import java.io.*;
import java.util.*;

public class ListsOfFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Mohan.krishnan\\Desktop\\mohan");
		List<String> results=new ArrayList<>();
		search(f, results);
		for(String s:results) {
			System.out.println(s);
		}
	}
	
	public static void search(File folder,List<String> results) {
		for(File file:folder.listFiles()) {
			if(file.isDirectory()) {
				search(file, results);
			}
			else if(file.isFile()) {
				results.add(file.getAbsolutePath());
			}
		}
	}

}
