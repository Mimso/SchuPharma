/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schupharma.views.rendezvous;

import schupharma.model.*;
import schupharma.service.Opener;
import schupharma.views.Home;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.Style;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

public class AjouterRDV extends JFrame {

    private Choice choice1, choice2;
    private JButton return_button, add_button;
    private JTextField textfield_date;
    private JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7;
    private JSeparator jSeparator10, jSeparator11, jSeparator2;
    private JLabel label_docteur, label_patient, label_date, jLabel1, stock_image_house, stock_image_house1, stock_image_house2, stock_image_logo;
    private Opener open;

    public AjouterRDV() throws SQLException {
        initComponents();
        setResizable(false);
        jPanelMouseListener();
    }

    private void initComponents() throws SQLException {

        jPanel2                 = new JPanel();
        jPanel3                 = new JPanel();
        stock_image_logo        = new JLabel();
        jPanel5                 = new JPanel();
        stock_image_house       = new JLabel();
        jPanel6                 = new JPanel();
        stock_image_house1      = new JLabel();
        jPanel7                 = new JPanel();
        stock_image_house2      = new JLabel();
        jPanel1                 = new JPanel();
        label_docteur           = new JLabel();
        jSeparator2             = new JSeparator();
        choice1                 = new Choice();
        return_button           = new JButton();
        jLabel1                 = new JLabel();
        jPanel4                 = new JPanel();
        add_button              = new JButton();
        label_patient           = new JLabel();
        jSeparator10            = new JSeparator();
        choice2                 = new Choice();
        label_date              = new JLabel();
        jSeparator11            = new JSeparator();
        textfield_date          = new JTextField();
        open                    = new Opener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(164, 201, 255));
        jPanel3.setForeground(new Color(255, 255, 255));

        stock_image_logo.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/logo.png"))); // NOI18N

        jPanel5.setBackground(new Color(148, 191, 255));

        stock_image_house.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house.setForeground(new Color(255, 255, 255));
        stock_image_house.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/being_sick_80px.png"))); // NOI18N
        stock_image_house.setText("Gestion des patients");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house)
                .addGap(43, 43, 43))
        );

        jPanel6.setBackground(new Color(148, 191, 255));

        stock_image_house1.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house1.setForeground(new Color(255, 255, 255));
        stock_image_house1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/meeting_80px.png"))); // NOI18N
        stock_image_house1.setText("Gestion des rendez-vous");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house1)
                .addGap(43, 43, 43))
        );

        jPanel7.setBackground(new Color(148, 191, 255));

        stock_image_house2.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house2.setForeground(new Color(255, 255, 255));
        stock_image_house2.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/export_80px.png"))); // NOI18N
        stock_image_house2.setText("Déconnexion ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house2)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stock_image_logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stock_image_logo)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_docteur.setBackground(new Color(0, 0, 0));
        label_docteur.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        label_docteur.setText("Docteur");

        jSeparator2.setBackground(new Color(0, 0, 0));

        return_button.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        return_button.setText("Retour");
        return_button.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102, 102, 255)));
        return_button.setContentAreaFilled(false);
        return_button.setFocusPainted(false);
        return_button.addActionListener(evt -> {
            try {
                return_buttonActionPerformed(evt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/caladd.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        add_button.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        add_button.setText("Ajouter");
        add_button.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102, 102, 255)));
        add_button.setContentAreaFilled(false);
        add_button.setFocusPainted(false);
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    add_buttonActionPerformed(evt);
                } catch (SQLException | ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        label_patient.setBackground(new Color(0, 0, 0));
        label_patient.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        label_patient.setText("Patient");

        jSeparator10.setBackground(new Color(0, 0, 0));

        label_date.setBackground(new Color(0, 0, 0));
        label_date.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        label_date.setText("Date");

        jSeparator11.setBackground(new Color(0, 0, 0));

        textfield_date.setEditable(true);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateAutoFill = new Date();
        textfield_date.setText(dateFormat.format(dateAutoFill));
        textfield_date.setForeground(new Color(0, 0, 0));
        textfield_date.setBorder(null);
        textfield_date.addActionListener(evt -> dateTextfieldActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_docteur)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 146, Short.MAX_VALUE))
                            .addComponent(add_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(284, 284, 284))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_patient)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_date)
                            .addComponent(textfield_date, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_docteur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(label_patient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(label_date)
                .addGap(4, 4, 4)
                .addComponent(textfield_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PatientsManager pm = new PatientsManager();
        DocteursManager dm = new DocteursManager();

        Patients p = new Patients();
        Docteurs d = new Docteurs();

        ResultSet prs = pm.selectWithAlias();
        while(prs.next()) {
            p.setId(prs.getInt("PAT_ID"));
            p.setNom(prs.getString("PAT_NAME"));
            p.setPrenom(prs.getString("PAT_NNAME"));
            choice2.addItem(p.getId() + ": " + p.getNom() + " - " + p.getPrenom());
        }

        ResultSet drs = dm.selectWithAlias();
        while(drs.next()) {
            d.setId(drs.getInt("DOC_ID"));
            d.setNom(drs.getString("DOC_NAME"));
            d.setPrenom(drs.getString("DOC_NNAME"));
            d.setSpecialite(drs.getString("DOC_SPE"));
            choice1.addItem(d.getId() + ": " + d.getNom() + " - " + d.getPrenom());
        }

        pack();
    }

    private void add_buttonActionPerformed(ActionEvent evt) throws SQLException, SQLSyntaxErrorException, ParseException {
        Rendezvous rdv = new Rendezvous();
        RendezvousManager rdvm = new RendezvousManager();

        JOptionPane alert;
        String error_message_date_false = "Attention votre date est incorrect ";
        boolean error = false;

        if(textfield_date.getText().isEmpty() == true) {
            alert = new JOptionPane();
            error = true;
            alert.showMessageDialog(null, error_message_date_false, "Attention Erreur", JOptionPane.WARNING_MESSAGE);
        } else {
            String dateStr           = textfield_date.getText(); //input
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String d1 = df.format(dateStr);

            rdv.setDateStr(d1);
            rdv.setPatientId(choice2.getSelectedIndex());
            rdv.setDocteurId(choice1.getSelectedIndex());
        }

        if(error == false) {
            try {
                rdvm.add(rdv);
                alert = new JOptionPane();
                alert.showMessageDialog(null, "Patient ajouté", "Information", JOptionPane.INFORMATION_MESSAGE);
                open.GestionDesRDV(this);
            } catch (SQLException SQLe) {
                alert = new JOptionPane();
                alert.showMessageDialog(null, "Erreur lors de l'ajout", "Attention", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private void return_buttonActionPerformed(ActionEvent evt) throws SQLException {
        open.GestionDesRDV(this);
    }
    private void dateTextfieldActionPerformed(ActionEvent evt) {}

    private void jPanelMouseListener() {

        // gestion des patients
        jPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.GestionDesPatients(AjouterRDV.this);
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

        // gestion rdv
        jPanel6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.GestionDesRDV(AjouterRDV.this);
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

        //logout
        jPanel7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                dispose();
                Home closeCurrentWindow = new Home();
                closeCurrentWindow.setVisible(true);
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
