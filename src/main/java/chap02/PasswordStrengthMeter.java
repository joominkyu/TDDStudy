package chap02;

import java.util.List;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){
        return null;
    }
    //비밀번호 길이
    public boolean passwordLengthCheck(String s){
        boolean result = false;
        if(s.length()>8){
            result = true;
        }
        return result;
    }
    //비밀번호 숫자 사용 여부
    public boolean passwordUseNumCheck(String s){
        boolean result = false;
        List<String> passwordList;
        
        if(s.length()>8){
            result = true;
        }
        return result;
    }
}
