package schupharma.views;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import schupharma.model.Utilisateurs;
import schupharma.model.UtilisateursManager;
import schupharma.service.Opener;
import schupharma.utilisateur.Utilisateur;
import schupharma.views.gestion.GestionAdministration;
import schupharma.views.gestion.GestionStocks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.awt.EventQueue.invokeLater;

/**
 * @author Marie Pirodon
 * @author Anthony ARJONA
 */
public class Home extends javax.swing.JFrame {

    private JButton        home_button_connexion;
    private JCheckBox      home_checkbox_administration, home_checkbox_stock;
    private JLabel         home_image_books, home_image_box, home_image_welcome, home_image_welcome1, home_label_identifiant, home_label_password;
    private JPasswordField home_passwordfield_password;
    private JTextField     home_textfield_identifiant;
    private JPanel         jPanel1, jPanel3, jPanel4;
    private JSeparator     jSeparator1, jSeparator2;
    private Opener         open;

    public Home() {
        initComponents();
        setResizable(false);
    }

    private void initComponents() {

        jPanel1                      = new JPanel();
        jPanel3                      = new JPanel();
        jPanel4                      = new JPanel();

        home_label_password          = new JLabel();
        home_button_connexion        = new JButton();
        home_label_identifiant       = new JLabel();
        home_textfield_identifiant   = new JTextField();
        home_passwordfield_password  = new JPasswordField();
        home_image_welcome           = new JLabel();
        home_checkbox_stock          = new JCheckBox();
        home_checkbox_administration = new JCheckBox();
        home_image_books             = new JLabel();
        home_image_box               = new JLabel();
        home_image_welcome1          = new JLabel();

        jSeparator1                  = new JSeparator();
        jSeparator2                  = new JSeparator();

        open                         = new Opener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new AbsoluteLayout());

        jPanel3.setBackground(new Color(164, 201, 255));
        jPanel3.setForeground(new Color(255, 255, 255));

        home_label_password.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_password.setForeground(new Color(255, 255, 255));
        home_label_password.setText("Mot de passe");

        home_button_connexion.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_button_connexion.setForeground(new Color(255, 255, 255));
        home_button_connexion.setText("Connexion");
        home_button_connexion.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        home_button_connexion.setContentAreaFilled(false);
        home_button_connexion.setFocusPainted(false);
        home_button_connexion.addActionListener(evt -> {
            try {
                home_button_connexionActionPerformed(evt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        home_label_identifiant.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_label_identifiant.setForeground(new Color(255, 255, 255));
        home_label_identifiant.setText("Identifiant ");

        home_textfield_identifiant.setBackground(new Color(164, 201, 255));
        home_textfield_identifiant.setForeground(new Color(255, 255, 255));
        home_textfield_identifiant.setBorder(null);
        home_textfield_identifiant.addActionListener(evt -> {
            try {
                home_button_connexionActionPerformed(evt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        home_passwordfield_password.setBackground(new Color(164, 201, 255));
        home_passwordfield_password.setForeground(new Color(255, 255, 255));
        home_passwordfield_password.setBorder(null);

        jSeparator1.setForeground(new Color(255, 255, 255));
        jSeparator2.setForeground(new Color(255, 255, 255));

        home_image_welcome.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/illus_welcome.png"))); // NOI18N
        home_checkbox_stock.setBackground(new Color(164, 201, 255));
        home_checkbox_stock.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_checkbox_stock.setForeground(new Color(255, 255, 255));
        home_checkbox_stock.setSelected(true);
        home_checkbox_stock.setText("Gestion stock");

        home_checkbox_administration.setBackground(new Color(164, 201, 255));
        home_checkbox_administration.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_checkbox_administration.setForeground(new Color(255, 255, 255));
        home_checkbox_administration.setText("Administration");

        home_image_books.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/books.png"))); // NOI18N
        home_image_box.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/box.png"))); // NOI18N

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(home_label_identifiant)
                            .addComponent(home_button_connexion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(home_label_password)
                            .addComponent(home_textfield_identifiant)
                            .addComponent(home_passwordfield_password, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(home_checkbox_stock)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_image_welcome)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home_image_books)
                .addGap(140, 140, 140)
                .addComponent(home_image_box)
                .addGap(109, 109, 109))
            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(home_checkbox_administration)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(home_image_welcome)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(home_label_identifiant)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_textfield_identifiant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(home_label_password)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_passwordfield_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(home_image_box)
                    .addComponent(home_image_books))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_checkbox_stock)
                .addGap(47, 47, 47)
                .addComponent(home_button_connexion, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(470, Short.MAX_VALUE)
                    .addComponent(home_checkbox_administration)
                    .addGap(165, 165, 165)))
        );

        jPanel1.add(jPanel3, new AbsoluteConstraints(0, 0, 490, 670));
        jPanel1.add(jPanel4, new AbsoluteConstraints(490, 0, 540, 670));

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setLayout(new AbsoluteLayout());
        jPanel4.add(home_image_welcome1, new AbsoluteConstraints(50, 90, -1, -1));

        home_image_welcome1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/illus_info.png"))); // NOI18N

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void home_button_connexionActionPerformed(ActionEvent evt) throws SQLException {
        loginProcess();
    }

    //Gestion de la connexion
    private void loginProcess() throws SQLException {

        JOptionPane alert;

        if(!home_textfield_identifiant.getText().equals("") && !String.valueOf(home_passwordfield_password.getPassword()).equals("")) {

            Utilisateurs utilisateurs = new Utilisateurs();
            Utilisateur  conn         = new Utilisateur();

            utilisateurs.setUtilisateur(home_textfield_identifiant.getText());
            utilisateurs.setMotdepasse(String.valueOf(home_passwordfield_password.getPassword()));

            //connexion ok et bien effectué
            if(conn.Connexion(utilisateurs) == true) {

                //si les deux checkbox sont selectionner alors erreur
                if(home_checkbox_administration.isSelected() == true && home_checkbox_stock.isSelected() == true) {
                    alert = new JOptionPane();
                    alert.showMessageDialog(null, "Attention merci de sélectionner qu'une seule case.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                    //si aucune checkbox selectionner alors erreur
                } else if (home_checkbox_administration.isSelected() == false && home_checkbox_stock.isSelected() == false){
                    alert = new JOptionPane();
                    alert.showMessageDialog(null, "Attention merci de sélectionner une case.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {

                    UtilisateursManager um = new UtilisateursManager();
                    ResultSet rs = um.select(utilisateurs);

                    Utilisateurs u = new Utilisateurs();

                    while(rs.next()) {
                        u.setRole(rs.getInt(4));
                    }

                    // si une checkbox coché alors ok
                    if(home_checkbox_stock.isSelected() == true) {
                        // si checkbox stock
                        if(u.getRole() == 0) {
                            open.GestionStocks(this);
                        } else {
                            alert = new JOptionPane();
                            alert.showMessageDialog(null, "Attention vous n'avez pas les permissions d'accèder a cette page.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                        }
                    } else if(home_checkbox_administration.isSelected()) {
                        // si checkbox admin
                        if(u.getRole() == 1) {
                            open.GestionAdministration(this);
                        } else {
                            alert = new JOptionPane();
                            alert.showMessageDialog(null, "Attention vous n'avez pas les permissions d'accèder a cette page.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        alert = new JOptionPane();
                        alert.showMessageDialog(null, "Une erreur s'est produite.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                alert = new JOptionPane();
                alert.showMessageDialog(null, "Erreur de connexion.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            alert = new JOptionPane();
            alert.showMessageDialog(null, "Erreur un des champs est vide.", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }
}
