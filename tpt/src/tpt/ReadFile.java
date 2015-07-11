package tpt;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	ReadFile text = new ReadFile();
	public static String path=new String();
    public static String outputFolder="C:/Users/HP/Desktop/HazirDosya/HataliYazim";
    public static String outputFile=null;
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	
	
		public static void readerFolder() throws IOException{
			File folder = new File("C:/Users/HP/Desktop/Cennet ve Umut/HBBS/dialogs");
			File[] listOfFiles = folder.listFiles();
			File file=listOfFiles[0];
			readLargerTextFile(file.getPath());
			
		}
		 static void readLargerTextFile(String aFileName) throws IOException {
			    Path path = Paths.get(aFileName);
			    try (Scanner scanner =  new Scanner(path, ENCODING.name())){
			    	String outPath=outputFolder+"/"+path.getFileName();
			    	createFile(outPath);
			    	List<String> lineList=new ArrayList<String>();
			    	
			      while (scanner.hasNextLine()){
			         lineList.add(scanner.nextLine());
			      }      
			      writeLargerTextFile(outputFile,lineList);
			      scanner.close(); 
			    }
			  }
			  
			public  static void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
			    Path path = Paths.get(aFileName);
			    try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
			      for(String line : aLines){
			        writer.write(line);
			        writer.newLine();
			      }
			    }
			  }
			  
			  public static void createFile(String path) throws IOException{
					String filePath = path+"/"+"hi.txt";
					File f = new File(filePath);
					f.getParentFile().mkdirs(); 
					f.createNewFile();
					outputFile=f.getPath();
				 }
				 
}


