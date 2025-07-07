package lib;

public class PasswordValidator {

    /**
     * @param รับข้อมูล password ที่เป็น String
     * @return ส่งค่าข้อมูลกลับที่เป็น invalid เเละค่าอื่น ๆ
     */
   
    public static PasswordStrength validate(String password) { 
        
        if( password == null || password.length() < 8 ){
            return PasswordStrength.INVALID;
        } 
            
        boolean Lower = false ;
        boolean Upper = false ;
        boolean Special = false ;
        boolean Digit =  false ;

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                Lower = true ;
            }else if(Character.isUpperCase(c)){
                Upper = true ;
            }else if(Character.isDigit(c)){
                Digit = true ;
            }else if(!Character.isLowerCase(c) && !Character.isUpperCase(c) && !Character.isDigit(c)){
                Special = true ;
            }
        }

        if(Lower && !Upper && !Special && !Digit) return PasswordStrength.WEAK;
        if(Lower && Upper && !Special && !Digit) return PasswordStrength.MEDIUM;
        if(Lower && Upper && Special && Digit) return PasswordStrength.STRONG;
        
        
        return PasswordStrength.INVALID; 
        
    }
}