package org.java.exceptions.book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static final File booksFile = new File("F:/eclipse-workspace/java-exceptions-books/books.txt");

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many books do you want to add?");
		int nBooks = in.nextInt();
		int counter = 0;
		in.nextLine();

		Book[] books = new Book[nBooks];

		while (counter < nBooks) {

			System.out.println("Insert the title:");
			String title = in.nextLine();

			System.out.println("Insert the number of pages:");
			int pages = in.nextInt();
			in.nextLine();

			System.out.println("Insert the author:");
			String author = in.nextLine();

			System.out.println("Insert the publisher:");
			String publisher = in.nextLine();

			try {
				Book b = new Book(title, pages, author, publisher);

				books[counter] = b;
				
				counter++;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			System.out.println("-----------------------------------");
		}
		
		// FILE WRITING	
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(booksFile);
			
			for (int i = 0; i < books.length; i++) {
				writer.write(books[i].toString() + "\n");
				writer.write("-----------------------------------\n");
			}
			
			
		} catch (Exception e) {
			System.err.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.getMessage();
				}
		}
		
		// FILE READING
		Scanner reader = null;
		try {
			reader = new Scanner(booksFile);
			
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
		} catch (Exception e) {
			e.getMessage();
		} finally {
			
			if (reader != null)
				reader.close();
		}
	}
}
