package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านมีแค่ตัวเลขหรือตัวอักษรมากกว่าหรือเท่ากับ 8 ตัว ควรจะ WEAK
        pw = "589565190";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected INVALID but got " + result2);
        }

        // Test Case 3: รหัสผ่านมีทั้งตัวเลข ตัวอักษรพิมพ์เล็กและใหญ่มากกว่าหรือเท่ากับ 8 ตัว ควรจะ MEDIUM
        pw = "Uhas1112";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : "+pw+" : Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected INVALID but got " + result3);
        }

        // Test Case 4: รหัสผ่านมีทั้งตัวเลข ตัวอักษรพิมพ์เล็กและใหญ่ และ อักษรพิเศษรวมกันมากกว่าหรือเท่ากับ 8 ตัว ควรจะ STRONG
        pw = "Uhas@1112";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 : "+pw+" : Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected INVALID but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
