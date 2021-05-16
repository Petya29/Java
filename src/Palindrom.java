public class Palindrom {
    static public void main(String[] args){
        StringBuffer strBuffer = new StringBuffer("11121");
        StringBuffer strReverse = new StringBuffer(strBuffer.reverse());
        //int capacity = strBuffer.capacity();
        if(strBuffer.toString().equals(strReverse.toString())) {
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }

    }
}
