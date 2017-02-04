/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author razu
 */
public class CategoryRow extends javax.swing.JPanel {

    String scName;
    String description;
    Icon  icon;
    
    
    public CategoryRow() {
        initComponents();
        subCategoryDeleteButton.setText("Delete");
    }

    public CategoryRow(String scName, String description, Icon icon) {
        subCategoryName.setText(scName);
        subCategoryDescription.setText(description);
        subCategoryImageLabel.setIcon(icon);
        subCategoryDeleteButton.setText("Delete");
    }

    
    
    public String getDescription() {
        return subCategoryDescription.getText();
    }

    public void setDescription(String description) {
        subCategoryDescription.setText(description);
    }

    public Icon getIcon() {
        return subCategoryImageLabel.getIcon();
    }

    public void setIcon(Icon icon) {
        subCategoryImageLabel.setIcon(icon);
    }

    public String getScName() {
        return subCategoryName.getText();
    }

    public void setScName(String scName) {
        subCategoryName.setText(scName);
    }

    public JButton getSubCategoryDeleteButton() {
        return subCategoryDeleteButton;
    }

    public void setSubCategoryDeleteButton(JButton subCategoryDeleteButton) {
        this.subCategoryDeleteButton = subCategoryDeleteButton;
    }

    public JLabel getSubCategoryDescription() {
        return subCategoryDescription;
    }

    public void setSubCategoryDescription(JLabel subCategoryDescription) {
        this.subCategoryDescription = subCategoryDescription;
    }

    public JPanel getSubCategoryImagePanel() {
        return subCategoryImagePanel;
    }

    public void setSubCategoryImagePanel(JPanel subCategoryImagePanel) {
        this.subCategoryImagePanel = subCategoryImagePanel;
    }

    public JLabel getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(JLabel subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

   
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subCategoryImagePanel = new javax.swing.JPanel();
        subCategoryImageLabel = new javax.swing.JLabel();
        subCategoryName = new javax.swing.JLabel();
        subCategoryDescription = new javax.swing.JLabel();
        subCategoryDeleteButton = new javax.swing.JButton();

        javax.swing.GroupLayout subCategoryImagePanelLayout = new javax.swing.GroupLayout(subCategoryImagePanel);
        subCategoryImagePanel.setLayout(subCategoryImagePanelLayout);
        subCategoryImagePanelLayout.setHorizontalGroup(
            subCategoryImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCategoryImagePanelLayout.createSequentialGroup()
                .addComponent(subCategoryImageLabel)
                .addGap(0, 98, Short.MAX_VALUE))
        );
        subCategoryImagePanelLayout.setVerticalGroup(
            subCategoryImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCategoryImagePanelLayout.createSequentialGroup()
                .addComponent(subCategoryImageLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        subCategoryDeleteButton.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subCategoryName)
                            .addComponent(subCategoryDescription))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(323, Short.MAX_VALUE)
                        .addComponent(subCategoryDeleteButton)
                        .addGap(20, 20, 20)))
                .addComponent(subCategoryImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subCategoryImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subCategoryName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subCategoryDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(subCategoryDeleteButton)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton subCategoryDeleteButton;
    private javax.swing.JLabel subCategoryDescription;
    private javax.swing.JLabel subCategoryImageLabel;
    private javax.swing.JPanel subCategoryImagePanel;
    private javax.swing.JLabel subCategoryName;
    // End of variables declaration//GEN-END:variables
}
