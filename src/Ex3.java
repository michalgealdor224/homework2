public class Ex3 {
    public static void main(String[] args) {
        System.out.println(phoneNumber("972587106058"));
    }
    public static String phoneNumber(String str) {
        if (str.length() == 10 && str.charAt(0) == '0' && str.charAt(1) == '5') {
            return (subString(str, 0, 3) + '-'+subString(str, 3, 10));

        }
        if (str.length() == 11 && str.charAt(0) == '0' && str.charAt(1) == '5'
                 && str.charAt(3) == '-') {
            return str;
        }
        if (str.length() == 12 && str.charAt(0) == '9' && str.charAt(1) == '7'
                && str.charAt(2) == '2'  && str.charAt(3) == '5' ) {
            return ("0"+subString(str, 3, 5)+ "-" + subString(str, 5, 12));
        }
            else return " ";
    }
    public static String subString (String str, int start, int stop) {
        String str2 = " ";
        for (int i=start; i < stop; i++){
             str2 =str2 + str.charAt(i) ;
        }
        return str2;
    }
}
