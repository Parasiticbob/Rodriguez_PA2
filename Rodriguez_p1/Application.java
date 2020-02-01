package Rodriguez_p1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice = 0, num = 0, encrypted = 0, decrypted = 0;
		//Create a menu for the user to go from one option to another as wanted
		while(true) {
			//get the option the user wants
			System.out.printf("%n****************************************");
			System.out.printf("%nPlease choose an option.");
			System.out.printf("%n1)To encrypt a number");
			System.out.printf("%n2)To decrypt a number");
			System.out.printf("%n3)To exit:  ");
			choice = scan.nextInt();
			
			//Account for each condition.
			if(choice == 1) {
				System.out.printf("%nPlease enter the number you want encrypted: ");
				num = scan.nextInt();
				encrypted = Encrypter.encrypt(num);
				
				//Error correction to make it so that leading 0s are added to the final output
				System.out.printf("%nYour Encrypted Number is: ");
				if((encrypted / 1000) == 0) {
					System.out.printf("0");
				}
				if((encrypted / 100) == 0) {
					System.out.printf("0");
				}
				if((encrypted / 10) == 0) {
					System.out.printf("0");
				}
				if((encrypted / 1) == 0) {
					System.out.printf("0");
				}
				System.out.printf("%d",encrypted);
			}
			
			//if choice #2 run decrypt function/method
			else if(choice == 2) {
				System.out.printf("%nPlease enter the number you want decrypted: ");
				num = scan.nextInt();
				decrypted = Decrypter.decrypt(num);
				
				//Error correction if leading 0s are in final output
				System.out.printf("%nYour decrypted number is: ");
				if((decrypted / 1000) == 0) {
					System.out.printf("0");
				}
				if((decrypted / 100) == 0) {
					System.out.printf("0");
				}
				if((decrypted / 10) == 0) {
					System.out.printf("0");
				}
				if((decrypted / 1) == 0) {
					System.out.printf("0");
				}
				System.out.printf("%d",decrypted);
			}
			
			//if choice #3 close program
			else if(choice == 3) {
				System.out.printf("%nClosing Program!!!");
				return;
			}
			
			//if choice is anything but 1,2,or3 rerun loop
			else {
				System.out.printf("%nThe choice you made isn't an option!!");
			}
		}
	}
}
