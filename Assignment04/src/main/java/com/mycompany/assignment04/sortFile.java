
package com.mycompany.assignment04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortFile {

	public static void sortFile()  throws IOException {
		FileReader fileReader = new FileReader("C:\\name.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List <String> lines = new ArrayList();
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			lines.add(line);
		}
		bufferedReader.close();

		

		FileWriter writer = new FileWriter("C:\\sorted_names.txt");
		for (String str : lines) {
			writer.write(str + "\r\n");
		}
		writer.close();
	}
}
	

	