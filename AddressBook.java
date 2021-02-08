package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static ArrayList<Book> bookstore = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	static boolean isExist = false;

	void addContact() {
		System.out.println("Enter number of contact you wannted to add in Adress book:- ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Book b1 = new Book();
			System.out.println("Enter id:-");
			b1.setId(sc.nextInt());
			System.out.println("Enter Phone number:-");
			b1.setPhoneNumber(sc.next());

			System.out.println("Enter first name:-");
			b1.setfName(sc.next());
			System.out.println("Enter last name:-");
			b1.setlName(sc.next());
			System.out.println("Enter city:-");
			b1.setCity(sc.next());
			System.out.println("enter the zip code");
			b1.setZip(sc.next());
			System.out.println("enter the state");
			b1.setState(sc.next());
			System.out.println("enter the email address");
			b1.setEmail(sc.next());
			System.out.println("your details are :- " + b1.toString());
			bookstore.add(b1);
		}
	}

	static void printContact() {
		System.out.println("your list is :-");
		System.out.println(bookstore.toString());
	}

	void update() {
		System.out.println("enter the input");
		String fname_fromuser = sc.next();
		Book b_update = null;
		int indexof_store = -1;
		for (int index = 0; index <= bookstore.size(); index++) {
			if (bookstore.get(index).getfName().equals(fname_fromuser)) {
				b_update = bookstore.get(index);
				indexof_store = 1;
				break;
			} else {
				System.out.println("wrong data input ");
				break;
			}

		}

		if (indexof_store == -1) {
			System.out.println("name in book not found");

		}

		else {
			System.out.println("give the contact details u wanna to change");

			System.out.println("1 for changing lname");
			System.out.println("2 for changing city");
			System.out.println("3 for  changing state");
			System.out.println("4 for changing zip code");
			System.out.println("5 for changing number");
			System.out.println("6 for changing email");
			int change = sc.nextInt();
			switch (change) {
			case 1:
				System.out.println("enter the lname");
				b_update.setlName(sc.next());
				break;
			case 2:
				System.out.println("enter the city");
				b_update.setCity(sc.next());
				break;

			case 3:
				System.out.println("enter changing state");
				b_update.setState(sc.next());
				break;

			case 4:
				System.out.println("enter zip code");
				b_update.setZip(sc.next());
				break;

			case 5:
				System.out.println("enter for changing number");
				b_update.setPhoneNumber(sc.next());
				break;

			case 6:
				System.out.println("enter email");
				b_update.setEmail(sc.next());
				break;
			}

		}

	}

	void deletContact() {

		{
			System.out.println("enter the input");
			String fname_fromuser = sc.next();
			Book b_update = null;
			int indexof_store = -1;
			for (int index = 0; index <= bookstore.size(); index++) {
				if (bookstore.get(index).getfName().equals(fname_fromuser)) {
					b_update = bookstore.remove(index);
					indexof_store = 1;
					break;
				}
			}
		}
	}

	static void exit() {
		isExist = true;
		System.out.println("thankyou for using addressBook");

	}

	public static void main(String[] args) {

		while (!isExist) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for add contact in Addressbook:-");
			System.out.println("Enter 2 for update contact in Addressbook:-");
			System.out.println("Enter 3 for remove contact in Addressbook:-");
			System.out.println("Enter 4 for print contact in Addressbook:-");
			System.out.println("Enter 5 for exit from Addressbook:-");
			int choice = sc.nextInt();
			System.out.println("Enter your choice of operation:-");

			switch (choice) {
			case 1:
				new AddressBook().addContact();
				break;
			case 2:
				new AddressBook().update();
				break;
			case 3:
				new AddressBook().deletContact();
				break;
			case 4:
				printContact();
				break;
			case 5:
				exit();
				break;
			}

		}
	}

}
