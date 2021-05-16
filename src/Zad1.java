public class Zad1 {
    static public void main(String[] args){
        Pozycja p1= new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1.toString());
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2.toString());

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z.toString());
    }
}

class Pozycja{
    String nazwaTowaru;
    int ileSztuk;
    double cena;

    Pozycja(String nazwaTowaru, int ileSztuk, double cena){
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    double  obliczWartosc(){
        double wartosc = ileSztuk * cena;
        return wartosc;
    }

    @Override
    public String toString() {
        String myString = nazwaTowaru + "\t\t\t" + String.format("%.2f", cena) + " zł\t\t" + ileSztuk + " szt.\t\t" + String.format("%.2f", obliczWartosc()) + " zł";
        return myString;
    }

    double obliczWartoscWartosc(){
        double wartosc = ileSztuk * cena;
        if(ileSztuk > 5 && ileSztuk < 10){
            wartosc = wartosc - (wartosc * 0.05);
        }
        if(ileSztuk > 10 && ileSztuk < 20){
            wartosc = wartosc - (wartosc * 0.1);
        }
        if(ileSztuk > 20){
            wartosc = wartosc - (wartosc * 0.15);
        }
        return wartosc;
    }

}

class Zamowienie{
    Pozycja[] pozycja = new Pozycja[10];
    int ileDodanych;
    int maxSize = 10;

    Zamowienie() {
        Pozycja[] pozycja = new Pozycja[maxSize];
        int ileDodanych;
        int maxSize = 10;
    }

    Zamowienie(int ileDodanych){
        Pozycja[] pozycja = new Pozycja[ileDodanych];
    }

    void dodajPozycje(Pozycja p){
        if(pozycja[pozycja.length - 1] == null){
            for (int i = 0; i < pozycja.length; i++){
                if(pozycja[i] == null){
                    pozycja[i] = p;
                    i = pozycja.length;
                }else{
                    if(pozycja[i].nazwaTowaru == p.nazwaTowaru && pozycja[i].ileSztuk == p.ileSztuk && pozycja[i].cena == p.cena){
                        pozycja[i].ileSztuk++;
                        i = pozycja.length;
                    }
                }
            }
        }else{
            System.out.println("Tablica ma maksymalną liczbę elementów");
        }
    }

    double obliczWartosc(){
        double wartosc = 0;
        for(int i = 0; i < pozycja.length; i++){
            if(pozycja[i] != null){
                if(pozycja[i].ileSztuk > 5){
                    wartosc = wartosc + pozycja[i].obliczWartoscWartosc();
                }else{
                    wartosc = wartosc + pozycja[i].obliczWartosc();
                }
            }
        }
        return wartosc;
    }

    @Override
    public String toString() {
        String myString = "\nZamowienie: \n";
        for(int i = 0; i < pozycja.length; i++){
            if(pozycja[i] != null){
                myString = myString + pozycja[i].toString() + "\n";
            }
        }
        myString = myString + "\nRazem: " + String.format("%.2f", obliczWartosc());
        return myString;
    }

    void usunPozycje(int index){
        pozycja[index] = null;
    }

    void edytujPozycje(int index){

    }


}
