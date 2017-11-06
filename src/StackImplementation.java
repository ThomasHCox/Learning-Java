public class StackImplementation {
	int mArraySize;
	int[] mArray;
	int mTop;

	public StackImplementation(int size) {
		mArraySize = size;
		mArray = new int[mArraySize];
		mTop = -1;

	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("The array is full");
			return;
		}
		mTop++;
		mArray[mTop] = value;
		System.out.println("The following value has been added: " + value);

	}

	public void pop() {
		if (isEmpty()){
			System.out.println("The array is already empty");
			return;
		}
		mTop--;
		System.out.println("The following value has been removed: "
				+ mArray[mTop + 1]);
		//return mArray[mTop + 1]; // mTop-- is also acceptable here in place of
		// using it on line 21, it will use the
		// original value, then decrement it
	}

	public int peek() {
		return mArray[mTop];
	}

	public boolean isEmpty() {
		if (mTop == -1) {
			return true;
		} else {
			return false;
		}
		// return mTop == -1; //This is cleaner
	}

	public boolean isFull() {
		return mTop == (mArraySize - 1);
	}
}
