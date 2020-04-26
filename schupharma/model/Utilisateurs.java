package schupharma.model;

public class Utilisateurs {

    private static int id;
    private static String utilisateur;
    private static String motdepasse;
    private static int role;

    public void setId(int id) {
        this.id = id;
    }
    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    public void setRole(int role) {
        this.role = role;
    }

    public int getId() { return id; }
    public String getUtilisateur() { return utilisateur; }
    public String getMotdepasse() {
        return motdepasse;
    }
    public int getRole() {
        return role;
    }

}
