/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhirDKP_ReservasiVilla;
import javax.swing.JOptionPane;
import java.io.IOException;

/**
 *
 * @author msi
 */
public class FormVilla extends javax.swing.JFrame {
    double jenis, diskon, lama, tarif, harga, bayar, subtotal;
    String nama, alamat, membership;

public FormVilla() {
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

        btnhitung = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtJenis = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        totalBayar = new javax.swing.JTextField();
        hslNama = new javax.swing.JTextField();
        hslAlamat = new javax.swing.JTextField();
        hslJenis = new javax.swing.JTextField();
        hslLama = new javax.swing.JTextField();
        hslMember = new javax.swing.JTextField();
        hslHarga = new javax.swing.JTextField();
        C_ombo = new javax.swing.JComboBox<>();
        contact = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhitung.setText("ORDER");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 170, 60));

        btnhapus.setText("CLEAR");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 170, 60));

        txtNama.setBackground(new java.awt.Color(204, 255, 255));
        txtNama.setBorder(null);
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 290, 20));

        txtAlamat.setBackground(new java.awt.Color(204, 255, 255));
        txtAlamat.setBorder(null);
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 290, 20));

        txtJenis.setBackground(new java.awt.Color(204, 255, 255));
        txtJenis.setBorder(null);
        getContentPane().add(txtJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 290, 20));

        txtLama.setBackground(new java.awt.Color(204, 255, 255));
        txtLama.setBorder(null);
        getContentPane().add(txtLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 290, 20));

        totalBayar.setBorder(null);
        totalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBayarActionPerformed(evt);
            }
        });
        getContentPane().add(totalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 290, 30));
        getContentPane().add(hslNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 190, 30));
        getContentPane().add(hslAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 190, 30));
        getContentPane().add(hslJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 190, 30));

        hslLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hslLamaActionPerformed(evt);
            }
        });
        getContentPane().add(hslLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 190, 30));

        hslMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hslMemberActionPerformed(evt);
            }
        });
        getContentPane().add(hslMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 190, 30));
        getContentPane().add(hslHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 190, 30));

        C_ombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Choose Membership ----", "Diamond Membership", "Platinum Membership", "Gold Membership", "Non Membership" }));
        C_ombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_omboActionPerformed(evt);
            }
        });
        getContentPane().add(C_ombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 310, 30));

        contact.setText("CONTACT US");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 120, 30));

        feedback.setText("FEEDBACK");
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 170, 60));

        jLabel2.setText("SELAMAT DATANG, CUSTOMER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\msi\\Desktop\\Praktikum DKP\\Dokumen\\Project TA DKP\\TA Desain.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hslLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hslLamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hslLamaActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        txtNama.setText("");
        txtAlamat.setText("");
        txtJenis.setText("");
        txtLama.setText("");
        C_ombo.setSelectedIndex(0);
        totalBayar.setText("");
        hslNama.setText("");
        hslAlamat.setText("");
        hslJenis.setText("");
        hslLama.setText("");
        hslHarga.setText("");
        hslMember.setText("");
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        
        nama = String.valueOf(txtNama.getText());
        alamat = String.valueOf(txtAlamat.getText());
        membership = C_ombo.getSelectedItem().toString();
        hslMember.setText(membership);
        hslNama.setText("" + nama);
        hslAlamat.setText("" + alamat);
        try{
            jenis = Integer.parseInt(txtJenis.getText());
            lama = Integer.parseInt(txtLama.getText());
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Invalid Input, Please Check Again", " ", JOptionPane.ERROR_MESSAGE);
        }
        
        if (C_ombo.getSelectedItem() == "Diamond Membership"){
        diskon = 0.5;
        }
        else if (C_ombo.getSelectedItem() == "Platinum Membership"){
        diskon = 0.7;
        }
        else if (C_ombo.getSelectedItem() == "Gold Membership"){
        diskon = 0.9;
        }
        else if (C_ombo.getSelectedItem() == "Non Membership"){
        diskon = 1;
        }
     
    
        
        if (jenis == 1) {
            hslJenis.setText("ARJUNA'S Villa");
            harga = 200000 ;
        } else if (jenis == 2) {
            harga = 275000 ;         
            hslJenis.setText("DIANA'S Villa");
        } else if (jenis == 3) {    
            hslJenis.setText("ELMAGNIFICO'S Villa");
            harga = 300000 ;         
        } else if (jenis == 4) {
            hslJenis.setText("MARINA'S Villa");
            harga = 350000 *diskon;         
         } else if (jenis == 5) {
            harga = 400000;         
            hslJenis.setText("SKORTEL'S Villa");
        }
        
        subtotal = hitungHarga(harga, diskon);
        totalBayar.setText("Rp"+subtotal);
        
        if (jenis == 1) {
            tarif = lama * 200000;
            
        } else if (jenis == 2) {
            tarif = lama * 275000;
         
        } else if (jenis == 3) {
            tarif = lama * 300000;
            ;
        } else if (jenis == 4) {
            tarif = lama * 350000;
            
        } else if (jenis == 5) {
            tarif = lama * 400000;
           
        }
        {
        }
        hslLama.setText(txtLama.getText()+" Hari");
        hslHarga.setText("Rp. " + (tarif - subtotal));
        
    }//GEN-LAST:event_btnhitungActionPerformed

    private void C_omboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_omboActionPerformed

    }//GEN-LAST:event_C_omboActionPerformed

    private void totalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBayarActionPerformed

    private void hslMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hslMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hslMemberActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
    Feedback menu2 = new Feedback();
    menu2.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_feedbackActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
    ContactUs menu3 = new ContactUs();
    menu3.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_contactActionPerformed

    public double hitungHarga(double a, double b){
        return a*b;
    }
    
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
            java.util.logging.Logger.getLogger(FormVilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C_ombo;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton contact;
    private javax.swing.JButton feedback;
    private javax.swing.JTextField hslAlamat;
    private javax.swing.JTextField hslHarga;
    private javax.swing.JTextField hslJenis;
    private javax.swing.JTextField hslLama;
    private javax.swing.JTextField hslMember;
    private javax.swing.JTextField hslNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField totalBayar;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
