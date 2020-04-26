package schupharma.model;

public class Inventaires {

    private int Id;
    private String Nom;
    private int Toxicite;
    private int Quantite;

    public void setId(int id) {
        this.Id = id;
    }
    public void setNom(String nom) {
        this.Nom = nom;
    }
    public void setToxicite(int toxicite) {
        this.Toxicite = toxicite;
    }
    public void setQuantite(int quantite) {
        this.Quantite = quantite;
    }

    public int getId() {
        return Id;
    }
    public String getNom() {
        return Nom;
    }
    public int getToxicite() {
        return Toxicite;
    }
    public int getQuantite() {
        return Quantite;
    }
}
