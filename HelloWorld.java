class ToUpperCase {

    public static String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }

    // *********** TestCase 001 ********************

    public static boolean tc1AllUpperCase() {
        String input = "NIKHITHA";
        String expected = "NIKHITHA";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // ************* TestCase 002 ********************

    public static boolean tc2StringWithSpaces() {
        String input = "     ";
        String expected = "     ";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // *************** TestCase 003 ************

    public static boolean tc3EmptyString() {
        String input = "";
        String expected = "";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // ****************** TestCase 004************

    public static boolean tc4SmallCase() {
        String input = "nikhitha";
        String expected = "NIKHITHA";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // ******************** TestCase 005 **********

    public static boolean tc5Numbers() {
        String input = "858";
        String expected = "858";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // ******************** TestCase 006 ***************

    public static boolean tc6NumberSmallCase() {
        String input = "123nikhitha";
        String expected = "123NIKHITHA";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // *********************** TestCase 007 *************

    public static boolean tc7NumberSmallSpecial() {
        String input = "12nikhi&@!";
        String expected = "12NIKHI&@!";
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // **************** TestCase 008 *********

    public static boolean tc3Null() {
        String expected = null;
        String input = null;
        String result = toUpperCase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    // public static boolean tc1SingleChar(){
    // String expected="HELLO, WORLD!";
    // String input="Hello, World!";
    // String result=toUpperCase(input);
    // if(result.equals(expected)){
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    public static void main(String[] args) {

        System.out.println(tc1AllUpperCase());
        System.out.println(tc2StringWithSpaces());
        System.out.println(tc3EmptyString());
        System.out.println(tc4SmallCase());
        System.out.println(tc5Numbers());
        System.out.println(tc6NumberSmallCase());
        System.out.println(tc7NumberSmallSpecial());
        // System.out.println(tc3Null()); it throws an exception

    }

}
