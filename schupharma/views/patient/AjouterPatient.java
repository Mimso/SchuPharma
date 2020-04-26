/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schupharma.views.patient;

import schupharma.model.Patients;
import schupharma.model.PatientsManager;
import schupharma.service.Opener;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import static javax.swing.BorderFactory.createLineBorder;

/**
 * @author Anthony
 * @author marie
 */
public class AjouterPatient extends javax.swing.JFrame {

    private JButton home_button_connexion;
    private JButton home_button_connexion1;
    private JLabel home_label_identifiant1, home_label_identifiant2, home_label_identifiant3,  home_label_identifiant4, home_label_identifiant5, home_label_identifiant6, home_label_identifiant7, home_label_nom;
    private JTextField home_textfield_prenom, home_textfield_tel, home_textfield_mutuelle, home_textfield_nsecurite, home_textfield_email, home_textfield_cp, home_textfield_age, home_textfield_nom;
    private JPanel jPanel1,jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7;
    private JSeparator jSeparator2, jSeparator3, jSeparator4, jSeparator5, jSeparator6, jSeparator7, jSeparator8, jSeparator9;
    private JLabel jLabel1, stock_image_house, stock_image_house1, stock_image_house2, stock_image_logo;
    private Opener open;

    public AjouterPatient() {
        initComponents();
        setResizable(false);
        jPanelMouseListener();
    }

    private void initComponents() {

        jPanel2                     = new JPanel();
        jPanel3                     = new JPanel();
        stock_image_logo            = new JLabel();
        jPanel5                     = new JPanel();
        stock_image_house           = new JLabel();
        jPanel6                     = new JPanel();
        stock_image_house1          = new JLabel();
        jPanel7                     = new JPanel();
        stock_image_house2          = new JLabel();
        jPanel1                     = new JPanel();
        home_label_nom              = new JLabel();
        home_textfield_nom          = new JTextField();
        jSeparator2                 = new JSeparator();
        home_label_identifiant1     = new JLabel();
        home_textfield_prenom       = new JTextField();
        jSeparator3                 = new JSeparator();
        home_label_identifiant2     = new JLabel();
        home_textfield_tel          = new JTextField();
        jSeparator4                 = new JSeparator();
        home_label_identifiant3     = new JLabel();
        home_textfield_mutuelle     = new JTextField();
        jSeparator5                 = new JSeparator();
        home_label_identifiant4     = new JLabel();
        home_textfield_nsecurite    = new JTextField();
        jSeparator6                 = new JSeparator();
        home_label_identifiant5     = new JLabel();
        home_textfield_email        = new JTextField();
        jSeparator7                 = new JSeparator();
        home_label_identifiant6     = new JLabel();
        home_textfield_cp           = new JTextField();
        jSeparator8                 = new JSeparator();
        home_label_identifiant7     = new JLabel();
        home_textfield_age          = new JTextField();
        jSeparator9                 = new JSeparator();
        home_button_connexion       = new JButton();
        jLabel1                     = new JLabel();
        jPanel4                     = new JPanel();
        home_button_connexion1      = new JButton();
        open                        = new Opener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(164, 201, 255));
        jPanel3.setForeground(new Color(255, 255, 255));

        stock_image_logo.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/logo.png"))); // NOI18N

        jPanel5.setBackground(new Color(148, 191, 255));

