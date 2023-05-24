package Aula4_OO.Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author thell
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setTitle("Visualização");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textCor = new javax.swing.JTextField();
        textModelo = new javax.swing.JTextField();
        textAno = new javax.swing.JTextField();
        buttonMostrarACor = new javax.swing.JButton();
        buttonMudarACor = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonMostrarModelo = new javax.swing.JButton();
        buttonMudarModelo = new javax.swing.JButton();
        buttonMostrarAno = new javax.swing.JButton();
        buttonMudarAno = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMostrarACor = new javax.swing.JMenu();
        menuMostrarACor2 = new javax.swing.JMenuItem();
        menuMudarACor = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cor ");

        jLabel2.setText("Modelo");

        jLabel3.setText("Ano");

        textCor.setText(" ");
        textCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorActionPerformed(evt);
            }
        });

        textModelo.setText(" ");

        textAno.setText(" ");
        textAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAnoActionPerformed(evt);
            }
        });

        buttonMostrarACor.setText("Mostrar cor atual");
        buttonMostrarACor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarACorActionPerformed(evt);
            }
        });

        buttonMudarACor.setText("Mudar a cor");
        buttonMudarACor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMudarACorActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        buttonMostrarModelo.setText("Mostrar o Modelo");
        buttonMostrarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarModeloActionPerformed(evt);
            }
        });

        buttonMudarModelo.setText("Mudar o Modelo");
        buttonMudarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMudarModeloActionPerformed(evt);
            }
        });

        buttonMostrarAno.setText("Mostrar o Ano");
        buttonMostrarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarAnoActionPerformed(evt);
            }
        });

        buttonMudarAno.setText("Mudar o Ano");
        buttonMudarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMudarAnoActionPerformed(evt);
            }
        });

        menuMostrarACor.setText("Arquivo");
        menuMostrarACor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarACorActionPerformed(evt);
            }
        });

        menuMostrarACor2.setText("Mostra cor atual");
        menuMostrarACor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarACor2ActionPerformed(evt);
            }
        });
        menuMostrarACor.add(menuMostrarACor2);

        menuMudarACor.setText("Mudar a cor");
        menuMudarACor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMudarACorActionPerformed(evt);
            }
        });
        menuMostrarACor.add(menuMudarACor);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuMostrarACor.add(menuSair);

        jMenuBar1.add(menuMostrarACor);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ajuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(24, 24, 24)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textAno)
                                    .addComponent(textModelo)
                                    .addComponent(textCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonMostrarACor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonMostrarAno)
                                    .addComponent(buttonMostrarModelo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonMudarModelo)
                                    .addComponent(buttonMudarAno)
                                    .addComponent(buttonMudarACor))))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMostrarACor)
                    .addComponent(buttonMudarACor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMostrarModelo)
                    .addComponent(buttonMudarModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMostrarAno)
                    .addComponent(buttonMudarAno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void textCorActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void textAnoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void buttonMostrarACorActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Bike b1 = new Bike();
        b1.setCor(textCor.getText());
        JOptionPane.showMessageDialog(null, "Cor Atual "+b1.getCor());
    }                                                 

    private void buttonMudarACorActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Bike b2 = new Bike();
        b2.setCor(textCor.getText());
        JOptionPane.showMessageDialog(null, "Nova cor "+b2.getCor());
        textCor.setText(" ");
    }                                               

    private void menuMostrarACor2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Bike b1 = new Bike();
        b1.setCor(textCor.getText());
        JOptionPane.showMessageDialog(null, "Cor Atual "+b1.getCor());
    }                                                

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(JOptionPane.showConfirmDialog(rootPane,"Deseja sair ?","Sair ", JOptionPane.YES_NO_OPTION)==0)
            System.exit(0);
    }                                        

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(JOptionPane.showConfirmDialog(rootPane,"Deseja sair ?","Sair ", JOptionPane.YES_NO_OPTION)==0)
            System.exit(0);
    }                                          

    private void menuMostrarACorActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Bike b1 = new Bike();
        b1.setCor(textCor.getText());
        JOptionPane.showMessageDialog(null, "Cor Atual "+b1.getCor());
    }                                               

    private void menuMudarACorActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Bike b2 = new Bike();
        b2.setCor(textCor.getText());
        JOptionPane.showMessageDialog(null, "Nova cor "+b2.getCor());
        textCor.setText(" ");
    }                                             

    private void buttonMudarModeloActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Bike b3 = new Bike();
        b3.setModelo(textModelo.getText());
        JOptionPane.showMessageDialog(null, "Modelo alterado "+b3.getModelo());
        textModelo.setText(" ");
    }                                                 

    private void buttonMostrarModeloActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        Bike b3 = new Bike();
        b3.setModelo(textModelo.getText());
        JOptionPane.showMessageDialog(null, "Modelo Atual "+b3.getModelo());
    }                                                   

    private void buttonMostrarAnoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Bike b4 = new Bike();
        b4.setAno(Integer.parseInt(textAno.getText()));
        JOptionPane.showMessageDialog(null, "Ano atual "+b4.getAno());
    }                                                

    private void buttonMudarAnoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        Bike b4 = new Bike();
        b4.setAno(Integer.parseInt(textAno.getText()));
        JOptionPane.showMessageDialog(null, "Ano alterado "+b4.getAno());
        textAno.setText(" ");
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonMostrarACor;
    private javax.swing.JButton buttonMostrarAno;
    private javax.swing.JButton buttonMostrarModelo;
    private javax.swing.JButton buttonMudarACor;
    private javax.swing.JButton buttonMudarAno;
    private javax.swing.JButton buttonMudarModelo;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuMostrarACor;
    private javax.swing.JMenuItem menuMostrarACor2;
    private javax.swing.JMenuItem menuMudarACor;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textCor;
    private javax.swing.JTextField textModelo;
    // End of variables declaration                   
}

