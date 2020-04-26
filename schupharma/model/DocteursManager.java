package schupharma.model;

import schupharma.db.MysqlConnector;

import java.sql.ResultSet;

public class DocteursManager {

    protected String table = "docteurs";

    public boolean add(Docteurs d) {
        try {
            MysqlConnector.getCon()
                    .execute(
                            "insert into " + table + " (nom, prenom, specialite) values " +
                                    "(" +
                                    "\"" + d.getNom() +  "\"" + ", " +
                                    "\"" + d.getPrenom() +  "\"" + ", "
                                    + d.getSpecialite() + ")"
                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean delete(Docteurs d) {
        try {
            MysqlConnector.getCon()
                    .execute("delete from " + table + " where id = " + d.getId());
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // selectById est une méthode qui renvoit un objet de type docteur
    // rs est une variable de type ResultSet qui contient le tableau des resultats obtenu en bdd
    //
    public Docteurs selectById(Docteurs d) {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select * from " + table + " where id = " + d.getId());
            Docteurs docteurs = null;
            while(rs.next())
                docteurs = new Docteurs();
                docteurs.setId(rs.getInt(1));
                docteurs.setNom(rs.getString(2));
                docteurs.setPrenom(rs.getString(3));
                docteurs.setSpecialite(rs.getString(4));
                return docteurs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ResultSet selectWithAlias() {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select id AS `DOC_ID`, nom AS `DOC_NAME`, prenom AS `DOC_NNAME`, specialite AS `DOC_SPE` from " + table );
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
