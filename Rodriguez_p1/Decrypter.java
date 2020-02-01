package Rodriguez_p1;

public class Decrypter {
	public static int decrypt(int num) {
		int decryptedNum = 0;
		int thou = 0, hund = 0, tens = 0, ones = 0;
		
		//Breaking the number into its digits
		thou = (num / 1000) % 10;
		hund = (num / 100) % 10;
		tens = (num / 10) % 10;
		ones = num % 10;
		
		//Create condition checks for decrypting.
		//if a number is greater than 7 just subtract by 7
		//else if the number is less than 7 just add 3
		if(7 <= thou) {
			thou -= 7;
		}
		else {
			thou += 3;
		}
		
		//For ease of reading purposes-----------------------------------------
		if(7 <= hund) {
			hund -= 7;
		}
		else {
			hund += 3;
		}
		
		//For ease of reading purposes-----------------------------------------
		if(7 <= tens) {
			tens -= 7;
		}
		else {
			tens += 3;
		}
		
		//For ease of reading purposes-----------------------------------------
		if(7 <= ones) {
			ones -= 7;
		}
		else {
			ones += 3;
		}
		
		//Now to rearrange the number to their decrypted order
		tens *= 1000;
		ones *= 100;
		thou *= 10;
		hund *= 1;
		
		//Add them to the total to get the decrypted number
		decryptedNum = tens + ones + thou + hund;
		
		
		
		return decryptedNum;
	}
}