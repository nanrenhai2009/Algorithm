/* 
 * Author: Kim Min-Ho (ISKU)
 * Date: 2016.08.11
 * email: minho1a@hanmail.net
 * 
 * https://github.com/ISKU/Algorithm
 * https://www.acmicpc.net/problem/2744
 */

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String string = new Scanner(System.in).next();
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			System.out.print(character < 97 ? Character.toString((char) (character + 32)) : Character.toString((char) (character - 32)));
		}
	}
}