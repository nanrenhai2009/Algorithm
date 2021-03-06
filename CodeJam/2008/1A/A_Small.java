/* 
 * Author: Minho Kim (ISKU)
 * Date: 2017.04.07
 * E-mail: minho1a@hanmail.net
 * 
 * https://github.com/ISKU/Algorithm
 * https://code.google.com/codejam/contest/32016/dashboard#s=p0
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class A_Small {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();

		for (int tCase = 1; tCase <= testCase; tCase++) {
			int n = input.nextInt();
			ArrayList<Long> x = new ArrayList<Long>();
			ArrayList<Long> y = new ArrayList<Long>();

			for (int i = 0; i < n; i++)
				x.add(input.nextLong());
			for (int i = 0; i < n; i++)
				y.add(input.nextLong());

			Collections.sort(x);
			Collections.sort(y, Collections.reverseOrder());

			long ans = 0;
			for (int i = 0; i < n; i++)
				ans += x.get(i) * y.get(i);

			System.out.printf("Case #%d: %d\n", tCase, ans);
		}
	}
}