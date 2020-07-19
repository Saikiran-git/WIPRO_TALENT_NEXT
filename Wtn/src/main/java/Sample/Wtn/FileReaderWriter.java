// Reading and Writing to File using FileReader and FileWriter

package Sample.Wtn;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		File inFile = new File("D:\\engineering concepts\\WiproTalentNext\\source.txt");
	    File outFile = new File("D:\\engineering concepts\\WiproTalentNext\\Target.txt");
	    FileReader in = new FileReader(inFile);
	    FileWriter out = new FileWriter(outFile);
	    int c;
	    while((c = in.read()) != -1){
	      out.write(c);
	    }
	    System.out.print("Successfull");
	    in.close();
	    out.close();
	}

}
