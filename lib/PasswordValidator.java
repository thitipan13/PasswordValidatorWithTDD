package lib;

public class PasswordValidator {

    /*
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * INVALID รหัสสั้นกว่า 8 ตัว
     * WEAK รหัสมีแค่ตัวเลขหรือตัวอักษรมากกว่าหรือเท่ากับ 8 ตัว
     * MEDIUM รหัสมีทั้งตัวเลข ตัวอักษรพิมพ์เล็กและใหญ่มากกว่าหรือเท่ากับ 8 ตัว
     * STRONG รหัสมีทั้งตัวเลข ตัวอักษรพิมพ์เล็กและใหญ่ และ อักษรพิเศษรวมกันมากกว่าหรือเท่ากับ 8 ตัว
     * return ความยากง่ายของรหัส
     * hasDigits เช็คตัวเลข
     * hsaLower เช็คตัวพิมพ์เล็ก
     * hasUpper เช็คตัวพิมพ์ใหญ่
     * hasSpacial เช็คอักษรพิเศษ
     * count นับรหัสที่ถูกต้อง
    */
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 

        if (password==null || password.length()<8) 
            return PasswordStrength.INVALID ;

        boolean hasDigit = false;
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasSpacial = false ;

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true ;
            }else if(Character.isLowerCase(c)){
                hasLower = true ;
            }else if (Character.isUpperCase(c)) {
                hasUpper = true ;
            }else
                hasSpacial = true ;
        }

        int count = 0;
        
        if(hasDigit) count++;
        if(hasLower) count++;
        if(hasUpper) count++;
        if(hasSpacial) count++;
        
        if(count == 4) return PasswordStrength.STRONG ;
        if(count == 3) return PasswordStrength.MEDIUM ;
        if(count == 1) return PasswordStrength.WEAK ;
        return null;

    }
}
