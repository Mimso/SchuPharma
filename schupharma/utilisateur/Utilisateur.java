package schupharma.utilisateur;

import com.mysql.cj.x.protobuf.MysqlxCursor;
import schupharma.db.MysqlConnector;
import schupharma.model.Docteurs;
import schupharma.model.Utilisateurs;
import schupharma.service.Opener;
import schupharma.views.Home;

import javax.swing.*;
import java.sql.ResultSet;

public class Utilisateur {

    private Opener open;
    protected String table = "utilisateurs";

    public boolean Connexion(Utilisateurs u) {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery(
                    "select * from " + table + " where identifiant = '" + u.getUtilisateur() + "'" +
                    " and mdp = '" + u.getMotdepasse() + "'");
            if(rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch(Exception e) {
            return false;
        }
    }
}
