import java.lang.String;
public class Ex1 {
    public static void main(String[] args) {
            String str1 = "i love apples";
            String str2 = "apple";
            System.out.println(contain(str1, str2));
            }

        public static boolean contain(String str1, String str2) {
            boolean isContain = false;
            int count = 0;
            if (str2.length() < str1.length()) {
                for (int i = 0; i < str1.length(); i++) {
                    if (count == str2.length()) {
                        break;
                    }
                    if (str2.charAt(count) != str1.charAt(i)) {
                        count = 0;
                    }
                    if (str1.charAt(i) == str2.charAt(count)) {
                        count++;
                    }

                }
            }

            if (count == str2.length()) {
                isContain = true;
            }


            return isContain;
        }
    }

