public class specialChar {
    public static int numberOfSpecialChars(String word) {
        int count = 0;
        int length = 0;
        // AAABCBC
        String newString = word;
        // AAABCBC
        int i = 0;
        while (i < newString.length()) {

            if (i == 0) {
                if (Character.isUpperCase(newString.charAt(i))) {
                    for (int j = i + 1; j < newString.length(); j++) {
                        if (newString.toLowerCase().charAt(i) == newString.charAt(j)) {
                            count++;
                            if (count == 1) {
                                length++;
                            }
                        }
                    }
                } 
            } else if (Character.isUpperCase(newString.charAt(i))) {
                for (int j = i - 1; j >= 0; j--) {
                    if (newString.toLowerCase().charAt(i) == newString.charAt(j)) {
                        count++;
                        if (count == 1) {
                            length++;
                        }
                    }
                }
            }else{
                for(int j=i+1;j<newString.length();j++){
                    if(Character.isUpperCase(newString.charAt(j))){
                        if(newString.charAt(i)==newString.toLowerCase().charAt(j)){
                            count++;
                            if (count == 1) {
                                length++;
                            }
                        }
                    }
                }
            }

            count = 0;
            i++;
        }
        return length;

    }

    public static void main(String[] args) {
        String words = "aAA";
        System.out.println(numberOfSpecialChars(words));
    }
}