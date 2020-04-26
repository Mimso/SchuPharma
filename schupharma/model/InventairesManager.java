package schupharma.model;

import schupharma.db.MysqlConnector;

import java.sql.ResultSet;

public class InventairesManager {

    protected String table = "inventaires";

    public boolean add(Inventaires i) {
        try {
            MysqlConnector.getCon()
                    .execute("insert into " + table + " (nom, toxicite, quantite) values " +
                                    "(" +
                                    "\"" + i.getNom() +  "\"" + ", " +
                                    "\"" + i.getToxicite() +  "\"" + ", "
                                    + i.getQuantite() + ")"
                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean delete(Inventaires i) {
        try {
            MysqlConnector.getCon()
                    .execute("delete from " + table + " where id = " + i.getId());
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean update(Inventaires i) {
        try {
            MysqlConnector.getCon()
                    .execute(
                            "update " + table + " set "
                                    + " quantite     = " + "\"" + i.getQuantite()          + "\""
                                    + " where id     = " + i.getId()
                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean updateQTY(Inventaires i) {
        try {
            MysqlConnector.getCon()
                    .execute(
                            "update " + table + " set "
                                    + " quantite     = " + "\"" + i.getQuantite()          + "\""
                                    + " where id     = " + i.getId()                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet selectWithAlias(Inventaires i) {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select id AS `INV_ID`, quantite AS `INV_QTY` from " + table + " where id = " + i.getId());
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ResultSet selectAll() {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select * from " + table );
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
