/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama1;

/**
 *
 * @author Lenovo
 */
public class UygualamaArayuz extends javax.swing.JFrame {

    /**
     * Creates new form UygualamaArayuz
     */
    
    
    String alfabe="abcçdefgğhıijklmnoöprsştuüvyz";
    int kaydırmasayısı=3;
    
    public UygualamaArayuz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifrelenecekyazi = new javax.swing.JTextField();
        sifrelihali = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        sifreliyazi = new javax.swing.JTextField();
        sifresizhali = new javax.swing.JTextField();
        button2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));

        sifrelenecekyazi.setText("Sifrelenecekyazi");
        sifrelenecekyazi.setSelectionColor(new java.awt.Color(255, 255, 255));
        sifrelenecekyazi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifrelenecekyaziMouseClicked(evt);
            }
        });
        sifrelenecekyazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifrelenecekyaziActionPerformed(evt);
            }
        });

        sifrelihali.setText("SifreliHali");
        sifrelihali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifrelihaliActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.setForeground(new java.awt.Color(51, 51, 51));
        button1.setText("Sifrele");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        sifreliyazi.setText("Sifreliyazi");
        sifreliyazi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreliyaziMouseClicked(evt);
            }
        });

        sifresizhali.setText("SifresizHali");

        button2.setBackground(new java.awt.Color(204, 204, 204));
        button2.setForeground(new java.awt.Color(51, 51, 51));
        button2.setText("SifreCoz");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifrelenecekyazi, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(sifreliyazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifrelihali)
                    .addComponent(sifresizhali, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addGap(319, 319, 319))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifrelihali, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(sifrelenecekyazi))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sifresizhali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreliyazi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifrelenecekyaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifrelenecekyaziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifrelenecekyaziActionPerformed

    private void sifrelihaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifrelihaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifrelihaliActionPerformed

    private void sifrelenecekyaziMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifrelenecekyaziMouseClicked
        sifrelenecekyazi.setText("");
    }//GEN-LAST:event_sifrelenecekyaziMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        int i,j,uzunluk;
        String cipher="";
        String alinanmetin="";
        String sifreli="";
        int ks = 3;
        
        for(i=ks;i<29+ks;i++){
            cipher +=alfabe.charAt(i%29);
        }
        
        //sifrelihali.setText(cipher);
        
        alinanmetin = sifrelenecekyazi.getText();
        uzunluk=alinanmetin.length();
        
        for(i=0;i<uzunluk;i++){
            for(j=0;j<29;j++){
                if(alinanmetin.charAt(i)==alfabe.charAt(j)){
                    sifreli += alfabe.charAt((j+ks)%29);
                } 
            }
        }
        sifrelihali.setText(sifreli);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        int i,j,uzunluk;
        String cipher="";
        String alinanmetin="";
        String sifreli="";
        int ks = 3;
        
        for(i=ks;i<29+ks;i++){
            cipher +=alfabe.charAt(i%29);
        }
        
        //sifrelihali.setText(cipher);
        
        alinanmetin = sifreliyazi.getText();
        uzunluk=alinanmetin.length();
        
        for(i=0;i<uzunluk;i++){
            for(j=0;j<29;j++){
                if(alinanmetin.charAt(i)==alfabe.charAt(j)){
                    sifreli += alfabe.charAt((j-ks)%29);
                } 
            }
        }
        sifresizhali.setText(sifreli);
    }//GEN-LAST:event_button2ActionPerformed

    private void sifreliyaziMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreliyaziMouseClicked
        sifreliyazi.setText("");
    }//GEN-LAST:event_sifreliyaziMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UygualamaArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UygualamaArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UygualamaArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UygualamaArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UygualamaArayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JTextField sifrelenecekyazi;
    private javax.swing.JTextField sifrelihali;
    private javax.swing.JTextField sifreliyazi;
    private javax.swing.JTextField sifresizhali;
    // End of variables declaration//GEN-END:variables
}
