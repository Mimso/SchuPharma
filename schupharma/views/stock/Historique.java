/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schupharma.views.stock;

import schupharma.model.HistoriqueManager;
import schupharma.model.Inventaires;
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

public class Historique extends JFrame {

    private JLabel jLabel1, stock_image_house, stock_image_house1, stock_image_logo;
    private JPanel jPanel1, jPanel2, jPanel3, jPanel5, jPanel6;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private Opener open;

    public Historique() throws SQLException {
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
        jPanel1                 = new JPanel();
        jLabel1                 = new JLabel();
        jScrollPane1            = new JScrollPane();
        jTable1                 = new JTable();
        open                    = new Opener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        stock_image_house1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/export_80px.png"))); // NOI18N
        stock_image_house1.setText("Déconnexion");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(stock_image_house1)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stock_image_house1)
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

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/schupharma/resources/images/Group 9.png"))); // NOI18N

        jTable1.setForeground(new Color(102, 102, 255));

        //ajout de la table
        jTableInit();

        jTable1.setGridColor(new Color(204, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 848, GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
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

    private void jTableInit() throws SQLException {

        HistoriqueManager hm = new HistoriqueManager();

        // start from 0
        String[] columnNames = {"Id", "Nom", "Toxicite", "Quantité commandée", "Quantité Totale", "Supprimer"};
        Object[][] data = {};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        ResultSet rs = hm.selectAllWithAlias();
        Inventaires i = new Inventaires();
        schupharma.model.Historique h = new schupharma.model.Historique();

        while(rs.next()) {

            h.setId(rs.getInt("HIST_ID"));
            i.setNom(rs.getString("INV_NOM"));
            i.setToxicite(rs.getInt("INV_TOX"));
            h.setQuantity(rs.getInt("HIST_QTY"));
            i.setQuantite(rs.getInt("QTY_TOTAL"));

            model.addRow(new Object[]{h.getId(), i.getNom(), i.getToxicite(), h.getQuantity(), i.getQuantite()});
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

                    HistoriqueManager hm = new HistoriqueManager();
                    schupharma.model.Historique h = new schupharma.model.Historique();
                    h.setId(Integer.parseInt(id));
                    hm.delete(h);
                }
            }
        };

        // last - 1
        //Button supprimer
        ButtonRemove buttonRemove = new ButtonRemove(jTable1, deleteInventory, 5);
        buttonRemove.setMnemonic(KeyEvent.VK_D);
    }

    private void jPanelMouseListener() {

        // Retour
        jPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                try {
                    open.GestionStocks(Historique.this);
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
        jPanel6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                open.Home(Historique.this);
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


