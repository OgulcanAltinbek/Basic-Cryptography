/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siber;

/**
 *
 * @author ogulc
 */
public class Cryptology extends javax.swing.JFrame {
    
    
     static char[] chars = {
        'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ' , 'h',
        'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö' ,'p', 'r',
        's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z', 'q',
        'w', 'x', '0', '1', '2', '3', '4', '5',
        '6', '7', '8', '9', '.' , ',' , '!' , '?' ,
        '"'      
    };
    static String charstring = "abcçdefgğhıijklmnoöprsştuüvyzqwx0123456789.,!?\"ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZQWX";
    String plaintext= "";
    String ciphertext="";
    int key;
    int key1;
    static String subsString = "\"qasübi9tç0ğ6fkxz5.n,c7!w?1o3hd2g8ljyvuermıöpş4ÜĞPOIUYTREWQİŞLKJHGFDSAÇÖMNBVCXZ";
    
    /**
     * Creates new form Cryptology
     */
    public Cryptology() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PLAINTEXT:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Affine", "Substitution", "Shif(Caesar)", "Vigenere" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ŞİFRELEME YÖNETİMİ:");

        jButton3.setText("Şifrele");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Şifreyi Çöz");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("CIPHERTEXT:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextField1.setText("Key1");

        jTextField2.setText("Key2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         if(jComboBox1.getSelectedItem().toString().equals("Shif(Caesar)")){
            jTextField2.setVisible(false);
            jTextField1.setVisible(true);
        }
          if(jComboBox1.getSelectedItem().toString().equals("Substitution")){
            jTextField2.setVisible(false);
            jTextField1.setVisible(false);
        }
            if(jComboBox1.getSelectedItem().toString().equals("Vigenere")){
            jTextField2.setVisible(false);
            jTextField1.setVisible(true);
        }
            if(jComboBox1.getSelectedItem().toString().equals("Affine")){
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1İtemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextArea2.setText("");
        plaintext = jTextArea3.getText().toString();
       
        if(jComboBox1.getSelectedItem().toString().equals("Shif(Caesar)")){
            key = Integer.parseInt(jTextField1.getText().toString());
            ciphertext = shiftCipherEncy(plaintext, key);
            jTextArea2.setText(ciphertext);
        }
        if(jComboBox1.getSelectedItem().toString().equals("Affine")){
            key = Integer.parseInt(jTextField1.getText().toString());
            key1 = Integer.parseInt(jTextField2.getText().toString());
            ciphertext = affineEncy(plaintext, key,key1);
            jTextArea2.setText(ciphertext);
        }
        if(jComboBox1.getSelectedItem().toString().equals("Vigenere")){
            ciphertext = vigenereencrypt(plaintext, jTextField1.getText().toString());
            jTextArea2.setText(ciphertext);
        }
        if(jComboBox1.getSelectedItem().toString().equals("Substitution")){
            ciphertext = subsencrypt(plaintext);
            jTextArea2.setText(ciphertext);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea3.setText("");
        ciphertext = jTextArea2.getText().toString();
        
        
        if(jComboBox1.getSelectedItem().toString().equals("Shif(Caesar)")){
            key = Integer.parseInt(jTextField1.getText().toString());
            plaintext = shiftCipherdecrypt(ciphertext, key);
            jTextArea3.setText(plaintext);
        }
         if(jComboBox1.getSelectedItem().toString().equals("Affine")){
            key = Integer.parseInt(jTextField1.getText().toString());
            key1 = Integer.parseInt(jTextField2.getText().toString());
            plaintext = affinedecrypt(ciphertext, key,key1);
            jTextArea3.setText(plaintext);
        }
          if(jComboBox1.getSelectedItem().toString().equals("Vigenere")){
            plaintext = vigeneredecrypt(ciphertext,jTextField1.getText().toString());
            jTextArea3.setText(plaintext);
        }
          if(jComboBox1.getSelectedItem().toString().equals("Substitution")){
            plaintext = subsDencrypt(ciphertext);
            jTextArea3.setText(plaintext);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    static String shiftCipherEncy(String text, int key)
    {
        String cipher="";
        String harf="";
        int index=0;
        for(int i=0;i<text.length();i++){
            harf= String.valueOf(text.charAt(i));
            index = charstring.indexOf(harf);
            cipher += charstring.charAt( (key+index) % charstring.length() ); 
        }
        return cipher;
    }
    
   static String shiftCipherdecrypt(String cip, int key)
    {
        String plain="";
        String harf="";
        int index=0;
        for(int i=0;i<cip.length();i++){
            harf= String.valueOf(cip.charAt(i));
            index = charstring.indexOf(harf);
            plain += charstring.charAt( ((index - key) + charstring.length()) % charstring.length() ); 
        }
        return plain;
      
  
    }
   
   
   static String affineEncy(String text,int key, int key1)
    {
        String cipher="";
        String harf="";
        int index=0;
        for(int i=0;i<text.length();i++){
            harf= String.valueOf(text.charAt(i));
            index = charstring.indexOf(harf);
            cipher += charstring.charAt( (key*index+key1) % charstring.length() ); 
        }
        return cipher;
    }
   
   static String affinedecrypt(String cip,int key, int key1)
    {   
        String plain="";
        String harf="";
        int index=0;
        for(int i=0;i<cip.length();i++){
            harf= String.valueOf(cip.charAt(i));
            index = charstring.indexOf(harf);
            plain += charstring.charAt( ( ((index-key1) + charstring.length() ) % charstring.length() ) / key ); 
        }
        return plain;

    }
    
   static String vigenereencrypt(String text, String key) {
       String yeniKey = key;
       String cipher="";
       int i=0;
       if(text.length() > key.length()){
            while(true){
                yeniKey = yeniKey + String.valueOf(yeniKey.charAt(i));
                i++;
                if(text.length()==yeniKey.length()) break; 
                if(i > key.length()) i=0;
            }
       }
        if(text.length() < key.length()){
               yeniKey = yeniKey.substring(0,text.length());   
       }
        
           int pindex=0; 
           int kindex=0;
            for(int j=0;j<text.length();j++){
                pindex = charstring.indexOf(text.charAt(j));
                kindex = charstring.indexOf(yeniKey.charAt(j));
                cipher += charstring.charAt( (pindex+kindex) % charstring.length() );
            }
            
       System.out.println(yeniKey);
       return cipher;
   }
       
   public static String vigeneredecrypt(String text, String key)
    {
       String yeniKey = key;
       String plain="";
       int i=0;
       if(text.length() > key.length()){
            while(true){
                yeniKey = yeniKey + String.valueOf(yeniKey.charAt(i));
                i++;
                if(text.length()==yeniKey.length()) break; 
                if(i > key.length()) i=0;
            }
       }
        if(text.length() < key.length()){
               yeniKey = yeniKey.substring(0,text.length());   
       }
        
           int cindex=0; 
           int kindex=0;
            for(int j=0;j<text.length();j++){
                cindex = charstring.indexOf(text.charAt(j));
                kindex = charstring.indexOf(yeniKey.charAt(j));
                plain += charstring.charAt( ( (cindex-kindex) + charstring.length() )  % charstring.length() );
            }
            
       System.out.println(yeniKey);
       return plain;
      
    } 
   
    static String subsencrypt(String text) {
        
         String cipher="";
         int index;
         char harf;
         
         for(int i=0;i<text.length();i++){
             harf= text.charAt(i);
             index = charstring.indexOf(harf);
             cipher += subsString.charAt(index);
             
         }
         
         return cipher;
   }
    
    static String subsDencrypt(String text) {
        
         String plain="";
         int index;
         char harf;
         
         for(int i=0;i<text.length();i++){
             harf= text.charAt(i);
             index = subsString.indexOf(harf);
             plain += charstring.charAt(index);
             
         }
         
         return plain;
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
            java.util.logging.Logger.getLogger(Cryptology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cryptology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cryptology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cryptology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cryptology().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
