package edu.kis.vh.nursery;
public class DefaultCountingOutRhymer {
	public static int EMPTY = -1;
	public static int DEFAULT_VALUE = -1;
	public static int MAX_SIZE = 12;
	public static int CAPACITY = MAX_SIZE - 1;

	private final int[] numbers = new int[MAX_SIZE];

	public int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == CAPACITY;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total--];
	}
}
