/**
 * 
 */
package challenge_CodeCracker;

import java.util.Arrays;

/**
 * 
 */
public class CodeCracker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "David O'Hanlon";
		
		System.out.println("String to be coded: " + name);
		
		int [] encoded = encodeStringToASCIIIntegers(name);
		System.out.println(Arrays.toString(encoded));
		
		
		int [] nameInASCII = { 68, 97, 118, 105, 100, 32, 79, 39, 72, 97, 110, 108, 111, 110 };

		char [] decoded = decodeIntArrayToString(nameInASCII);
		
		System.out.println(Arrays.toString(decoded));
		
	}

	public static int[] encodeStringToASCIIIntegers(String name) { 
		int[] encoded = new int[name.length()];
		
		for (int i = 0 ; i < name.length(); i++) {
			encoded[i] = (int) name.charAt(i);
		}
		
		return encoded;
	}
	
	public static char[] decodeIntArrayToString(int [] toDecode) {
		char[] decoded = new char [toDecode.length];
		
		for (int i = 0; i < toDecode.length; i++) {
			decoded[i] = (char)toDecode[i];
		}
		
		return decoded ;
	}
	
}
