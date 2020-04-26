package schupharma.model;

import schupharma.db.MysqlConnector;

import java.sql.ResultSet;

public class RendezvousManager {

    protected String table = "rendezvous";
    protected String tablePatient = "patients";
    protected String tableDocteur = "docteurs";

    public boolean add(Rendezvous r) {
        try {
            MysqlConnector.getCon()
                    .execute("insert into " + table + " (docteur_id, patient_id, date) values " +
                                    "(" +
                                    "\"" + r.getDocteurId() +  "\"" + ", " +
                                    "\"" + r.getPatientId() +  "\"" + ", "
                                         + r.getDateStr() + ")"
                    );
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean delete(Rendezvous r) {
        try {
            MysqlConnector.getCon()
                    .execute("delete from " + table + " where id = " + r.getId());
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet selectRDVJoinDocAndPat() {
        try {
            ResultSet rs = MysqlConnector.getCon().executeQuery( "select " +
                                                                    "       rv.id          AS `RDV_ID`,\n" +
                                                                    "       rv.docteur_id  AS `RDV_DOC_ID`,\n" +
                                                                    "       rv.patient_id  AS `RDV_PAT_ID`,\n" +
                                                                    "       rv.date        AS `RDV_DATE`,\n" +
                                                                    "       d.id           AS `DOC_ID`, \n" +
                                                                    "       d.nom          AS `DOC_NOM`,\n" +
                                                                    "       d.prenom       AS `DOC_PRENOM`,\n" +
                                                                    "       d.specialite   AS `DOC_SPE`,\n" +
                                                                    "       p.id           AS `PAT_ID`,\n" +
                                                                    "       p.nom          AS `PAT_NOM`,\n" +
                                                                    "       p.prenom       AS `PAT_PRENOM`,\n" +
                                                                    "       p.tel          AS `PAT_TEL`\n" +
                                                                    "FROM " + table + " AS rv \n" +
                                                                    "INNER JOIN " + tablePatient + " AS p\n" +
                                                                    "ON rv.patient_id = p.id \n" +
                                                                    "INNER JOIN " + tableDocteur + " AS d\n" +
                                                                    "ON rv.docteur_id = d.id LIMIT 50"
            );
            return rs;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
