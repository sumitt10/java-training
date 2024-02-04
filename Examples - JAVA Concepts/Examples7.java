package com.example.examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Examples7 {
	public static void main(String[] args) {

		SimpleDateFormat example = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date currentDate = new Date();
		String formattedDate = example.format(currentDate);
		System.out.println("Formatted Date: " + formattedDate);

		String dateString = "25/01/2022 15:30:00";
		try {
			Date parsedDate = example.parse(dateString);
			System.out.println("Parsed Date: " + parsedDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
