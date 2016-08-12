import java.util.IntSummaryStatistics;

/**
 * Created by win808mac on 8/10/16.
 */
public class Kata {


    /*Given a string, return a new string where spaces have been
    //inserted between each letter. Do not include any additional
    //spaces before the first character or after the last character. */

    public String explode(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            result = result.append(str.charAt(i));
            if (i == str.length() - 1)
                break;
            result = result.append(' ');
        }

        return (result.toString());
    }

    /* Given a string, return a new string where "not " has been
    //added to the front. However, if the string already begins with "not",
    //return the string unchanged. */

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not" + str;
        }
    }

    /* Given a non-empty string and an integer, return a new string where the character
    //at the specified index has been removed. The specified index will be a valid
    //index of in the original string (IE. n will be in the range 0 .. str.length()-1 inclusive). */

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());

        return front + back;
    }

    /*Given a string, return a new string where the first and last characters
    //have been exchanged. */

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    /*Given a string, we'll say that the front is the first 3 characters of
    //the string. If the string length is less than 3,
    //the front is whatever is there. Return a new string which is
    //3 copies of the front. */

    public String frontThree(String str) {

        if (str.length() >= 3) {
            String front = str.substring(0, 3);
            return front + front + front;
        } else return str;
    }

    /* Given a string, take the last character and return a new string
    //with the last character added at the front and back,
    //so "cat" yields "tcatt". The original string will be length 1 or more. */

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;

    }
    /* Given a string, take the first 2 characters and return the string with the
    //2 characters added at both the front and back, so "kitten" yields"kikittenki".
    //If the string length is less than 2, use whatever characters are there. */

    public String front22(String str) {
        if (str.length() >= 2) {
            String first2 = str.substring(0, 2);
            return first2 + str + first2;
        } else {
            return str;
        }

    }

    /* Given a string, if the string "del" appears starting at index 1,
    //return a string where that "del" has been deleted. Otherwise,
    //return the string unchanged. */

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }

    /*Given a string, return a string made of the first 2 characters (if present),
    //however include first char only if it is 'o' and include the second
    //only if it is 'z', so "ozymandias" yields "oz". */

    public String startOz(String str) {
        String result = "";

        if (str.length() > 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() > 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;

    }

     /*Given a string, return a new string where the last 3 characters are
     //now in upper case. If the string has less than 3 characters,
     //uppercase whatever is there. */

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int last3 = str.length() - 3;

        String front = str.substring(0, last3);
        String back = str.substring(last3);

        return front + back.toUpperCase();

    }
/// BONUS Explode code that I want to learn more about!!

    public String explode1(String str) {
        String wide = str.replaceAll(".(?=.)", "$0 ");

        return "BONUS Example of Explode code I found and want to learn more about " + wide;

    }
}

