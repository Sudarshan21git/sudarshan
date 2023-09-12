import javax.swing.*;
import java.awt.*;

public class Menubar {
    JFrame f; // Declare the JFrame variable

    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1, i2, i3;

    public Menubar() {
        f = new JFrame("menu example"); // Initialize the JFrame

        mb = new JMenuBar();
        m1 = new JMenu("file");
        m2 = new JMenu("edit");
        i1 = new JMenuItem("open");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("SELECT");

        f.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        m1.add(i1);
        m1.add(i2);
        m2.add(i3);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected the exit operation
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new Menubar();
    }
}
