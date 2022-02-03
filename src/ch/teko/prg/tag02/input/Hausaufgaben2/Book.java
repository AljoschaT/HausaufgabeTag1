public class Book {

    static void print(String text) { System.out.println(text); }

    public String titel;
    public String autor;
    public Double preis;
    public int kaufjahr;


    public Book(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.preis = 0.0;
        this.kaufjahr = -1;
    }

    public Book(String titel, String autor, Double preis, int kaufjahr) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.kaufjahr = kaufjahr;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    public int getKaufjahr() {
        return kaufjahr;
    }


    public void setKaufjahr(int kaufjahr) {
        this.kaufjahr = kaufjahr;
    }

    public static void main(String[] args) {

        String owaehrung = ".- ChF ";
        String oTitel = " Buchtitel: ";
        String oAutor = "\n Autor: ";
        String oPreis = "\n Buchpreis: ";
        String oKaufjahr = "\n Kaufjahr: ";

        Book book1 = new Book("Blackout", "Marc Elsberg", 21.21, 2021  );
        print(oTitel + book1.getTitel() + oAutor + book1.getAutor() + oPreis + book1.getPreis() + owaehrung + oKaufjahr + book1.getKaufjahr());

    }


}