        stock_image_house.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house.setForeground(new Color(255, 255, 255));
        stock_image_house.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/being_sick_80px.png"))); // NOI18N
        stock_image_house.setText("Gestion des patients");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house)
                .addGap(43, 43, 43))
        );

        jPanel6.setBackground(new Color(148, 191, 255));

        stock_image_house1.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house1.setForeground(new Color(255, 255, 255));
        stock_image_house1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/meeting_80px.png"))); // NOI18N
        stock_image_house1.setText("Gestion des rendez-vous");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house1)
                .addGap(43, 43, 43))
        );

        jPanel7.setBackground(new Color(148, 191, 255));

        stock_image_house2.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house2.setForeground(new Color(255, 255, 255));
        stock_image_house2.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/export_80px.png"))); // NOI18N
        stock_image_house2.setText("Déconnexion ");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house2)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house2)
                .addGap(43, 43, 43))
        );

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stock_image_logo)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stock_image_logo)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        home_label_nom.setBackground(new Color(0, 0, 0));
        home_label_nom.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_nom.setText("Nom");

        home_textfield_nom.setBorder(null);

        jSeparator2.setBackground(new Color(0, 0, 0));

        home_label_identifiant1.setBackground(new Color(0, 0, 0));
        home_label_identifiant1.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant1.setText("Prénom");

        home_textfield_prenom.setBorder(null);

        jSeparator3.setBackground(new Color(0, 0, 0));

        home_label_identifiant2.setBackground(new Color(0, 0, 0));
        home_label_identifiant2.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant2.setText("Numéro de téléphone");

        home_textfield_tel.setBorder(null);

        jSeparator4.setBackground(new Color(0, 0, 0));

        home_label_identifiant3.setBackground(new Color(0, 0, 0));
        home_label_identifiant3.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant3.setText("Mutuelle (10)");

        home_textfield_mutuelle.setBorder(null);

        jSeparator5.setBackground(new Color(0, 0, 0));

        home_label_identifiant4.setBackground(new Color(0, 0, 0));
        home_label_identifiant4.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant4.setText("Numéro de sécurité sociale (8)");

        home_textfield_nsecurite.setBorder(null);

        jSeparator6.setBackground(new Color(0, 0, 0));

        home_label_identifiant5.setBackground(new Color(0, 0, 0));
        home_label_identifiant5.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant5.setText("Adresse e-mail");

        home_textfield_email.setBorder(null);

        jSeparator7.setBackground(new Color(0, 0, 0));

        home_label_identifiant6.setBackground(new Color(0, 0, 0));
        home_label_identifiant6.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant6.setText("Code postal");

        home_textfield_cp.setBorder(null);

        jSeparator8.setBackground(new Color(0, 0, 0));

        home_label_identifiant7.setBackground(new Color(0, 0, 0));
        home_label_identifiant7.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant7.setText("Age");

        home_textfield_age.setBorder(null);

        jSeparator9.setBackground(new Color(0, 0, 0));

        home_button_connexion.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_button_connexion.setText("Retour");
        home_button_connexion.setBorder(createLineBorder(new Color(102, 102, 255)));
        home_button_connexion.setContentAreaFilled(false);
        home_button_connexion.setFocusPainted(false);
        home_button_connexion.addActionListener(evt -> {
            try {
                home_button_connexionActionPerformed(evt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/add.png"))); // NOI18N

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        home_button_connexion1.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_button_connexion1.setText("Ajouter");
        home_button_connexion1.setBorder(createLineBorder(new Color(102, 102, 255)));
        home_button_connexion1.setContentAreaFilled(false);
        home_button_connexion1.setFocusPainted(false);
        home_button_connexion1.addActionListener(evt -> {
            try {
                home_button_connexion1ActionPerformed(evt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(home_button_connexion, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(home_label_identifiant6)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator8)
                                            .addComponent(home_textfield_cp, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(home_label_nom)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator2)
                                            .addComponent(home_textfield_nom, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(home_label_identifiant1)
                                        .addComponent(home_label_identifiant2)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator4)
                                            .addComponent(home_textfield_tel, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator3)
                                            .addComponent(home_textfield_prenom, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(home_label_identifiant3)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator5)
                                        .addComponent(home_textfield_mutuelle, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(home_label_identifiant4)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(home_label_identifiant5)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator7)
                                                .addComponent(home_textfield_email, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator6)
                                            .addComponent(home_textfield_nsecurite, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(home_label_identifiant7)
                                            .addGap(372, 372, 372))
                                        .addComponent(jSeparator9, GroupLayout.Alignment.LEADING)
                                        .addComponent(home_textfield_age, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(home_button_connexion1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(home_button_connexion, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_nom)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant7)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator9, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant1)
                        .addGap(4, 4, 4)
                        .addComponent(home_textfield_prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant3)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_mutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant2)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant4)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_nsecurite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator6, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant5)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator7, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home_label_identifiant6)
                        .addGap(3, 3, 3)
                        .addComponent(home_textfield_cp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator8, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(home_button_connexion1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 242, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    //retour
    private void home_button_connexionActionPerformed(ActionEvent evt) throws SQLException {
        open.GestionDesPatients(this);
    }

    //add
    private void home_button_connexion1ActionPerformed(ActionEvent evt) throws SQLException {
        Patients p = new Patients();
        PatientsManager pm = new PatientsManager();

        //verification des vars
        JOptionPane alert;
        String error_message_not_string = "Attention erreur un texte était attendu pour le ";
        String error_message_not_integer = "Attention un chiffre était attendu pour le ";
        boolean error = false;

        if(home_textfield_nom.getText().isEmpty() == true || home_textfield_prenom.getText().isEmpty() == true || home_textfield_email.getText().isEmpty() == true || home_textfield_age.getText() == null || home_textfield_mutuelle.getText() == null || home_textfield_cp.getText() == null || home_textfield_nsecurite.getText() == null || home_textfield_tel.getText() == null
        ) {
            alert = new JOptionPane();
            error = true;
            alert.showMessageDialog(null, "Un des champs est vide.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
        } else {

            String nom         = home_textfield_nom.getText();
            String prenom      = home_textfield_prenom.getText();
            String email       = home_textfield_email.getText();

            if(nom instanceof String == false) {
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_string + "nom.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            } else {
                p.setNom(nom);
            }

            if(prenom instanceof String == false) {
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_string + "prenom.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            } else {
                p.setPrenom(prenom);
            }

            if(email instanceof String == false) {
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_string + "email.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            } else {
                p.setEmail(email);
            }

            try{
                Integer age = Integer.parseInt(home_textfield_age.getText());
                int length = (int)(Math.log10(age)+1);
                if(length > 3 || length < 1) {
                    alert = new JOptionPane();
                    error = true;
                    alert.showMessageDialog(null, "Votre age est erronée.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {
                    p.setAge(age);
                }
            } catch(NumberFormatException Exception){
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_integer + "age.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            }

            try{
                Integer mutuelle    = Integer.parseInt(home_textfield_mutuelle.getText());
                int length = (int)(Math.log10(mutuelle)+1);
                if(length != 10) {
                    alert = new JOptionPane();
                    error = true;
                    alert.showMessageDialog(null, "Votre numéro de mutuelle est erronée.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {
                    p.setMutuelle(mutuelle);
                }
            } catch(NumberFormatException Exception){
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_integer + "mutuelle.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            }

            try{
                Integer nsecurite   = Integer.parseInt(home_textfield_nsecurite.getText());
                int length = (int)(Math.log10(nsecurite)+1);
                if(length != 8) {
                    alert = new JOptionPane();
                    error = true;
                    alert.showMessageDialog(null, "Votre numéro de sécurité social est erronée.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {
                    p.setNumSecurite(nsecurite);
                }
            } catch(NumberFormatException Exception){
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_integer + "numéro de sécurité social.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            }

            try{
                Integer cp = Integer.parseInt(home_textfield_cp.getText());
                int length = (int)(Math.log10(cp)+1);
                if(length != 5)     {
                    alert = new JOptionPane();
                    error = true;
                    alert.showMessageDialog(null, "Votre code postal est erronée.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {
                    p.setCP(cp);
                }
            } catch(NumberFormatException Exception){
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_integer + "Code postal.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            }

            try{
                Integer tel = Integer.parseInt(home_textfield_tel.getText());
                int length = (int)(Math.log10(tel)+1);
                if(length > 10)     {
                    alert = new JOptionPane();
                    error = true;
                    alert.showMessageDialog(null, "Votre numéro de téléphone est erronée.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {
                    p.setTel(tel);
                }
            } catch(NumberFormatException Exception){
                alert = new JOptionPane();
                error = true;
                alert.showMessageDialog(null, error_message_not_integer + "téléphone.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            }
        }

        if(error == false) {

            pm.add(p);

            alert = new JOptionPane();
            alert.showMessageDialog(null, "Patient ajouté", "Information", JOptionPane.INFORMATION_MESSAGE);

            open.GestionDesPatients(this);
        }
    }

    private void jPanelMouseListener() {
        //gestion patients
        jPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.GestionDesPatients(AjouterPatient.this);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });

        //gestionrdv
        jPanel6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.GestionDesRDV(AjouterPatient.this);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {}
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}
            @Override
            public void mouseExited(MouseEvent mouseEvent) { }
        });

        //deconnexion
        jPanel7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                open.Home(AjouterPatient.this);
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {}
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}
            @Override
            public void mouseExited(MouseEvent mouseEvent) { }
        });

    }
}
