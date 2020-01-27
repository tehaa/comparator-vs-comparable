package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Laptop> labs = new ArrayList<Laptop>();
		labs.add(new Laptop("Dell", 500, 10000));
		labs.add(new Laptop("lenovo", 250, 7000));
		labs.add(new Laptop("HP", 1000, 15000));
		Collections.sort(labs);

		for (Laptop lab : labs) {
			System.out.println(lab);
		}

		List<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(4);
		num.add(3);
		num.add(2);
		num.add(1);
		num.add(6);
		num.add(7);
		num.add(8);
		Collections.sort(num);
		System.out.println(num.toString());

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("manikan", 500));
		books.add(new Book("java", 100));
		books.add(new Book("python", 300));
		books.add(new Book("C", 200));

		Comparator<Book> com = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}

		};
		Collections.sort(books, com);

		for (Book bo : books) {
			System.out.println(bo);
		}

	}

}
