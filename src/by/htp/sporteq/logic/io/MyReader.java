package by.htp.sporteq.logic.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class MyReader {
	
	public static ArrayList<ArrayList<String>> readReport() {

		ArrayList<ArrayList<String>> report = new ArrayList<>();
		ArrayList<String> client = new ArrayList<>();

		String file = "C:/Java EE Neon/SportEquipmentWeb/WebContent/resources/RentReport.txt";
		String line = "";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((line = br.readLine()) != null) {
				if (line.contains("Client name")) {
					if (client.size() > 0) {
						report.add(client);
					}
					client = new ArrayList<>();
					client.add(line.substring(line.lastIndexOf(':'), line.length()));
				} else {
					client.add(line);
				}
				
			}
			report.add(client);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return report;
	}
}
