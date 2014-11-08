

package paint;


import java.awt.image.RenderedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.filechooser.FileNameExtensionFilter; 


/**
 *
 * @author  Anonimo
 */
public class Paint extends javax.swing.JFrame {
    // instancia un filtro de archivo buscara arch. con extension .jpg.
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen","jpg");
    String rutaimgen;
    
    PanelDibujo lienzo=new PanelDibujo();
    boolean color=true;
    /*
        Creamos un objeto de tipo PanelDibujo (lienzo)
     * y lo agregamos a el area de trabajo.
     */

    public Paint() {
        initComponents();
        
        //crea un panel en coord. getX=10, getY=90 del tamaño(710,420)pixels
        // luego lo agrega.
        lienzo.setBounds(10, 90, 710, 420);
        this.add(lienzo);
        frmColor.pack();
        frmGuardar.pack();
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmColor = new javax.swing.JFrame();
        colores = new javax.swing.JColorChooser();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        frmGuardar = new javax.swing.JFrame();
        selecDirec = new javax.swing.JFileChooser();
        frmAbrir = new javax.swing.JFrame();
        BuscarDirec = new javax.swing.JFileChooser();
        BarraHerramientas = new javax.swing.JToolBar();
        btnLapiz = new javax.swing.JButton();
        btnLinea = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnRectanguloRedond = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        btnFondo = new javax.swing.JButton();
        chkRelleno = new javax.swing.JCheckBox();
        BarraMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Información = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout frmColorLayout = new org.jdesktop.layout.GroupLayout(frmColor.getContentPane());
        frmColor.getContentPane().setLayout(frmColorLayout);
        frmColorLayout.setHorizontalGroup(
            frmColorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, frmColorLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(colores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(frmColorLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(btnAceptar)
                .add(77, 77, 77)
                .add(btnCancelar)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        frmColorLayout.setVerticalGroup(
            frmColorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(frmColorLayout.createSequentialGroup()
                .add(colores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(frmColorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAceptar)
                    .add(btnCancelar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frmGuardar.setTitle("Guardar como...");
        frmGuardar.setResizable(false);

        selecDirec.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        selecDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecDirecActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout frmGuardarLayout = new org.jdesktop.layout.GroupLayout(frmGuardar.getContentPane());
        frmGuardar.getContentPane().setLayout(frmGuardarLayout);
        frmGuardarLayout.setHorizontalGroup(
            frmGuardarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(frmGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .add(selecDirec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmGuardarLayout.setVerticalGroup(
            frmGuardarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, frmGuardarLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(selecDirec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 397, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout frmAbrirLayout = new org.jdesktop.layout.GroupLayout(frmAbrir.getContentPane());
        frmAbrir.getContentPane().setLayout(frmAbrirLayout);
        frmAbrirLayout.setHorizontalGroup(
            frmAbrirLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
            .add(frmAbrirLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(frmAbrirLayout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(BuscarDirec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        frmAbrirLayout.setVerticalGroup(
            frmAbrirLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
            .add(frmAbrirLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(frmAbrirLayout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(BuscarDirec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini_Editor 2014");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        BarraHerramientas.setRollover(true);
        BarraHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/LAPIZ.gif"))); // NOI18N
        btnLapiz.setText("Lapiz");
        btnLapiz.setFocusable(false);
        btnLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapizActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnLapiz);

        btnLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/linea.gif"))); // NOI18N
        btnLinea.setText("Línea");
        btnLinea.setFocusable(false);
        btnLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnLinea);

        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/Sin título-1.gif"))); // NOI18N
        btnCirculo.setText("Elipse");
        btnCirculo.setFocusable(false);
        btnCirculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCirculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnCirculo);

        btnRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/rect.gif"))); // NOI18N
        btnRectangulo.setText("Rectángulo");
        btnRectangulo.setFocusable(false);
        btnRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnRectangulo);

        btnRectanguloRedond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/rectRedondeado.gif"))); // NOI18N
        btnRectanguloRedond.setText("R. Redon.");
        btnRectanguloRedond.setFocusable(false);
        btnRectanguloRedond.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRectanguloRedond.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRectanguloRedond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloRedondActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnRectanguloRedond);

        btnColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/color.gif"))); // NOI18N
        btnColor.setText("Color");
        btnColor.setFocusable(false);
        btnColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnColor);

        btnFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/color.gif"))); // NOI18N
        btnFondo.setText("C. Fondo");
        btnFondo.setFocusable(false);
        btnFondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFondo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondoActionPerformed(evt);
            }
        });
        BarraHerramientas.add(btnFondo);

        chkRelleno.setText("Rellenar");
        chkRelleno.setFocusable(false);
        chkRelleno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chkRelleno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chkRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRellenoActionPerformed(evt);
            }
        });
        BarraHerramientas.add(chkRelleno);

        Archivo.setText("File");

        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/openFile.png"))); // NOI18N
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Archivo.add(Abrir);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/saveFile.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Archivo.add(Guardar);

        Información.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/icon_info_16.gif"))); // NOI18N
        Información.setText("Info");
        Información.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformaciónActionPerformed(evt);
            }
        });
        Archivo.add(Información);

        BarraMenu.add(Archivo);

        Edit.setText("Edit");
        BarraMenu.add(Edit);

        setJMenuBar(BarraMenu);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BarraHerramientas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(BarraHerramientas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapizActionPerformed
        lienzo.lapiz=1;
        lienzo.linea=0;
        lienzo.circulo=0;
        lienzo.rectangulo=0;
        lienzo.rectanguloRed=0;
    }//GEN-LAST:event_btnLapizActionPerformed

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        lienzo.lapiz=0;
        lienzo.linea=1;
        lienzo.circulo=0;
        lienzo.rectangulo=0;
        lienzo.rectanguloRed=0;
    }//GEN-LAST:event_btnLineaActionPerformed

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        lienzo.lapiz=0;
        lienzo.linea=0;
        lienzo.circulo=1;
        lienzo.rectangulo=0;
        lienzo.rectanguloRed=0;
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        color=true;
        frmColor.setVisible(true);
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondoActionPerformed
        color=false;
        frmColor.setVisible(true);
    }//GEN-LAST:event_btnFondoActionPerformed

    private void chkRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRellenoActionPerformed
        if(chkRelleno.isSelected()){
            lienzo.relleno=true;
        }else{
            lienzo.relleno=false;
        }
    }//GEN-LAST:event_chkRellenoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(color){
            lienzo.seleccion=colores.getColor();
        }else{
            lienzo.fondo=colores.getColor();
        }
        frmColor.setVisible(false);
}//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmColor.setVisible(false);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void selecDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecDirecActionPerformed
        System.out.println(evt.getActionCommand());
        if(evt.getActionCommand().equals("ApproveSelection")){
            System.out.println("entro");
            if(selecDirec.getSelectedFile()!=null){
                File salida= selecDirec.getSelectedFile();
                if(!salida.getAbsolutePath().endsWith("png")){
                    File t = new File(salida.getAbsolutePath()+"png");
                    salida.renameTo(t);
                }
                
                RenderedImage rend = lienzo.getImage();
                try{
                    //Escribe nombre y extension del archivo a guardar.
                    ImageIO.write(rend, "png", salida);
                    // Mensaje de dialogo tipo informacion
                    JOptionPane.showMessageDialog(this,
                            "Se ha Guardado Con exito.",
                            "Guaradado Completo.", 
                            JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){}
            }
        }
        frmGuardar.setVisible(false);
    }//GEN-LAST:event_selecDirecActionPerformed

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        // TODO add your handling code here:
        lienzo.lapiz=0;
        lienzo.linea=0;
        lienzo.circulo=0;
        lienzo.rectangulo=1;
        lienzo.rectanguloRed=0;
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnRectanguloRedondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloRedondActionPerformed
        // TODO add your handling code here:
        lienzo.lapiz=0;
        lienzo.linea=0;
        lienzo.circulo=0;
        lienzo.rectangulo=0;
        lienzo.rectanguloRed=1;

      
    }//GEN-LAST:event_btnRectanguloRedondActionPerformed

