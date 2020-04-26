package schupharma.views.gestion;

import schupharma.model.Historique;
import schupharma.model.HistoriqueManager;
import schupharma.model.Inventaires;
import schupharma.model.InventairesManager;
import schupharma.service.ButtonEdit;
import schupharma.service.ButtonRemove;
import schupharma.service.Opener;
import schupharma.views.Home;

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
public class GestionStocks extends javax.swing.JFrame {

    private JButton home_button_addMedicament;
    private JPanel jPanel1, jPanel2, jPanel3, jPanel5, jPanel6;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel jLabel1, stock_image_house, stock_jPanel_Logout, stock_image_logo;
    private Opener open;

    public GestionStocks() throws SQLException {
        initComponents();
        setResizable(false);
        jPanelMouseListener();
    }

    private void initComponents() throws SQLException {

        jPanel2                   = new JPanel();
        jPanel3                   = new JPanel();
        stock_image_logo          = new JLabel();
        jPanel5                   = new JPanel();
        stock_image_house         = new JLabel();
        jPanel6                   = new JPanel();
        stock_jPanel_Logout       = new JLabel();
        jPanel1                   = new JPanel();
        jLabel1                   = new JLabel();
        jScrollPane1              = new JScrollPane();
        jTable1                   = new JTable();
        home_button_addMedicament = new JButton();
        open                      = new Opener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(164, 201, 255));
        jPanel3.setForeground(new Color(255, 255, 255));

        stock_image_logo.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/logo.png")));

        jPanel5.setBackground(new Color(148, 191, 255));

        stock_image_house.setFont(new Font("Trebuchet MS", 0, 26));
        stock_image_house.setForeground(new Color(255, 255, 255));
        stock_image_house.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/historique_stock.png")));
        stock_image_house.setText("Historique");

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

        stock_jPanel_Logout.setFont(new Font("Trebuchet MS", 0, 26));
        stock_jPanel_Logout.setForeground(new Color(255, 255, 255));
        stock_jPanel_Logout.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/export_80px.png")));
        stock_jPanel_Logout.setText("Déconnexion");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(stock_jPanel_Logout)
                                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stock_jPanel_Logout)
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
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setForeground(new Color(102, 102, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/panel_gestion_stock.png")));
        jTable1.setForeground(new Color(102, 102, 255));

        jTableInit();

        jTable1.setGridColor(new Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        home_button_addMedicament.setFont(new Font("Trebuchet MS", 0, 21));
        home_button_addMedicament.setText("Ajouter un médicament");
        home_button_addMedicament.setToolTipText("");
        home_button_addMedicament.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102, 102, 255)));
        home_button_addMedicament.setContentAreaFilled(false);
        home_button_addMedicament.setFocusPainted(false);
        home_button_addMedicament.addActionListener(evt -> {
            try {
                home_button_addMedicamentActionPerformed(evt);
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
                                                .addComponent(home_button_addMedicament, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(48, 48, 48))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 30, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 848, GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
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
                                .addComponent(home_button_addMedicament, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(270, Short.MAX_VALUE))
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

    private void home_button_addMedicamentActionPerformed(ActionEvent evt) throws SQLException {
        InventairesManager im = new InventairesManager();
        Inventaires        i  = new Inventaires();
        JOptionPane     alert = new JOptionPane();

        String inv_name = JOptionPane.showInputDialog(null, "Quelle est le nom du nouveau médicament", "Nom médicament");

        if(inv_name.isEmpty() == true) {
            alert.showMessageDialog(null, "Le nom ne peut pas etre vide", "Information", JOptionPane.WARNING_MESSAGE);
        } else {
            Integer inv_tox = Integer.parseInt(JOptionPane.showInputDialog(null, "Quelle est la toxicité du nouveau médicament", 0));
            if(inv_tox == null) {
                alert.showMessageDialog(null, "La toxicité ne peut pas etre vide", "Information", JOptionPane.WARNING_MESSAGE);
            } else {
                i.setNom(inv_name);
                i.setToxicite(inv_tox);
                i.setQuantite(0);
                im.add(i);
                alert.showMessageDialog(null, "Le medicament a bien été ajouté", "Information", JOptionPane.INFORMATION_MESSAGE);
                open.GestionStocks(GestionStocks.this);
            }
        }


    }

    private void jTableInit() throws SQLException {

        InventairesManager im = new InventairesManager();

        String[] columnNames = {"Id", "Nom", "Toxicite", "Quantite", "Commander", "Supprimer"};
        Object[][] data = {};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        ResultSet rs = im.selectAll();
        Inventaires i = new Inventaires();

        while(rs.next()) {
            i.setId(rs.getInt(1));
            i.setNom(rs.getString(2));
            i.setQuantite(rs.getInt(3));
            i.setToxicite(rs.getInt(4));

            model.addRow(new Object[]{i.getId(), i.getNom(), i.getQuantite(), i.getToxicite()});
        }

        jTable1.setModel(model);
        jTable1.getTableHeader().setReorderingAllowed(false);

        Action commandInventory = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                JOptionPane alert;
                JTable jTable1 = (JTable)e.getSource();
                String id      = jTable1.getModel().getValueAt(Integer.valueOf( e.getActionCommand() ), 0).toString();

                int qty = Integer.parseInt(JOptionPane.showInputDialog(null, "Quelle quantité souhaitez-vous commander", 10));

                if(qty < 0 || qty > 100) {
                    alert = new JOptionPane();
                    alert.showMessageDialog(null, "Quantité saisie incorrect", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                } else {
                    Inventaires       i  = new Inventaires();
                    Historique        h  = new Historique();
                    HistoriqueManager hm = new HistoriqueManager();

                    try {
                        //historique
                        h.setIdInventaire(Integer.parseInt(id));
                        h.setQuantity(qty);
                        hm.add(h);

                        //mise a jour qty inventaire
                        i.setId(Integer.parseInt(id));
                        ResultSet rs = im.selectWithAlias(i);
                        while(rs.next()) {
                            i.setQuantite(rs.getInt("INV_QTY"));
                        }

                        i.setQuantite(i.getQuantite() + qty);
                        im.updateQTY(i);

                        alert = new JOptionPane();
                        alert.showMessageDialog(null, "Mise à jour de la quantité effectuée", "Information", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ExSQL) {
                        alert = new JOptionPane();
                        alert.showMessageDialog(null, "Une erreur lors de la mise à jour s'est produite", "Attention Erreur", JOptionPane.WARNING_MESSAGE);
                    }

                }

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

                    InventairesManager im = new InventairesManager();
                    Inventaires i = new Inventaires();
                    i.setId(Integer.parseInt(id));
                    im.delete(i);
                }
            }
        };

        //Button command
        ButtonEdit buttonCommand = new ButtonEdit(jTable1, commandInventory, 4);
        buttonCommand.setMnemonic(KeyEvent.VK_D);

        //button remove
        ButtonRemove buttonRemove = new ButtonRemove(jTable1, deleteInventory, 5);
        buttonRemove.setMnemonic(KeyEvent.VK_D);
    }

    private void jPanelMouseListener() {

        jPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.Historique(GestionStocks.this);
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

        stock_jPanel_Logout.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                open.Home(GestionStocks.this);
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