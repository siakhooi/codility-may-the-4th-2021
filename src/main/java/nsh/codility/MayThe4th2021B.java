package nsh.codility;

import java.util.HashMap;

public class MayThe4th2021B implements MayThe4th2021Interface {

	public int solution(int[] A, int L, int R) {
		HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		for (int a : A)
			if (cnt.containsKey(a))
				cnt.put(a, cnt.get(a) + 1);
			else
				cnt.put(a, 1);

		int ans = 0;

		for (int a1 : cnt.keySet()) {
			int rods = (a1 < L ? 1 : 0) + (a1 > R ? 1 : 0);
			ans += Math.min(cnt.get(a1), rods);
		}
		return ans;
	}
}
