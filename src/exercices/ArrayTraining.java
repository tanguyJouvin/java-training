public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(final int n) {
        final int[] newArray = new int[n];
        return newArray;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(final int n) {
        final String[] newArray = new String[n];
        return newArray;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(final int a, final int b, final int c) {
        final int[] newArray = new int[] { a, b, c };
        return newArray;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return a String array with a, b and c values, eg: {"test", sample", "value"}
     */
    public String[] stringArray(final String a, final String b, final String c) {
        final String[] newArray = new String[] { a, b, c };
        return newArray;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(final int[] array) {
        return array.length;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(final int[] array) {
        return array[0];
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(final int[] array) {
        return array[-1];
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(final int[] array, final int position) {

        return array[position];
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(final int[] array, final int value, final int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(final int[] array) {
        int sum = 0;
        for (final int value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(final int[] array, final int search) {
        for (final int value : array) {
            if (value == search) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(final String[] array) {
        String capitalizeStr = "";
        for (int i = 0; i < array.length; i++) {
            final String str = array[i];
            final String newStr = str.substring(0, 1).toUpperCase();
            final String strWithoutFirstLetter = str.substring(1);
            capitalizeStr = newStr + strWithoutFirstLetter;
            array[i] = capitalizeStr;
        }
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position, are
     *         equals, eg: false
     */
    public boolean equals(final int[] first, final int[] second) {
        if ( first == second)
            return true;

        int length = first.length;
        if (second.length != length)
            return false;

        for (int i = 0; i < length; i++) {
            Object o1 = first[i];
            Object o2 = second[i];
            if (!(o1==null ? o2==null : o1.equals(o2)))
                return false;
        }
        return true;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(final int[] array) {
        int n = array.length;
        int[] newArr = new int[n];
        for( int i = 0; i < n; i++){
            newArr[i -1] = array[i];
        }
        return newArr;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array, eg: {1, 2, 3, 4,
     *         5}
     */
    public int[] concat(final int[] first, final int[] second) {
        final int firstLength = first.length;
        final int secondLength = second.length;
        final int[] result = new int[firstLength + secondLength];
        int pos = 0;
        for (final int element : first) {
            result[pos] = element;
            pos++;
        }
        for (final int element : second) {
            result[pos] = element;
            pos++;
        }
        return result;
    }
}
