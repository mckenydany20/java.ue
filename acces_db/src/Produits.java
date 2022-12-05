
import java.time.LocalDate;
public class Produits {
    private int id;
    private String designation;
    private int qte;
    private double prix;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Produits(int id, String designation, int qte, double prix, LocalDate date) {
        this.id = id;
        this.designation = designation;
        this.qte = qte;
        this.prix = prix;
        this.date = date;
    }
}


