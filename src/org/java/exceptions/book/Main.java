package org.java.exceptions.book;

import java.util.Scanner;

public class Main {
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

		for (int i = 0; i < books.length; i++) {
			System.out.println("-----------------------------------");
			System.out.println(books[i].toString());
			System.out.println("-----------------------------------");
		}

	}
}
