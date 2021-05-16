
public class myScanner {
    static public void main(String[] args){
        String surname = "Serputowski";
        if(surname.charAt(0) != 'H') {
            surname = surname.replaceAll("h", "");
        }
        String zmina = surname.replace("t", "d");
        String zmina1 = zmina.replace("i", "e");
        String zmina2 = zmina1.replace("p", "b");
        String zmina3 = zmina2.replace("k", "c");
        String zmina4 = zmina3.replace("s", "c");
        String zmina5 = zmina4.replace("n", "m");
        String zmina6 = zmina5.replace("w", "v");
        String zmina7 = zmina6.replace("a", "g");
        System.out.println(zmina7);
        }
}
