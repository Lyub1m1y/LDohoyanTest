package ru.ldokhoyan;

import java.util.*;

public class InputData {
	
	private static int num = 0;
	private static int opt = 0;
	public static int option() {
		
		boolean b1 = false;
		while (b1 == false) {
			//getting option from the console
			System.out.println("Âûáåğåòå íóæíóş êîíâåğòàöèş: " 
		            + "\n1 - Èç 10-îé ñèñòåìû ñ÷èñëåíèÿ â 16-óş"
					+ "\n2 - Èç 10-îé ñèñòåìû ñ÷èñëåíèÿ â 2-óş" 
		            + "\n3 - Èç 2-îé ñèñòåìû ñ÷èñëåíèÿ â 10-óş");
			Scanner scan2 = new Scanner(System.in);
			opt = (int) scan2.nextInt();
			if (opt == 1 || opt == 2 || opt == 3) {
				b1 = true;
				//scan2.close();
			} else {
				System.out.println("Îøèáêà! Íóæíî âûáğàòü îäèí èç ïåğå÷èñëåííûõ âàğèàíòîâ");
			}
		} 
		return opt;
	}
	
	public static int number() {	
		boolean b2 = false;
		while (b2 == false) {
			//getting number from the console
			System.out.println("Ââåäèòå öåëîå ÷èñëî îò 0 äî 10000: ");
			Scanner scan1 = new Scanner(System.in);
			num = scan1.nextInt();
			if (num >= 0 && num <= 10000) {
				b2 = true;
				//scan1.close();
			} else {
				System.out.println("Îøèáêà! ×èñëî íå âõîäèò â äèàïîçîí îò 0 äî 10000.");
			}
		}
		return num;
	}
	//create getNum to avoid entering data into the console in other operations :)
	public static int getNum() {
		return num;
	}	
}


