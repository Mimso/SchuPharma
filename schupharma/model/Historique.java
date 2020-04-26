package schupharma.model;

public class Historique {

    private static int Id;
    private static int IdInventaire;
    private static int Quantity;

    public void setId(int Id) {
        this.Id = Id;
    }
    public void setIdInventaire(int IdInventaire) {
        this.IdInventaire = IdInventaire;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }


    public int getId() {
        return Id;
    }
    public int getIdInventaire() {
        return IdInventaire;
    }
    public int getQuantity() {
        return Quantity;
    }

}
