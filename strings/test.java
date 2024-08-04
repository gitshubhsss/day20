public class test {

    public static int numberOfSpecialChars(String word) {
        String str = word;
        String newString = "";
        //taking only single small characters
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                newString = newString + str.charAt(i);
            }
            count = 0;
            i++;
        }

        //unique characters string 
        int cnt = 0;
        int length = 0;
        for (int j = 0; j < newString.length(); j++) {
            for (int k = j + 1; k < newString.length(); k++) {
                if ((newString.charAt(j) - newString.charAt(k) == 32)
                        || (newString.charAt(j) - newString.charAt(k) == -32)) {
                    cnt++;
                }
            }

        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "abBCab";
        System.out.println(numberOfSpecialChars(str));
    }
    // now will find the the pairs

}
