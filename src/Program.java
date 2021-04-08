

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
	 	
		Locale.setDefault(Locale.US);
		
	
		try {
			dadosEntrada();
		}
		catch(InputMismatchException e) {
			System.out.println("Error: is not number value");
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}
	}	
	public static void dadosEntrada() throws  DomainException {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int numAccount = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
			
		Account account = new Account(numAccount, holder, balance, withdrawLimit);
		account.withdraw(amount);
		System.out.println(account);
			
		sc.close();
		
	}
		
		
}
