class NumberSeparator {
    private int[] even;
    private int[] odd;
    private int evenCount;
    private int oddCount;

    public NumberSeparator(int size) {
        even = new int[size];
        odd = new int[size];
        evenCount = 0;
        oddCount = 0;
    }

    public void separateNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }
    }

    public int[] getEven() {
        int[] result = new int[evenCount];
        System.arraycopy(even, 0, result, 0, evenCount);
        return result;
    }

    public int[] getOdd() {
        int[] result = new int[oddCount];
        System.arraycopy(odd, 0, result, 0, oddCount);
        return result;
    }
}