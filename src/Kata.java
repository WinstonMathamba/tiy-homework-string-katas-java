/**
 * Created by win808mac on 8/10/16.
 */
public class Kata {


    /*Given a string, return a new string where spaces have been
    //inserted between each letter. Do not include any additional
    //spaces before the first character or after the last character. */

    public String explode(String str) {

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++)
        {
            result = result.append(str.charAt(i));
            if(i == str.length()-1)
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
        }

        return "not " + str;
    }

    /* Given a non-empty string and an integer, return a new string where the character
    //at the specified index has been removed. The specified index will be a valid
    //index of in the original string (IE. n will be in the range 0 .. str.length()-1 inclusive). */

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());

        return front + back;
    }

    /*Given a string, return a new string where the first and last characters
    //have been exchanged. */

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    /*Given a string, we'll say that the front is the first 3 characters of
    //the string. If the string length is less than 3,
    //the front is whatever is there. Return a new string which is
    //3 copies of the front. */

    public String frontThree(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }


}

