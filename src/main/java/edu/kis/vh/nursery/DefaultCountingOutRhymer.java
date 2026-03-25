package edu.kis.vh.nursery;
public class DefaultCountingOutRhymer {
	public static final int EMPTY = -1;
	public static final int VALUE = 12;
	public static final int CAPACITY = 11;

	private final int[] numbers = new int[VALUE];

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
			return EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}
}
