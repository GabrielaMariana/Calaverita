
package calaverita;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ventana extends JFrame {
    
public ventana(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("De mi para tu U3U");
    setSize(900, 506);
    setLocationRelativeTo(null);
    componentes();
}
private void componentes(){
    JPanel panel = new JPanel();
    panel.setLayout(null);
    //panel.setBackground(Color.CYAN);
    getContentPane().add(panel);
    
    JLabel titulo = new JLabel("LA CALACA JUNTO A JOVANA");
    titulo.setBounds(350, 10, 600, 80);
    titulo.setForeground(Color.WHITE);
    titulo.setFont(new Font("Baguet Script",1, 30));
    panel.add(titulo);
    
    JLabel linea1 = new JLabel("Enojada esta la calaca enana ");
    linea1.setBounds(100, 70, 600, 30);
    linea1.setForeground(Color.WHITE);
    linea1.setFont(new Font("HGMaruGothicMPRO",1, 25));
    panel.add(linea1);
    
    JLabel linea2 = new JLabel("Pues quería llevarse a Jovana");
    linea2.setBounds(200, 95, 600, 30);
    linea2.setForeground(Color.WHITE);
    linea2.setFont(new Font("HGMaruGothicMPRO",1, 25));
    panel.add(linea2);
    
    JLabel linea3 = new JLabel("Se hizo amiga de todos");
    linea3.setBounds(300, 120, 600, 30);
    linea3.setForeground(Color.WHITE);
    linea3.setFont(new Font("HGMaruGothicMPRO",1, 25));
    panel.add(linea3);
    
    JLabel linea4 = new JLabel("Andamos muy animados ");
    linea4.setBounds(400, 140, 600, 30);
    linea4.setForeground(Color.WHITE);
    linea4.setFont(new Font("HGMaruGothicMPRO",1, 25));
    panel.add(linea4);
    
    JButton boton = new JButton();
        boton.setText("Inicio");
        boton.setBounds(10, 20, 100, 30);
        boton.setMnemonic('j');
        boton.setFont(new Font("FreeSans", 0, 15));
        boton.setBackground(Color.PINK);
        boton.addActionListener((ActionEvent arg0) -> {
            Calaverita ca = new Calaverita();
            ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ca.setVisible(true);
            
            setVisible(false);
    });
        panel.add(boton);
    ImageIcon fes = new ImageIcon("fiesta.gif");
    JLabel fest = new JLabel(fes);
    fest.setBounds(250, 200, 400, 225);
    panel.add(fest);
    
    ImageIcon fon = new ImageIcon("fondoCalaberita.jpg");
    JLabel fondo = new JLabel(fon);
    fondo.setBounds(0, 0, 900, 506);
    panel.add(fondo);
   
    
    

}

   
}
