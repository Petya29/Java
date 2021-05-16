import java.util.Arrays;

public class Anagram {
    static public void main(String[] args){
        String isAnagram1 = "niedziela";
        String isAnagram2 = "dzieliena";
        char charArray[] = isAnagram1.toCharArray();
        Arrays.sort(charArray);
        char charArray2[] = isAnagram2.toCharArray();
        Arrays.sort(charArray2);
        if(charArray == charArray2){
            System.out.println("is Anagram");
        }else{
            System.out.println("is not Anagram");
        }
        System.out.println(charArray);
        System.out.println(charArray2);
    }
}
