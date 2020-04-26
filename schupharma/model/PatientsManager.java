package schupharma.model;

import schupharma.db.MysqlConnector;

import java.sql.ResultSet;

public class PatientsManager {

    protected String table = "patients";

    public boolean add(Patients p) {
        try {
            MysqlConnector.getCon()
                    .execute("insert into " + table + " (nom, prenom, mutuelle, num_securite, age, tel, email, cp) values " +
                                    "(" +
                                    "\"" + p.getNom() +  "\"" + ", " +
                                    "\"" + p.getPrenom() +  "\"" + ", " +
                                    "\"" + p.getMutuelle() +  "\"" + ", " +
                                    "\"" + p.getNumSecurite() +  "\"" + ", " +
                                    "\"" + p.getAge() +  "\"" + ", " +
                                    "\"" + p.getTel() +  "\"" + ", " +
                                    "\"" + p.getEmail() +  "\"" + ", "
                                    + p.getCP() + ")"
                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean delete(Patients p) {
        try {
            MysqlConnector.getCon()
                    .execute("delete from " + table + " where id = " + p.getId());
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean update(Patients p) {
        try {
                    MysqlConnector.getCon()
                    .execute(
                            "update " + table + " set "
                                    + " nom          = " + "\"" + p.getNom()         + "\"" + ","
                                    + " prenom       = " + "\"" + p.getPrenom()      + "\"" + ","
                                    + " mutuelle     = " + "\"" + p.getMutuelle()    + "\"" + ","
                                    + " num_securite = " + "\"" + p.getNumSecurite() + "\"" + ","
                                    + " age          = " + "\"" + p.getAge()         + "\"" + ","
                                    + " tel          = " + "\"" + p.getTel()         + "\"" + ","
                                    + " cp           = " + "\"" + p.getCP()          + "\""
                                    + " where id     = " + p.getId()
                    );
                    return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet selectById(Patients i) {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select * from " + table + " where id = " + i.getId());
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

    public ResultSet selectWithAlias() {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery("select id AS `PAT_ID`, nom AS `PAT_NAME`, prenom AS `PAT_NNAME` from " + table );
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
