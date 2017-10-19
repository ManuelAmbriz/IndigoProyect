
package indigoproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class index extends javax.swing.JFrame {
    public index() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        output = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        input2 = new javax.swing.JTextField();
        Ndigit = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        input4 = new javax.swing.JTextField();
        input5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indigoproject/icons8-Input-48.png"))); // NOI18N
        jLabel1.setText("Input");

        input1.setText("2");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indigoproject/icons8-Numbered List-64.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indigoproject/icons8-Equals-40.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        input2.setText("10 5");

        Ndigit.setText("3675356291");

        input3.setText("2");

        input4.setText("101110");
        input4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input4ActionPerformed(evt);
            }
        });

        input5.setText("800000");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indigoproject/icons8-Numbered List-64.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indigoproject/icons8-Equals-40.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indigoproject/icons8-Input-48.png"))); // NOI18N
        jLabel4.setText("Input");

        output2.setColumns(20);
        output2.setRows(5);
        jScrollPane1.setViewportView(output2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Ndigit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(output, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(input1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(382, 382, 382))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ndigit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String delimitadores= " ";   
        int flagstart=0, numberofproducts=1, flag=-100;  
        int bigger = 0; 
        String[] palabrasSeparadas = input2.getText().split(delimitadores);
        String N=null;
        String K=null;   
        String ndigit=Ndigit.getText();  
        if(palabrasSeparadas.length==2){
            K=palabrasSeparadas[1];N=palabrasSeparadas[0];
             System.out.println(K);
            int product[] = new int[Integer.parseInt(N)-Integer.parseInt(K)];
            if(Integer.parseInt(K)>=1 && Integer.parseInt(K)<= 7 && Integer.parseInt(N)>=Integer.parseInt(K) && Integer.parseInt(N) <= 100 ){
                 char[] Ndigitcaracteres = ndigit.toCharArray();
                 while (flag<0){
                     numberofproducts=1;
                   for (int i = flagstart;i<=(flagstart+Integer.parseInt(K))-1;i++){
                      numberofproducts = Integer.parseInt(Ndigitcaracteres[i]+"")*numberofproducts;
                      System.out.println(numberofproducts);
                   } 
                  
                   if(flagstart < (Integer.parseInt(N)-Integer.parseInt(K))-1)
                   {flagstart = flagstart+1;
                     product[flagstart] = numberofproducts;                   
                        if(numberofproducts>bigger)bigger=numberofproducts;}
                   else flag =100;
                 }
                 output.setText(""+bigger);
            } else JOptionPane.showMessageDialog(null, " Error !! ingrese una entrada correcta");
        }else JOptionPane.showMessageDialog(null, " Error !! ingrese una entrada correcta");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        palindromic pal = new palindromic();
        int st = Integer.parseInt(input4.getText());
        int en = Integer.parseInt(input5.getText());
        boolean Ispal = false;
        String Text = "";
        int [] one = new int [1000];
            int [] two = new int [1000];
        ArrayList poli = new ArrayList(); 
          if(en>st){
            
                
              for (int x =99 ; x<=999; x++){
                 // System.out.println(x);
                  one[x]=x;two[x]=x;
             }
            for (int i =0 ; i<one.length; i++){
               for (int j =0 ; j<one.length; j++){
                   if(one[i]>99 && two[j]>99){
                       if(one[i]*two[j]>st && one[i]*two[j]<en){
                         Ispal = pal.Check(one[i]*two[j]+"");
                            if(Ispal==true){poli.add(one[i]*two[j]+"");}
                       }
                   }                   
               }
            }
            for(int y=0;y<poli.size();y++){
                
               Text ="  " + poli.get(y)+ Text ;
                output2.setText(Text+ " ");}
            System.out.println(poli);
          }
          else JOptionPane.showMessageDialog(null, " Error !! ingrese una entrada correcta");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void input4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ndigit;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JTextField input4;
    private javax.swing.JTextField input5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField output;
    private javax.swing.JTextArea output2;
    // End of variables declaration//GEN-END:variables
}
