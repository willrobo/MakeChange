package MyProjects;

import java.text.DecimalFormat;
import java.util.*;
public class MakeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double price, payment, change;
		int dollar20 = 0, dollar10 = 0, dollar5 = 0, dollar1 = 0, coin1 = 0, coin2 = 0, coin3 = 0, coin4 = 0;
		String changestring;
		char tens = 0, ones = 0, tenths = 0, hundreths = 0;
		
		System.out.println("This program will calculate your change from a purchase.");
		System.out.println("Enter the price of your purchase: ");
		price = kb.nextDouble();
		
		System.out.println("Enter the amount you will be paying the cashier for the item. ");
		payment = kb.nextDouble();
		
		if (payment < price) {
			System.out.println("That amount is not enough to pay for the item. ");
		}
		else if (payment == price) {
			System.out.println("That is the exact amount needed to pay for the item.");
		}
		
		DecimalFormat dec = new DecimalFormat("#.00");
		
		change = (payment - price);
		changestring = (dec.format(change));
		tens = changestring.charAt(0);
		ones = changestring.charAt(1);
		tenths = changestring.charAt(3);
		hundreths = changestring.charAt(4);
		
		if (tens == '2') {
			dollar20 = 1;
		}
		if (tens == '1') {
			dollar10 = 1;
		}
		if (ones == '9') {
			dollar5 = 1;
			dollar1 = 4;
		}
		if (ones == '8') {
			dollar5 = 1;
			dollar1 = 3;
		}
		if (ones == '7') {
			dollar5 = 1;
			dollar1 = 2;
		}
		if (ones == '6') {
			dollar5 = 1;
			dollar1 = 1;
		}
		if (ones == '5') {
			dollar5 = 1;
		}
		if (ones == '4') {
			dollar1 = 4;
		}
		if (ones == '3') {
			dollar1 = 3;
		}
		if (ones == '2') {
			dollar1 = 2;
		}
		if (ones == '1') {
			dollar1 = 1;
		}
		if (tenths == '9' && hundreths == '9') {
			coin1 = 3;
			coin2 = 2;
			coin4 = 4;
		}
		if (tenths == '9' && hundreths == '8') {
			coin1 = 3;
			coin2 = 2;
			coin4 = 3;
		}
		if (tenths == '9' && hundreths == '7') {
			coin1 = 3;
			coin2 = 2;
			coin4 = 2;
		}
		if (tenths == '9' && hundreths == '6') {
			coin1 = 3;
			coin2 = 2;
			coin4 = 1;
		}
		if (tenths == '9' && hundreths == '5') {
			coin1 = 3;
			coin2 = 2;
		}
		if (tenths == '9' && hundreths == '4') {
			coin1 = 3;
			coin2 = 1;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '9' && hundreths == '3') {
			coin1 = 3;
			coin2 = 1;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '9' && hundreths == '2') {
			coin1 = 3;
			coin2 = 1;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '9' && hundreths == '1') {
			coin1 = 3;
			coin2 = 1;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '9' && hundreths == '0') {
			coin1 = 3;
			coin2 = 1;
			coin3 = 1;
		}	
		if (tenths == '8' && hundreths == '9') {
			coin1 = 3;
			coin2 = 1;
			coin4 = 4;
		}
		if (tenths == '8' && hundreths == '8') {
			coin1 = 3;
			coin2 = 1;
			coin4 = 3;
		}
		if (tenths == '8' && hundreths == '7') {
			coin1 = 3;
			coin2 = 1;
			coin4 = 2;
		}
		if (tenths == '8' && hundreths == '6') {
			coin1 = 3;
			coin2 = 1;
			coin4 = 1;
		}
		if (tenths == '8' && hundreths == '5') {
			coin1 = 3;
			coin2 = 1;
		}
		if (tenths == '8' && hundreths == '4') {
			coin1 = 3;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '8' && hundreths == '3') {
			coin1 = 3;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '8' && hundreths == '2') {
			coin1 = 3;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '8' && hundreths == '1') {
			coin1 = 3;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '8' && hundreths == '0') {
			coin1 = 3;
			coin3 = 1;
		}			
		if (tenths == '7' && hundreths == '9') {
			coin1 = 3;
			coin4 = 4;
		}
		if (tenths == '7' && hundreths == '8') {
			coin1 = 3;
			coin4 = 3;
		}
		if (tenths == '7' && hundreths == '7') {
			coin1 = 3;
			coin4 = 2;
		}
		if (tenths == '7' && hundreths == '6') {
			coin1 = 3;
			coin4 = 1;
		}
		if (tenths == '7' && hundreths == '5') {
			coin1 = 3;
		}
		if (tenths == '7' && hundreths == '4') {
			coin1 = 2;
			coin2 = 2;
			coin4 = 4;
		}
		if (tenths == '7' && hundreths == '3') {
			coin1 = 2;
			coin2 = 2;
			coin4 = 3;
		}
		if (tenths == '7' && hundreths == '2') {
			coin1 = 2;
			coin2 = 2;
			coin4 = 2;
		}
		if (tenths == '7' && hundreths == '1') {
			coin1 = 2;
			coin2 = 2;
			coin4 = 1;
		}
		if (tenths == '7' && hundreths == '0') {
			coin1 = 2;
			coin2 = 2;
		}	
		if (tenths == '6' && hundreths == '9') {
			coin1 = 2;
			coin2 = 1;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '6' && hundreths == '8') {
			coin1 = 2;
			coin2 = 1;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '6' && hundreths == '7') {
			coin1 = 2;
			coin2 = 1;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '6' && hundreths == '6') {
			coin1 = 2;
			coin2 = 1;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '6' && hundreths == '5') {
			coin1 = 2;
			coin2 = 1;
			coin3 = 1;
		}
		if (tenths == '6' && hundreths == '4') {
			coin1 = 2;
			coin2 = 1;
			coin4 = 4;
		}
		if (tenths == '6' && hundreths == '3') {
			coin1 = 2;
			coin2 = 1;
			coin4 = 3;
		}
		if (tenths == '6' && hundreths == '2') {
			coin1 = 2;
			coin2 = 1;
			coin4 = 2;
		}
		if (tenths == '6' && hundreths == '1') {
			coin1 = 2;
			coin2 = 1;
			coin4 = 1;
		}
		if (tenths == '6' && hundreths == '0') {
			coin1 = 2;
			coin2 = 1;
		}	
		if (tenths == '5' && hundreths == '9') {
			coin1 = 2;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '5' && hundreths == '8') {
			coin1 = 2;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '5' && hundreths == '7') {
			coin1 = 2;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '5' && hundreths == '6') {
			coin1 = 2;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '5' && hundreths == '5') {
			coin1 = 2;
			coin3 = 1;
		}
		if (tenths == '5' && hundreths == '4') {
			coin1 = 2;
			coin4 = 4;
		}
		if (tenths == '5' && hundreths == '3') {
			coin1 = 2;
			coin4 = 3;
		}
		if (tenths == '5' && hundreths == '2') {
			coin1 = 2;
			coin4 = 2;
		}
		if (tenths == '5' && hundreths == '1') {
			coin1 = 2;
			coin4 = 1;
		}
		if (tenths == '5' && hundreths == '0') {
			coin1 = 2;
		}	
		if (tenths == '4' && hundreths == '9') {
			coin1 = 1;
			coin2 = 2;
			coin4 = 4;
		}
		if (tenths == '4' && hundreths == '8') {
			coin1 = 1;
			coin2 = 2;
			coin4 = 3;
		}
		if (tenths == '4' && hundreths == '7') {
			coin1 = 1;
			coin2 = 2;
			coin4 = 2;
		}
		if (tenths == '4' && hundreths == '6') {
			coin1 = 1;
			coin2 = 2;
			coin4 = 1;
		}
		if (tenths == '4' && hundreths == '5') {
			coin1 = 1;
			coin2 = 2;
		}
		if (tenths == '4' && hundreths == '4') {
			coin1 = 1;
			coin2 = 1;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '4' && hundreths == '3') {
			coin1 = 1;
			coin2 = 1;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '4' && hundreths == '2') {
			coin1 = 1;
			coin2 = 1;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '4' && hundreths == '1') {
			coin1 = 1;
			coin2 = 1;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '4' && hundreths == '0') {
			coin1 = 1;
			coin2 = 1;
			coin3 = 1;
		}	
		if (tenths == '3' && hundreths == '9') {
			coin1 = 1;
			coin2 = 1;
			coin4 = 4;
		}
		if (tenths == '3' && hundreths == '8') {
			coin1 = 1;
			coin2 = 1;
			coin4 = 3;
		}
		if (tenths == '3' && hundreths == '7') {
			coin1 = 1;
			coin2 = 1;
			coin4 = 2;
		}
		if (tenths == '3' && hundreths == '6') {
			coin1 = 1;
			coin2 = 1;
			coin4 = 1;
		}
		if (tenths == '3' && hundreths == '5') {
			coin1 = 1;
			coin2 = 1;
		}
		if (tenths == '3' && hundreths == '4') {
			coin1 = 1;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '3' && hundreths == '3') {
			coin1 = 1;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '3' && hundreths == '2') {
			coin1 = 1;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '3' && hundreths == '1') {
			coin1 = 1;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '3' && hundreths == '0') {
			coin1 = 1;
			coin3 = 1;
		}	
		if (tenths == '2' && hundreths == '9') {
			coin1 = 1;
			coin4 = 4;
		}
		if (tenths == '2' && hundreths == '8') {
			coin1 = 1;
			coin4 = 3;
		}
		if (tenths == '2' && hundreths == '7') {
			coin1 = 1;
			coin4 = 2;
		}
		if (tenths == '2' && hundreths == '6') {
			coin1 = 1;
			coin4 = 1;
		}
		if (tenths == '2' && hundreths == '5') {
			coin1 = 1;
		}
		if (tenths == '2' && hundreths == '4') {
			coin2 = 2;
			coin4 = 4;
		}
		if (tenths == '2' && hundreths == '3') {
			coin2 = 2;
			coin4 = 3;
		}
		if (tenths == '2' && hundreths == '2') {
			coin2 = 2;
			coin4 = 2;
		}
		if (tenths == '2' && hundreths == '1') {
			coin2 = 2;
			coin4 = 1;
		}
		if (tenths == '2' && hundreths == '0') {
			coin2 = 2;
		}	
		if (tenths == '1' && hundreths == '9') {
			coin2 = 1;
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '1' && hundreths == '8') {
			coin2 = 1;
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '1' && hundreths == '7') {
			coin2 = 1;
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '1' && hundreths == '6') {
			coin2 = 1;
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '1' && hundreths == '5') {
			coin2 = 1;
			coin3 = 1;
		}
		if (tenths == '1' && hundreths == '4') {
			coin2 = 1;
			coin4 = 4;
		}
		if (tenths == '1' && hundreths == '3') {
			coin2 = 1;
			coin4 = 3;
		}
		if (tenths == '1' && hundreths == '2') {
			coin2 = 1;
			coin4 = 2;
		}
		if (tenths == '1' && hundreths == '1') {
			coin2 = 1;
			coin4 = 1;
		}
		if (tenths == '1' && hundreths == '0') {
			coin2 = 1;
		}	
		if (tenths == '0' && hundreths == '9') {
			coin3 = 1;
			coin4 = 4;
		}
		if (tenths == '0' && hundreths == '8') {
			coin3 = 1;
			coin4 = 3;
		}
		if (tenths == '0' && hundreths == '7') {
			coin3 = 1;
			coin4 = 2;
		}
		if (tenths == '0' && hundreths == '6') {
			coin3 = 1;
			coin4 = 1;
		}
		if (tenths == '0' && hundreths == '5') {
			coin3 = 1;
		}
		if (tenths == '0' && hundreths == '4') {
			coin4 = 4;
		}
		if (tenths == '0' && hundreths == '3') {
			coin4 = 3;
		}
		if (tenths == '0' && hundreths == '2') {
			coin4 = 2;
		}
		if (tenths == '0' && hundreths == '1') {
			coin4 = 1;
		}

		if(payment > price) {
			System.out.println("That is more than the cost of the item.");
			System.out.println("Your change is: " + change + " You will receive: ");
			System.out.println(dollar20 + " $20 bill -- " + dollar10 + " $10 bill -- " + dollar5 + " $5 bill -- " + dollar1 + " $1 bill ");
			System.out.println(coin1 + " quarter -- " + coin2 + " dime -- " + coin3 + " nickel -- " + coin4 + " penny ");	
		}
	}	
}