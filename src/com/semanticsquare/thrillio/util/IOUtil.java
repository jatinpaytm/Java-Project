package com.semanticsquare.thrillio.util;

import java.io.*;
import java.util.List;

public class IOUtil {
	
	public static void read(List<String> data, String filename) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
//				data[count] = line; // done for array
//				count++;
				data.add(line);  // for arraylist

			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

	public static String read(InputStream in) {
		StringBuilder text = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
			String line;

			while ((line = br.readLine()) != null) {
				text.append(line).append("\n");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			//throw new RuntimeException(e);
		} catch (IOException e) {
			e.printStackTrace();
			//throw new RuntimeException(e);
		}

		return text.toString();
	}

	public static void write(String webpage, long id) {
		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/jatinsingh/IdeaProjects/thrillio/pages/" + String.valueOf(id) + ".html"), "UTF-8"))){
			writer.write(webpage);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}