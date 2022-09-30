import javax.swing.*;

public class Galerie {
    JFrame frame = new JFrame("G");

     Ooooo onion = new Ooooo(this);




    public void doid() {
        galeluj();
    }

    public void galeluj() {
        frame.setSize(800, 638);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setContentPane(onion);
        frame.setResizable(false);

        onion.setBounds(0, 20, 800, 600);
        onion.setVisible(true);

        frame.setVisible(true);
    }



}