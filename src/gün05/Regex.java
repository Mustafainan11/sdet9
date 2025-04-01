package gün05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //Alperen HOCANIN DERSİ
        String input = "Hello123";
        String regex =  ".*[a-z].*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("küçük harf içerir " + matcher + pattern);
        }else{
            System.out.println("Küçük Harf İçermiyor!");
        }

        String email = "uzum@gmail.com";
        String regex2 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";  // ---->  \\. = .
//BÜTÜN MAİLLERİ BULUN
        //SOSYAL MEDYADA GİRERKEN KOŞUT ŞART UYGUN MU
    }
}
