package schupharma.model;

import schupharma.db.MysqlConnector;

import java.sql.ResultSet;

public class HistoriqueManager {

    protected String table = "historique";

    public boolean add(Historique h) {
        try {
            MysqlConnector.getCon()
                    .execute(
                            "insert into " + table + " (id_inv, qty) values " +
                                    "(" +
                                    "\"" + h.getIdInventaire() +  "\"" + ", " +
                                    + h.getQuantity() + ")"
                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean delete(Historique h) {
        try {
            MysqlConnector.getCon()
                    .execute("delete from " + table + " where id = " + h.getId());
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet selectAllWithAlias() {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select h.id AS `HIST_ID`, h.qty AS `HIST_QTY`, i.nom AS `INV_NOM`, i.toxicite AS `INV_TOX`, i.quantite AS `QTY_TOTAL` from " + table +
                    " AS h INNER JOIN inventaires AS i ON h.id_inv = i.id");
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
