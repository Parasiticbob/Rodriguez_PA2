package Rodriguez_p1;
public class Encrypter {
	public static int encrypt(int num){
		int encryptNum = 0;
		int thou = 0, hund = 0,tens = 0,ones = 0;
		
		//Break number into its four digits
		thou = (num / 1000) % 10;
		hund = (num / 100) % 10;
		tens = (num / 10) % 10;
		ones = num % 10;
		
		//Begin encrypting by adding and modular each digit
		thou += 7;
		thou = thou % 10;
		
		hund += 7;
		hund = hund % 10;
		
		tens += 7;
		tens = tens % 10;
		
		ones += 7;
		ones = ones % 10;
		
		//giving each digit the correct number place
		tens *= 1000;
		ones *= 100;
		thou *= 10;
		hund *= 1; //Useless code just here to make sure i didn't miss anything
		
		//Converting digits back into a whole number
		
		encryptNum = tens + ones + thou + hund;
		
		return encryptNum;
		
	}

}
