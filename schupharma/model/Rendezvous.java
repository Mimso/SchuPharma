package schupharma.model;

import java.util.Date;

public class Rendezvous {

    private static int Id;
    private static int DocteurId;
    private static int PatientId;
    private static Date Date;
    private static String DateStr;

    public int getId() {
        return Id;
    }
    public int getDocteurId() { return DocteurId; }
    public int getPatientId() { return PatientId; }
    public Date getDate() {
        return Date;
    }
    public String getDateStr() { return DateStr; }

    public void setId(int id) {
        this.Id = id;
    }
    public void setDocteurId(int docteur_id) {
        this.DocteurId = docteur_id;
    }
    public void setPatientId(int patient_id) {
        this.PatientId = patient_id;
    }
    public void setDate(Date date) { this.Date = date; }
    public void setDateStr(String dateStr) { this.DateStr = dateStr; }
}
