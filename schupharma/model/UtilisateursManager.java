package schupharma.model;

import schupharma.db.MysqlConnector;
import schupharma.utilisateur.Utilisateur;

import java.sql.ResultSet;

public class UtilisateursManager {

    protected String table = "utilisateurs";

    public ResultSet select(Utilisateurs u) {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select * from " + table + " where identifiant = '" + u.getUtilisateur() + "'");
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
