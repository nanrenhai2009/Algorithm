/* 
 * Author: Kim Min-Ho (ISKU)
 * Date: 2017.03.07
 * Email: minho1a@hanmail.net
 * 
 * https://github.com/ISKU/Algorithm
 * https://www.acmicpc.net/problem/1789
 */

import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		System.out.print((int) (-1 + Math.sqrt(1 + (8 * new Scanner(System.in).nextLong()))) / 2);
	}
}