public class FundamentalsTraining {

    /**
     * @param value, eg: 2
     * @return the same value, eg: 2
     */
    public static int sameValue(final int value) {
        return value;
    }

    /**
     * @param value, eg: 2
     * @return one added to the value, eg: 3
     */
    public static int addOne(final int value) {
        final int value1 = value + 1;
        return value1;
    }

    /**
     * @param first,  eg: 2
     * @param second, eg: 3
     * @return first added to second, eg: 5
     */
    public static int addValues(final int first, final int second) {
        final int addition = first + second;
        return addition;
    }

    /**
     * @param value, eg: 11
     * @return true if value superior to 10, eg: true
     */
    public static boolean isValueSuperiorToTen(final int value) {
        if (value > 10)
            return true;
        return false;
    }

    /**
     * @param value, eg: -1
     * @return true if value inferior or equals to 0, eg: true
     */
    public static boolean isValueZeroOrNegative(final int value) {
        if(value <= 0){
            return true;
        }  
        return false;
    }

    /**
     * @param first,  eg: 1
     * @param second, eg: 1
     * @return true if first equals second, eg: true
     */
    public static boolean areValuesEquals(final int first, final int second) {
        if(first == second){
            return true;
        }
            return false;
    }

    /**
     * @param first,  eg: 2
     * @param second, eg: 1
     * @return true if first is superior to second, eg: true
     */
    public static boolean isFirstSuperiorToSecond(final int first, final int second) {
        if(first > second){
            return true;
        }
            return false;
    }

    /**
     * @param value, eg: 2
     * @return true if value is even, eg: true
     */
    public static boolean isValueEven(final int value) {
        return value %2 == 0;
    }

    /**
     * @param value, eg: 3
     * @return true if value is odd, eg: true
     */
    public static boolean isValueOdd(final int value) {
        return value %2 == 1;
    }

    /**
     * @param value,   eg: 6
     * @param divider, eg: 3
     * @return true if value can be divided by divider, eg: true
     */
    public static boolean canValueBeDivided(final int value, final int divider) {
        int result = value / divider;
        if(result %2 == 0){
            return true;
        }
        return false;
    }

    /**
     * @param value, eg: true
     * @return the string "true" if value is true, the string "false" otherwise, eg:
     *         "true"
     */
    public static String trueOrFalse(final boolean value) {
        return value ? "true" : "false";
    }

    /**
     * @param value, eg: 1
     * @return the string "one" if value is 1, the string "zero" if value is 0, the
     *         string "other" otherwise, eg: "one"
     */
    public static String zeroOrOneOrOther(final int value) {
        if(value == 1){
            return "one";
        }else if(value == 0){
            return "zero";
        }
        return "other";
    }

    /**
     * @param first,  eg: 1
     * @param second, eg: 1
     * @return the string "inferior" if first is inferior to second, the string
     *         "superior" if first is superior to second, the string "equals"
     *         otherwise, eg: "equals"
     */
    public static String inferiorOrSuperiorOrEquals(final int first, final int second) {
        if(first < second){
            return "inferior";
        }else if(first > second){
            return "superior";
        }
        return "equals";
    }

    /**
     * @param first,  eg: 4
     * @param second, eg: 3
     * @return first plus second if first inferior to second, first minus second if
     *         first superior or equals to second, eg: 1
     */
    public static int addIfInferiorSubstractIfSuperiorOrEquals(final int first, final int second) {
        if(first < second){
            return first + second;
        }else{
            return first - second;
        }
    }

    /**
     * @param first,  eg: true
     * @param second, eg: false
     * @return true if first or second value is true, eg: true
     */
    public static boolean firstOrSecond(final boolean first, final boolean second) {
        if(first == true || second == true) {
            return true;
        }
        return false;
    }

    /**
     * @param first,  eg: true
     * @param second, eg: false
     * @return true if first and second value is true, eg: false
     */
    public static boolean firstAndSecond(final boolean first, final boolean second) {
        return first && second;
    }

    /**
     * @param first,  eg: false
     * @param second, eg: false
     * @return true if first and second value are equals, eg: true
     */
    public static boolean booleanEquals(final boolean first, final boolean second) {
        return first == second;
    }

    /**
     * @param value, eg: true
     * @return false if value is true, true otherwise, eg: false
     */
    public static boolean notValue(final boolean value) {
        if(!value) {
            return true;
        }
        return false;
    }

    /**
     * @param first,      eg: 4
     * @param second,     eg: 3
     * @param isNotFirst, eg: false
     * @return first value if isNotFirst is false, second value otherwise, eg: 4
     */
    public static int whichValueIsThis(final int first, final int second, final boolean isNotFirst) {
        return !isNotFirst ? first : second;
    }
}
