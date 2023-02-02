package org.lessons.java.christmas;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//creare una nuova ArrayList dove salvare la lista dei desideri
		ArrayList<String> wishList = new ArrayList<>();
		
		String wish;
		String inputUser;
		
		System.out.println("Inserisci un desiderio nella lista altrimenti clicca 'x' per uscire!");
		inputUser = s.nextLine();
		
		if((inputUser.equals("x")) || (inputUser.equals(""))) {
			System.out.println("Nessun desiderio presente in lista!");
			return;
		} 
		
		wish = inputUser;
		wishList.add(wish);
		System.out.println("I desideri sono: " + wishList.size());
		
		//continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi
		System.out.println("\nVuoi inserire un altro desiderio? \n* si\n* no");
		inputUser = s.nextLine();
		if(inputUser.equals("si")) {
			while(inputUser.equals("si")) {
				System.out.println("Inserisci il tuo desiderio: ");
				wish = s.nextLine();
				wishList.add(wish);
				System.out.println("I desideri sono: " + wishList.size());
				
				System.out.println("\nVuoi inserire un altro desiderio? \n* si\n* no");
				inputUser = s.nextLine();
			}			
		}
		//Stampo il totale dei desideri
		System.out.println("\nIl numero totale dei desideri è: " + wishList.size());
		}

}
