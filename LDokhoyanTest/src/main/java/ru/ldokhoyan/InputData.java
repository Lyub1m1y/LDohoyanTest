package ru.ldokhoyan;

import java.util.*;

public class InputData {
	
	private static int num = 0;
	private static int opt = 0;
	public static int option() {
		
		boolean b1 = false;
		while (b1 == false) {
			//getting option from the console
			System.out.println("�������� ������ �����������: " 
		            + "\n1 - �� 10-�� ������� ��������� � 16-��"
					+ "\n2 - �� 10-�� ������� ��������� � 2-��" 
		            + "\n3 - �� 2-�� ������� ��������� � 10-��");
			Scanner scan2 = new Scanner(System.in);
			opt = (int) scan2.nextInt();
			if (opt == 1 || opt == 2 || opt == 3) {
				b1 = true;
				//scan2.close();
			} else {
				System.out.println("������! ����� ������� ���� �� ������������� ���������");
			}
		} 
		return opt;
	}
	
	public static int number() {	
		boolean b2 = false;
		while (b2 == false) {
			//getting number from the console
			System.out.println("������� ����� ����� �� 0 �� 10000: ");
			Scanner scan1 = new Scanner(System.in);
			num = scan1.nextInt();
			if (num >= 0 && num <= 10000) {
				b2 = true;
				//scan1.close();
			} else {
				System.out.println("������! ����� �� ������ � �������� �� 0 �� 10000.");
			}
		}
		return num;
	}
	//create getNum to avoid entering data into the console in other operations :)
	public static int getNum() {
		return num;
	}	
}


