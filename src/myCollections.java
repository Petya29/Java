import java.util.ArrayList;

public class myCollections {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("9");
        arr.add("9");
        arr.add("9");
        arr.add("9");
        int max = 0;
        int minutes = 0;
            if((Integer.parseInt(arr.get(0)+arr.get(1))) > max){
                int temp = Integer.parseInt(arr.get(0)+arr.get(1));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(0)+arr.get(2))) > max){
                int temp = Integer.parseInt(arr.get(0)+arr.get(2));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(0)+arr.get(3))) > max){
                int temp = Integer.parseInt(arr.get(0)+arr.get(3));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(1)+arr.get(0))) > max){
                int temp = Integer.parseInt(arr.get(1)+arr.get(0));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(1)+arr.get(2))) > max){
                int temp = Integer.parseInt(arr.get(1)+arr.get(2));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(1)+arr.get(3))) > max){
                int temp = Integer.parseInt(arr.get(1)+arr.get(3));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(2)+arr.get(0))) > max){
                int temp = Integer.parseInt(arr.get(2)+arr.get(0));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(2)+arr.get(1))) > max){
                int temp = Integer.parseInt(arr.get(2)+arr.get(1));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(2)+arr.get(3))) > max){
                int temp = Integer.parseInt(arr.get(2)+arr.get(3));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(3)+arr.get(0))) > max){
                int temp = Integer.parseInt(arr.get(3)+arr.get(0));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(3)+arr.get(1))) > max){
                int temp = Integer.parseInt(arr.get(3)+arr.get(1));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if((Integer.parseInt(arr.get(3)+arr.get(2))) > max){
                int temp = Integer.parseInt(arr.get(3)+arr.get(2));
                if(temp < 24) max = temp;
                if(temp > minutes && temp < 60) minutes = temp;
            }
            if(max == 0){
                System.out.println(max + "0:" + minutes);
            }else{
                System.out.println(max + ":" + minutes);
            }

    }
}
