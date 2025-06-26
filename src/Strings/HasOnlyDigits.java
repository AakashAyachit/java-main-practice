package Strings;

public class HasOnlyDigits {
    public static void main(String[] args) {
        String str = "12345";

        if (str.matches("\\d+")){
            System.out.println("string has only digits");
        }
        else {
            System.out.println("not all digits");
        }
    }

    //String str = "123456";
    //        boolean isDigitOnly = true;
    //
    //        for (int i = 0; i < str.length(); i++) {
    //            if (!Character.isDigit(str.charAt(i))) {
    //                isDigitOnly = false;
    //                break;
    //            }
    //        }
    //
    //        if (isDigitOnly) {
    //            System.out.println("String contains only digits.");
    //        } else {
    //            System.out.println("String contains non-digit characters.");
    //        }
    //    }
    //}
}
