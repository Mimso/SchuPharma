package schupharma.views.rendezvous;

import schupharma.model.Docteurs;
import schupharma.model.Patients;
import schupharma.model.Rendezvous;
import schupharma.model.RendezvousManager;
import schupharma.service.ButtonRemove;
import schupharma.service.Opener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marie Pirodon
 * @author Anthony ARJONA
 */
public class GestionDesRDV extends JFrame {

    public GestionDesRDV() throws SQLException {
        initComponents();
        setResizable(false);
        jPanelMouseListener();
    }

    private void initComponents() throws SQLException {

        jPanel1                 = new JPanel();
        jPanel2                 = new JPanel();
        jPanel3                 = new JPanel();
        jPanel5                 = new JPanel();
        jPanel6                 = new JPanel();
        jPanel7                 = new JPanel();

        stock_image_logo        = new JLabel();
        stock_image_house       = new JLabel();
        stock_image_house1      = new JLabel();
        stock_image_house2      = new JLabel();

        jScrollPane1            = new JScrollPane();

        jTable1                 = new JTable();
        jLabel1                 = new JLabel();

        home_button_connexion1  = new JButton();
        open                    = new Opener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(164, 201, 255));
        jPanel3.setForeground(new Color(255, 255, 255));

        stock_image_logo.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/logo.png"))); // NOI18N

        jPanel5.setBackground(new Color(148, 191, 255));

        stock_image_house.setFont(new Font("Trebuchet MS", 0, 26)); // NOI18N
        stock_image_house.setForeground(new Color(255, 255, 255));
        stock_image_house.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/back.png"))); // NOI18N
        stock_image_house.setText("Retour");

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
        stock_image_house1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/being_sick_80px.png"))); // NOI18N
        stock_image_house1.setText("Gestion des patients");

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
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jPanel1.setForeground(new Color(102, 102, 255));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/gestionrdv.png"))); // NOI18N

        jTable1.setForeground(new Color(102, 102, 255));

        jTableInit();

        jTable1.setGridColor(new Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        home_button_connexion1.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        home_button_connexion1.setText("Ajouter un rendez-vous");
        home_button_connexion1.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102, 102, 255)));
        home_button_connexion1.setContentAreaFilled(false);
        home_button_connexion1.setFocusPainted(false);
        home_button_connexion1.addActionListener(evt -> {
            try {
                open.AjouterRDV(this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home_button_connexion1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 848, GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(home_button_connexion1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 130, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void home_button_connexion1ActionPerformed(ActionEvent evt) {
    }

    private void jTableInit() throws SQLException {

        RendezvousManager rvm = new RendezvousManager();

        String[] columnNames = {"Id", "Nom du Docteur", "Spécialité du Docteur", "Nom du Patient", "Prenom du Patient", "Numéro du Patient", "Date", "Supprimer"};
        Object[][] data = {};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        ResultSet rs = rvm.selectRDVJoinDocAndPat();

        Rendezvous rv = new Rendezvous();
        Docteurs  doc = new Docteurs();
        Patients  pat = new Patients();

        while(rs.next()) {
            rv.setId(rs.getInt("RDV_ID"));
            rv.setDate(rs.getDate("RDV_DATE"));

            doc.setId(rs.getInt("DOC_ID"));
            doc.setNom(rs.getString("DOC_NOM"));
            //doc.setPrenom(rs.getString("DOC_PRENOM"));
            doc.setSpecialite(rs.getString("DOC_SPE"));

            pat.setId(rs.getInt("PAT_ID"));
            pat.setNom(rs.getString("PAT_NOM"));
            pat.setPrenom(rs.getString("PAT_PRENOM"));
            pat.setTel(rs.getInt("PAT_TEL"));

            model.addRow(new Object[]{rv.getId(), doc.getNom(), doc.getSpecialite(), pat.getNom(), pat.getPrenom(), pat.getTel(), rv.getDate()});
        }

        jTable1.setModel(model);
        jTable1.getTableHeader().setReorderingAllowed(false);

        Action deleteInventory = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane alert = new JOptionPane();

                int alertResult = alert.showConfirmDialog(null, "Merci de confirmer la suppression.", "Attention !", JOptionPane.YES_NO_CANCEL_OPTION);
                if(alertResult == JOptionPane.YES_OPTION){
                    //find JTable data
                    JTable jTable1 = (JTable)e.getSource();
                    // id is index 0 on jtable
                    String id     = jTable1.getModel().getValueAt(Integer.valueOf( e.getActionCommand() ), 0).toString();
                    int rowColumn = Integer.valueOf( e.getActionCommand() );

                    ((DefaultTableModel)jTable1.getModel()).removeRow(rowColumn);

                    RendezvousManager rvm = new RendezvousManager();
                    Rendezvous rv = new Rendezvous();
                    rv.setId(Integer.parseInt(id));
                    rvm.delete(rv);
                }
            }
        };

        //Button supprimer
        ButtonRemove buttonRemove = new ButtonRemove(jTable1, deleteInventory, 7);
        buttonRemove.setMnemonic(KeyEvent.VK_D);
    }

    private void jPanelMouseListener() {

        // retour
        jPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                open.GestionAdministration(GestionDesRDV.this);
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

        // gestion patient
        jPanel6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.GestionDesPatients(GestionDesRDV.this);
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
                open.Home(GestionDesRDV.this);
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

    private JButton home_button_connexion1;
    private JTable jTable1;
    private JLabel jLabel1;
    private JPanel jPanel1, jPanel2, jPanel3, jPanel5, jPanel6, jPanel7;
    private JScrollPane jScrollPane1;
    private JLabel stock_image_house, stock_image_house1, stock_image_house2, stock_image_logo;
    private Opener open;
}
