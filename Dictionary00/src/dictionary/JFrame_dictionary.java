/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author user56
 */
public class JFrame_dictionary extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_dictionary
     */
    public JFrame_dictionary() {
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

        in_dic = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        out_dic = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_word = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        in_dic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_dicActionPerformed(evt);
            }
        });
        in_dic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_dicKeyTyped(evt);
            }
        });

        jScrollPane2.setViewportView(out_dic);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("TỪ ĐIỂN ANH VIỆT");

        list_word.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_wordValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(list_word);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(in_dic)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(in_dic, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_dicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_dicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_dicActionPerformed
    private DefaultListModel<String> data;
    private ArrayList<Word> arr;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        data =new DefaultListModel<>();
        list_word.setModel(data);
        arr =new ArrayList<>();
        Word a=new Word("a","sdasdad");
        arr.add(a);
        
        a=new Word("abc","sdasdfdffdfrf");
        arr.add(a);
        a=new Word("bc","sdasdfdffdfrf");
        arr.add(a);
        a=new Word("bcerwerwe","sda23432432sdfdffdfrf");
        arr.add(a);
        a=new Word("con","sdas234234234dfdffdfrf");
        arr.add(a);
        a=new Word("demeje","sdasdfdffd234234234frf");
        arr.add(a);
        a=new Word("deonha","sdasdfdffd2342342343frf");
        arr.add(a);
        a=new Word("hien","sdasdfdffdf34234234rf");
        arr.add(a);
        a=new Word("psdfsd","sdasdfdffdfrf");
        arr.add(a);
        a=new Word("dfsdfs","sdasdfdff23423423dfrf");
        arr.add(a);a=new Word("abc","sdasdfdff34234234dfrf");
        arr.add(a);
        
        for(int i=0;i<arr.size();i++)
        {
            data.addElement(arr.get(i).getWord_target());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void in_dicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_dicKeyTyped
        String text = in_dic.getText().trim();
        text+=evt.getKeyChar();
        text=text.trim();
        for(int i=0;i<data.size();i++)
        {
            String  val=""+data.getElementAt(i);
            if(val.startsWith(text))
            {
                list_word.setSelectedIndex(i);
                return;
            }
        }
        out_dic.setText("từ nhập không tồn tại hoặc từ điển chưa cập nhật");
        list_word.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_in_dicKeyTyped

    private void list_wordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_wordValueChanged
        if(!list_word.isSelectionEmpty())
        {
            int index = list_word.getSelectedIndex();
            Word a = arr.get(index);
            out_dic.setText(a.getWord_explain());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_list_wordValueChanged

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
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_dictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField in_dic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> list_word;
    private javax.swing.JTextPane out_dic;
    // End of variables declaration//GEN-END:variables
}
