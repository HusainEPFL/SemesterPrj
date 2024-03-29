/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

/**
 *
 * @author huseyngasimov
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    private Game mlnGame=null;
    private AddQuestion addQuestion=null;
    private BestScores bestScores=null;
    
    public Main() {
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

        btnPlayGame = new javax.swing.JButton();
        btnAddQuestion = new javax.swing.JButton();
        btnSeeBestScores = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Who Wants to be a Millionaire?");
        setResizable(false);

        btnPlayGame.setText("Play Game");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayGame(evt);
            }
        });

        btnAddQuestion.setText("Add a Question");
        btnAddQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddQuextion(evt);
            }
        });

        btnSeeBestScores.setText("See Best Scores");
        btnSeeBestScores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeeBestScores(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quit(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(226, 226, 226)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(btnAddQuestion)
                        .add(layout.createSequentialGroup()
                            .add(btnPlayGame)
                            .add(16, 16, 16)))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, btnQuit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, btnSeeBestScores)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .add(btnPlayGame)
                .add(18, 18, 18)
                .add(btnAddQuestion)
                .add(18, 18, 18)
                .add(btnSeeBestScores)
                .add(18, 18, 18)
                .add(btnQuit)
                .add(144, 144, 144))
        );

        btnPlayGame.getAccessibleContext().setAccessibleName("btnGame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayGame
        if(mlnGame==null) {
            mlnGame = new Game(this);
        }
        
        mlnGame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PlayGame

    private void Quit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quit
        // Quit the game
        System.exit(0);
    }//GEN-LAST:event_Quit

    private void AddQuextion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddQuextion
        if(addQuestion==null) {
            addQuestion = new AddQuestion(this);
        }
        
        addQuestion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddQuextion

    private void SeeBestScores(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeeBestScores
         if(bestScores==null) {
             bestScores = new BestScores(this);
         }
         
         bestScores.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_SeeBestScores

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddQuestion;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSeeBestScores;
    // End of variables declaration//GEN-END:variables
}
