package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "oreo" ;

        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed : "+pw+" Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED : "+pw+" Expected INVALID but got " + result1);
        }
        
        // Test Case 2: รหัสผ่านที่มีตัวอักษรพิมเล็กทั้งหมดจะ WEAK
        pw = "sasikann" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed : "+pw+" Lower password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED : "+pw+" Expected WEAK but got " + result2);
        }

         // Test Case 3: รหัสผ่านที่มีตัวอักษรพิมเล็กเเละพิมพ์ใหญ่จะ MEDIUM
        pw = "Sasikann" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed : "+pw+" Lower and Upper password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED : "+pw+" Expected MEDIUM but got " + result3);
        }
         // Test Case 4: รหัสผ่านที่มีตัวอักษรพิมเล็กเเละพิมพ์ใหญ่เเละตัวเลขเเละอักษรพิเศษจะ STRONG
        pw = "Sasikan_09" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed : "+pw+" Lower and Upper and digit and special password is STORNG.");
        } else {
            System.out.println("Test Case 4 FAILED : "+pw+" Expected STRONG but got " + result4);
        }


        System.out.println("--------------------------------");
    }
}
