public class zad10zad11 {
    static public void main(String[] args){
        Figura fig = new Figura();
        fig.Display();

        Koło koło = new Koło(3,"Koło");
        koło.Wyswietl();

        Kula kula = new Kula(3, "Kula");
        kula.Wyswietl();

        Stożek stożek = new Stożek(3, 5, "Stożek");
        stożek.Wyswietl();

        Walec walec = new Walec(3, 5, "Walec");
        walec.Wyswietl();
    }
}

class Figura{
    String pole;

    Figura(){
        pole = "Figura geometryczna";
    }

    Figura(String itsPole){
        pole = itsPole;
    }

    void Display(){
        System.out.println(pole);
    }
}

class Koło extends Figura{
    double promieńKoła;

    Koło(){
        super("Koło");
        promieńKoła = 0;
    }

    Koło(String itsPole){
        super(itsPole);
        promieńKoła = 0;
    }

    Koło(double itsPromieńKoła){
        super("Koło");
        promieńKoła = itsPromieńKoła;
    }

    Koło(double itsPromieńKoła, String itsPole){
        super(itsPole);
        promieńKoła = itsPromieńKoła;
    }

    double Pole(){
        double S = 3.1415 * (promieńKoła * promieńKoła);
        return S;
    }

    void Wyswietl(){
        String result = "Figura geometryczna – " + pole + ", pole figury: " + Pole();
        System.out.println(result);
    }
}

class Kula extends Koło{
    Kula(){
        super("Kula");
    }

    Kula(String itsPole){
        super(itsPole);
    }

    Kula(double itsPromień){
        super(itsPromień, "Kula");
    }

    Kula(double itsPromień, String itsPole){
        super(itsPromień, itsPole);
    }

    double Pole(){
        double S = 4 * 3.1415 * (promieńKoła * promieńKoła);
        return S;
    }

    double Objetosc() {
        double V = (4/3) * 3.1415 * (promieńKoła * promieńKoła * promieńKoła);
        return V;
    }

    void Wyswietl(){
        String result = "Figura geometryczna – " + pole + ", pole figury: " + Pole() + ", objętość: " + Objetosc();
        System.out.println(result);
    }
}

class Stożek extends Koło{
    double wysokość;

    Stożek(){
        super("Stożek");
    }

    Stożek(String itsPole){
        super(itsPole);
    }

    Stożek(double itsPromień){
        super(itsPromień, "Stożek");
    }

    Stożek(double itsPromień, String itsPole){
        super(itsPromień, itsPole);
    }

    Stożek(double itsPromień, double itsWysokość, String itsPole){
        super(itsPromień, itsPole);
        wysokość = itsWysokość;
    }

    Stożek(double itsPromień, double itsWysokość){
        super(itsPromień);
        wysokość = itsWysokość;
    }

    double Pole(){
        double S = 3.1415 * promieńKoła * wysokość;
        return S;
    }

    double Objetosc() {
        double V = 0.33 * 3.1415 * (promieńKoła * promieńKoła) * wysokość;
        return V;
    }

    void Wyswietl(){
        String result = "Figura geometryczna – " + pole + ", pole figury: " + Pole() + ", objętość: " + Objetosc();
        System.out.println(result);
    }
}

class Walec extends Koło{
    double wysokość;

    Walec(){
        super("Walec");
    }

    Walec(String itsPole){
        super(itsPole);
    }

    Walec(double itsPromień){
        super(itsPromień, "Walec");
    }

    Walec(double itsPromień, String itsPole){
        super(itsPromień, itsPole);
    }

    Walec(double itsPromień, double itsWysokość, String itsPole){
        super(itsPromień, itsPole);
        wysokość = itsWysokość;
    }

    Walec(double itsPromień, double itsWysokość){
        super(itsPromień);
        wysokość = itsWysokość;
    }

    double Pole(){
        double S = 2 * 3.1415 * promieńKoła * wysokość;
        return S;
    }

    double Objetosc() {
        double V = 3.1415 * (promieńKoła * promieńKoła) * wysokość;
        return V;
    }

    void Wyswietl(){
        String result = "Figura geometryczna – " + pole + ", pole figury: " + Pole() + ", objętość: " + Objetosc();
        System.out.println(result);
    }
}
