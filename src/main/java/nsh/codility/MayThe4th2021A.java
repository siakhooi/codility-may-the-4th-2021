package nsh.codility;

import java.util.Arrays;

public class MayThe4th2021A implements MayThe4th2021Interface {

	public int solution(int[] A, int L, int R) {
		int n = 0;
		Arrays.sort(A);
		int last = 0;
		int count = 0;
		int need = 0;
		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			if (a != last) {
				last = a;
				count = 1;
				need = (a < L ? 1 : 0) + (a > R ? 1 : 0);
			} else
				count++;
			if (count == 1 && need > 0)
				n++;
			else if (count == 2 && need == 2)
				n++;
		}

		return n;
	}
}
