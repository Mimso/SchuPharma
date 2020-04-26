package schupharma.views.patient;

import schupharma.model.Patients;
import schupharma.model.PatientsManager;
import schupharma.service.ButtonEdit;
import schupharma.service.ButtonRemove;
import schupharma.service.Opener;
import schupharma.views.Home;
import schupharma.views.gestion.GestionAdministration;
import schupharma.views.rendezvous.GestionDesRDV;

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
public class GestionDesPatients extends JFrame {

    private JButton gpat_button_add;
    private JPanel jPanel1, jPanel2, jPanel3, jPanel5, jPanel6, jPanel7;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel jLabel1, stock_image_house, stock_image_house1, stock_image_house2, stock_image_logo;
    private Opener open;

    public GestionDesPatients() throws SQLException {
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
        jLabel1                 = new JLabel();
        jScrollPane1            = new JScrollPane();
        jTable1                 = new JTable();
        gpat_button_add         = new JButton();
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
                                .addContainerGap(293, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/gestion_patient.png"))); // NOI18N

        jTable1.setForeground(new Color(102, 102, 255));

        //ajout de la table
        jTableInit();

        jTable1.setGridColor(new Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        gpat_button_add.setFont(new Font("Trebuchet MS", 0, 21)); // NOI18N
        gpat_button_add.setText("Ajouter un patient");
        gpat_button_add.setToolTipText("");
        gpat_button_add.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 255)));
        gpat_button_add.setContentAreaFilled(false);
        gpat_button_add.setFocusPainted(false);
        gpat_button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gpat_button_ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1)
                                .addContainerGap(269, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(gpat_button_add, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(gpat_button_add, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void gpat_button_ActionPerformed(java.awt.event.ActionEvent evt) {
        open.AjouterPatient(this);
    }

    private void jPanelMouseListener() {
        //retour
        jPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                open.GestionAdministration(GestionDesPatients.this);
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
                    open.GestionDesRDV(GestionDesPatients.this);
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
                open.Home(GestionDesPatients.this);
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

    private void jTableInit() throws SQLException {

        PatientsManager pm = new PatientsManager();

        // start from 0
        String[] columnNames = {"Id", "Nom", "Prenom", "Mutuelle", "Numéro social", "Age", "Téléphone", "CP", "Editer", "Supprimer"};
        Object[][] data = {};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        ResultSet rs = pm.selectAll();
        Patients i = new Patients();

        while(rs.next()) {
            i.setId(rs.getInt(1));
            i.setNom(rs.getString(2));
            i.setPrenom(rs.getString(3));
            i.setMutuelle(rs.getInt(4));
            i.setNumSecurite(rs.getInt(5));
            i.setAge(rs.getInt(6));
            i.setTel(rs.getInt(7));
            i.setCP(rs.getInt(8));

            model.addRow(new Object[]{i.getId(), i.getNom(), i.getPrenom(), i.getMutuelle(), i.getNumSecurite(), i.getAge(), i.getTel(), i.getCP()});
        }

        jTable1.setModel(model);
        jTable1.getTableHeader().setReorderingAllowed(false);

        Action editInventory = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JTable jTable1 = (JTable)e.getSource();
                String id      = jTable1.getModel().getValueAt(Integer.valueOf( e.getActionCommand() ), 0).toString();
                open.ModifierPatient(GestionDesPatients.this, Integer.valueOf(id));
            }
        };

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

                    PatientsManager pm = new PatientsManager();
                    Patients pat = new Patients();
                    pat.setId(Integer.parseInt(id));
                    pm.delete(pat);
                }
            }
        };

        // last - 1
        //Button editer et supprimer
        ButtonEdit buttonEdit = new ButtonEdit(jTable1, editInventory, 8);
        buttonEdit.setMnemonic(KeyEvent.VK_D);
        ButtonRemove buttonRemove = new ButtonRemove(jTable1, deleteInventory, 9);
        buttonRemove.setMnemonic(KeyEvent.VK_D);
    }
}
