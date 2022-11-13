
package calaverita;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calaverita extends JFrame{


    public Calaverita(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Una calaverita para jovana UwU");
    setSize(580, 600);
    setLocationRelativeTo(null);
    componentes();
}
private void componentes(){
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.PINK);
    getContentPane().add(panel);
    
    JLabel bienvenida = new JLabel("BIENVENIDOS");
    bienvenida.setBounds(150, 30, 250, 50);
    bienvenida.setFont(new Font("Baguet Script",2, 30));
    panel.add(bienvenida);
    
    /*JLabel indic = new JLabel("para acceder a la calaberita oprima el siguiente boton");
    indic.setBounds(100, 80, 350, 20);
    indic.setFont(new Font("arial",2, 15));
    panel.add(indic);*/
    
    JButton boton = new JButton();
        boton.setText("pulsa aqui");
        boton.setBounds(80,500, 150, 20);
        boton.setMnemonic('j');// atl+j = enter 
        boton.setForeground(Color.MAGENTA);
        boton.setFont(new Font("Aldhabi", 1, 15));
        boton.setBackground(Color.cyan);
        boton.addActionListener((ActionEvent arg0) -> {
            ventana v = new ventana();
            v.setVisible(true);
            setVisible(false);
    });
        panel.add(boton);
        
ImageIcon cat = new ImageIcon("la_catrina.jpg");
    JLabel na = new JLabel(cat);
    na.setBounds(80, 120, 400, 400);
    na.setIcon(new ImageIcon(cat.getImage().getScaledInstance(na.getWidth(), na.getHeight(), Image.SCALE_SMOOTH)));
    panel.add(na);
}

 public static void main(String[] args) {
    Calaverita j = new Calaverita();
    j.setVisible(true);
    }
  /*ventana vi = new ventana();
    vi.setVisible(true);
    }*/
}
