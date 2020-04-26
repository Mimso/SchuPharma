package schupharma.service;

import schupharma.views.Home;
import schupharma.views.gestion.GestionAdministration;
import schupharma.views.gestion.GestionStocks;
import schupharma.views.stock.Historique;
import schupharma.views.patient.AjouterPatient;
import schupharma.views.patient.GestionDesPatients;
import schupharma.views.patient.ModifierPatient;
import schupharma.views.rendezvous.AjouterRDV;
import schupharma.views.rendezvous.GestionDesRDV;

import javax.swing.*;
import java.sql.SQLException;

public class Opener {

    public void closeCurrentFrame(JFrame currentFrame) {
        currentFrame.dispose();
    }

    //accueil
    public void Home(JFrame currentFrame) {
        currentFrame.dispose();
        Home view = new Home();
        view.setVisible(true);
    }
    //---


    //page gestion
    public void GestionAdministration(JFrame currentFrame) {
        currentFrame.dispose();
        GestionAdministration view = new GestionAdministration();
        view.setVisible(true);
    }

    public void GestionStocks(JFrame currentFrame) throws SQLException {
        currentFrame.dispose();
        GestionStocks view = new GestionStocks();
        view.setVisible(true);
    }
    //---


    //patient
    public void AjouterPatient(JFrame currentFrame) {
        currentFrame.dispose();
        AjouterPatient view = new AjouterPatient();
        view.setVisible(true);
    }

    public void GestionDesPatients(JFrame currentFrame) throws SQLException {
        currentFrame.dispose();
        GestionDesPatients view = new GestionDesPatients();
        view.setVisible(true);
    }

    public void ModifierPatient(JFrame currentFrame, int patientId) {
        currentFrame.dispose();
        ModifierPatient view = new ModifierPatient(patientId);
        view.setVisible(true);
    }
    //---


    //rdv
    public void AjouterRDV(JFrame currentFrame) throws SQLException {
        currentFrame.dispose();
        AjouterRDV view = new AjouterRDV();
        view.setVisible(true);
    }

    public void GestionDesRDV(JFrame currentFrame) throws SQLException {
        currentFrame.dispose();
        GestionDesRDV view = new GestionDesRDV();
        view.setVisible(true);
    }
    //---

    public void Historique(JFrame currentFrame) throws SQLException {
        currentFrame.dispose();
        Historique view = new Historique();
        view.setVisible(true);
    }
}
