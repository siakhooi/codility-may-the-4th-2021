package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractMayThe4th2021Test {
	abstract MayThe4th2021Interface getTestObject();

	@Test
	void test01() {
		int[] A = new int[] { 2, 3, 3, 4 };
		int L = 3;
		int R = 1;
		int a = 3;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	void test02() {
		int[] A = new int[] { 1, 4, 5, 5 };
		int L = 6;
		int R = 4;
		int a = 4;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	void test03() {
		int[] A = new int[] { 5, 2, 5, 2 };
		int L = 8;
		int R = 1;
		int a = 4;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	void test04() {
		int[] A = new int[] { 1, 5, 5 };
		int L = 2;
		int R = 4;
		int a = 2;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	@DisplayName("equalsize")
	void test05() {
		int[] A = new int[] { 3, 3, 3 };
		int L = 4;
		int R = 2;
		int a = 2;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	@DisplayName("consecutive")
	void test06() {
		int[] A = new int[] { 1, 2, 3, 4, 5, 6 };
		int L = 4;
		int R = 2;
		int a = 6;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	@DisplayName("single disk 1")
	void test07() {
		int[] A = new int[] { 6 };
		int L = 3;
		int R = 1;
		int a = 1;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

	@Test
	@DisplayName("single disk 2")
	void test08() {
		int[] A = new int[] { 3 };
		int L = 2;
		int R = 4;
		int a = 0;

		assertEquals(a, getTestObject().solution(A, L, R));
	}

}
