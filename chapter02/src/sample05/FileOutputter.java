package sample05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath, fileName;
	
	public FileOutputter() {
		System.out.println("FileOutputter 기본 생성자");
	}
	
	
	public void setFilePath(String filePath) {
		System.out.println("setFilePath(String filepath)");
		this.filePath = filePath;
	}



	public void setFileName(String fileName) {
		System.out.println("setFileName(String name)");
		this.fileName = fileName;
	}



	@Override
	public void output(String message) {
		System.out.println("output(String message)");
		
		
		try {
			FileWriter fileWriter = new FileWriter(new File(filePath, fileName));
			fileWriter.write(message);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //파일 객체 생성
	}

}