    private void InformaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformaciónActionPerformed
    JOptionPane.showMessageDialog(null, "Programa creado para fines ilustrativos\n"
            + " para presentación de Proyecto\n" +
            "del Curso de Programación Avanzada.",
            "Información", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_InformaciónActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
       frmGuardar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        
        BuscarDirec.setFileFilter(filter);
        int estado=BuscarDirec.showOpenDialog(null);
        File archivoelegido=BuscarDirec.getSelectedFile();
        String ruta=archivoelegido.getPath();
        
        if(estado==JFileChooser.APPROVE_OPTION);
            {
                ImageIcon imagen = new ImageIcon(ruta);
                JLabel etiqueta = new JLabel(imagen);
                etiqueta.setSize(350,350);  //Inserta la imagen (350x350)pixels
                lienzo.add(etiqueta);       //agrega la imagen al panelDibujo
                lienzo.repaint();           //Da opcion de volver a dibujar.
            }
              
    }//GEN-LAST:event_AbrirActionPerformed

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
  // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenu Archivo;
    private javax.swing.JToolBar BarraHerramientas;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JFileChooser BuscarDirec;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem Información;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnFondo;
    private javax.swing.JButton btnLapiz;
    private javax.swing.JButton btnLinea;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnRectanguloRedond;
    private javax.swing.JCheckBox chkRelleno;
    private javax.swing.JColorChooser colores;
    private javax.swing.JFrame frmAbrir;
    private javax.swing.JFrame frmColor;
    private javax.swing.JFrame frmGuardar;
    private javax.swing.JFileChooser selecDirec;
    // End of variables declaration//GEN-END:variables
    
}
