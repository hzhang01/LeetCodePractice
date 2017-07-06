package day1;
/*
 * @author Han Zhang
 * 
 * Calculate Hamming Distance (minimum edit distance
 * between two strings of equal size). In this case
 * we are calculating the distance between two bit 
 * representations of two integers. 
 * 
 */

public class HammingDistanceBits {

	public static void main(String[] args) {
		int x = 1;
		int y = 16;
		int k = hammingDistance(x, y); 
		System.out.println(k);
	}
	
	public static int hammingDistance (int x, int y){
		int counter = 0;
		int xor = x ^ y;
		while(xor != 0){
			if((xor & 1) == 1){
				counter++;
			}
			xor = xor >> 1;
		}
		return counter;
	}
}
