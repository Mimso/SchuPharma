package schupharma.model;

public class Patients {

    private static int Id;
    private static String Nom;
    private static String Email;
    private static String Prenom;
    private static int Mutuelle;
    private static int NumSecurite;
    private static int Age;
    private static int Tel;
    private static int CP;

    public void setId(int id) {
        this.Id = id;
    }
    public void setNom(String nom) {
        this.Nom = nom;
    }
    public void setPrenom(String prenom) {
        this.Prenom = prenom;
    }
    public void setEmail(String email) { this.Email = email; }
    public void setTel(int tel) {
        this.Tel = tel;
    }
    public void setCP(int CP) {
        this.CP = CP;
    }
    public void setMutuelle(int mutuelle) {
        this.Mutuelle = mutuelle;
    }
    public void setNumSecurite(int numSecurite) {
        this.NumSecurite = numSecurite;
    }
    public void setAge(int age) {
        this.Age = age;
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
    public String getEmail() { return Email; }
    public int getMutuelle() {
        return Mutuelle;
    }
    public int getNumSecurite() {
        return NumSecurite;
    }
    public int getAge() {
        return Age;
    }
    public int getTel() {
        return Tel;
    }
    public int getCP() {
        return CP;
    }
}