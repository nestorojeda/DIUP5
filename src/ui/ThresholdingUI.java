package ui;

import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ThresholdingUI extends javax.swing.JFrame {
    
    boolean open = false;

    public ThresholdingUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?", "Cerrar",JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }else{
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        
        this.setTitle("Umbralizador de imágenes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        aboutMeDialog = new javax.swing.JDialog();
        authorsLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        compareJDialog = new javax.swing.JDialog();
        originalImagePanel = new ui.ImagePanel();
        modifiedImagePanel = new ui.ImagePanel();
        imagePanel1 = new ui.ImagePanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        compareMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        thresholdingMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        tipsMenuItem = new javax.swing.JMenuItem();
        aboutMeMenuItem = new javax.swing.JMenuItem();

        authorsLabel.setText("Desarrollado por Daniel Delgado Perera y Néstor Ojeda González");

        titleLabel.setText("Umbralizador de imágenes");

        versionLabel.setText("Versión 1.0");

        javax.swing.GroupLayout aboutMeDialogLayout = new javax.swing.GroupLayout(aboutMeDialog.getContentPane());
        aboutMeDialog.getContentPane().setLayout(aboutMeDialogLayout);
        aboutMeDialogLayout.setHorizontalGroup(
            aboutMeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutMeDialogLayout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(100, 100, 100))
            .addGroup(aboutMeDialogLayout.createSequentialGroup()
                .addGroup(aboutMeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutMeDialogLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(authorsLabel))
                    .addGroup(aboutMeDialogLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(versionLabel)))
                .addGap(8, 8, 8))
        );
        aboutMeDialogLayout.setVerticalGroup(
            aboutMeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMeDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authorsLabel)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        compareJDialog.setTitle("Comparación");
        compareJDialog.setModal(true);
        compareJDialog.setResizable(false);
        compareJDialog.setSize(new java.awt.Dimension(1638, 643));

        originalImagePanel.setMaximumSize(new java.awt.Dimension(800, 600));
        originalImagePanel.setMinimumSize(new java.awt.Dimension(800, 600));
        originalImagePanel.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout originalImagePanelLayout = new javax.swing.GroupLayout(originalImagePanel);
        originalImagePanel.setLayout(originalImagePanelLayout);
        originalImagePanelLayout.setHorizontalGroup(
            originalImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        originalImagePanelLayout.setVerticalGroup(
            originalImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        modifiedImagePanel.setMaximumSize(new java.awt.Dimension(800, 600));
        modifiedImagePanel.setMinimumSize(new java.awt.Dimension(800, 600));
        modifiedImagePanel.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout modifiedImagePanelLayout = new javax.swing.GroupLayout(modifiedImagePanel);
        modifiedImagePanel.setLayout(modifiedImagePanelLayout);
        modifiedImagePanelLayout.setHorizontalGroup(
            modifiedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        modifiedImagePanelLayout.setVerticalGroup(
            modifiedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout compareJDialogLayout = new javax.swing.GroupLayout(compareJDialog.getContentPane());
        compareJDialog.getContentPane().setLayout(compareJDialogLayout);
        compareJDialogLayout.setHorizontalGroup(
            compareJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compareJDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(originalImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifiedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        compareJDialogLayout.setVerticalGroup(
            compareJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compareJDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(compareJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifiedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originalImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        imagePanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        imagePanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        imagePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagePanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imagePanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        fileMenu.setText("Archivo");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Abrir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Guardar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        compareMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        compareMenuItem.setText("Comparar");
        compareMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(compareMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edición");

        thresholdingMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        thresholdingMenuItem.setText("Umbralizar");
        thresholdingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thresholdingMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(thresholdingMenuItem);

        jMenuBar1.add(editMenu);

        helpMenu.setText("Ayuda");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });

        tipsMenuItem.setText("Consejos");
        tipsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(tipsMenuItem);

        aboutMeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        aboutMeMenuItem.setText("Acerca de");
        aboutMeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMeMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMeMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuActionPerformed

    }//GEN-LAST:event_helpMenuActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

         int returnVal = fileChooser.showOpenDialog(ThresholdingUI.this);
          if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if(!"jpg".equals(getExtension(file))){
                warningDialog("Primero debes abrir un archivo");
                openMenuItemActionPerformed(evt);
                
            }else{
                imagePanel1.setImage(file);
                System.out.println("Opening: " + file.getName() + "." );
                open = true;
                this.pack();
            }
        } else {
            System.out.println("Open command cancelled by user.");
        }
        
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void aboutMeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMeMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
                "Desarrollado por Daniel Delgado Perera y Néstor Ojeda González\n"
                + "Versión 1.0",
                "Acerca de mí",
        JOptionPane.PLAIN_MESSAGE);
   
    }//GEN-LAST:event_aboutMeMenuItemActionPerformed

    private void thresholdingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thresholdingMenuItemActionPerformed
         if(!open){
            warningDialog("Primero debes abrir un archivo");
        }else{
            String s = (String) JOptionPane.showInputDialog(
                    this,"Valor del umbral:",
                    "Inserte un valor entero positivo",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null, "");
            if(s == null) return;
            if(isNumeric(s)){
                if(Integer.valueOf(s) > 255){
                    warningDialog("Debe ser un número entre 0 y 255");                  
                    thresholdingMenuItemActionPerformed(evt);
                    return;
                }
                imagePanel1.thresholding(Integer.valueOf(s));
            }else{
                warningDialog("Debe ser un número entero positivo menor que 255");
                thresholdingMenuItemActionPerformed(evt);
            }
            
        }
    }//GEN-LAST:event_thresholdingMenuItemActionPerformed
    
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        if(!open){
            warningDialog("Primero debes abrir un archivo");
        }else{
            int retrival = fileChooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                try {
                    File f = new File(fileChooser.getSelectedFile()+".jpg");
                    ImageIO.write(imagePanel1.getImage(), "jpg", f);
                } catch (IOException ex) {}
            }
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void imagePanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MousePressed
        // TODO add your handling code here:
        imagePanel1.checkOriginal();
    }//GEN-LAST:event_imagePanel1MousePressed

    private void imagePanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MouseReleased
        // TODO add your handling code here:
        imagePanel1.returnToModifiedImage();
    }//GEN-LAST:event_imagePanel1MouseReleased

    private void compareMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareMenuItemActionPerformed
        // TODO add your handling code here:
         if(!open){
            warningDialog("Primero debes abrir un archivo");
        }else if(!imagePanel1.isModified()){
            warningDialog("Primero debes umbralizar la imagen");
        }else{ 
            originalImagePanel.setImage(imagePanel1.getOriginal());
            modifiedImagePanel.setImage(imagePanel1.getModified()); 
            this.compareJDialog.setVisible(true);
        }
    }//GEN-LAST:event_compareMenuItemActionPerformed

    private void tipsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
                "Para comenzar a usar el programa, abra un archivo.\n"
                +"En el menú de edición, seleccione 'Umbralizar' para introducir el valor del umbral.\n"
                + "Puede ver el antes y el despúes con la opción 'Comparar' o manteniendo pulsada la imagen.",
        "Consejos",
        JOptionPane.PLAIN_MESSAGE);
        
        
    }//GEN-LAST:event_tipsMenuItemActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
      
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     
        java.awt.EventQueue.invokeLater(() -> {
            new ThresholdingUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog aboutMeDialog;
    private javax.swing.JMenuItem aboutMeMenuItem;
    private javax.swing.JLabel authorsLabel;
    private javax.swing.JDialog compareJDialog;
    private javax.swing.JMenuItem compareMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private ui.ImagePanel imagePanel1;
    private javax.swing.JMenuBar jMenuBar1;
    private ui.ImagePanel modifiedImagePanel;
    private javax.swing.JMenuItem openMenuItem;
    private ui.ImagePanel originalImagePanel;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem thresholdingMenuItem;
    private javax.swing.JMenuItem tipsMenuItem;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

    private void warningDialog(String s) {
        JOptionPane.showMessageDialog(this,
            s,
            "Aviso",
            JOptionPane.WARNING_MESSAGE);
    }
    
    private String getExtension(File file) {
        String extension = "";
        int i = file.getName().lastIndexOf('.');
        if (i > 0) {
            extension = file.getName().substring(i+1);
        }  
       return extension;
    }
    
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");  //match a number with optional '-' and decimal.
    }
}
