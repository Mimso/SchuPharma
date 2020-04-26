package schupharma.model;

public class Docteurs {

    private static int Id;
    private static String Nom;
    private static String Prenom;
    private static String Specialite;

    public void setId(int Id) {
        this.Id = Id;
    }
    public void setNom(String Nom) { this.Nom = Nom; }
    public void setPrenom(String prenom) {
        this.Prenom = prenom;
    }
    public void setSpecialite(String specialite) {
        this.Specialite = specialite;
    }

    public int getId() {
        return Id;
    }
    public String getNom() {
        return Nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public String getSpecialite() {
        return Specialite;
    }

}
