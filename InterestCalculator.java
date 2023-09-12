import javax.swing.*;
import java.awt.event.*;
public class InterestCalculator implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    
    public InterestCalculator()
    {
        f=new JFrame("Interest Calculator");
        l1=new JLabel("Principle:");
        l2=new JLabel("Rate:");
        l3=new JLabel("Time:");
        l4=new JLabel("Simple Interest:");
        t1=new JTextField(25);
        t2=new JTextField(25);
        b1=new JButton("Calculate");
        t3=new JTextField(25);
        t4=new JTextField(25);
        

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(b1);
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        
        l1.setBounds(20, 20, 100, 20);
        t1.setBounds(120, 20, 100, 20);
        l2.setBounds(20, 50, 100, 20);
        t2.setBounds(120, 50, 100, 20);
        l3.setBounds(20, 80, 100, 20);
        t3.setBounds(120, 80, 100, 20);
        b1.setBounds(120, 110, 100, 20);
        l4.setBounds(20, 140, 100, 20);
        t4.setBounds(120, 140, 100, 20);
       
        b1.addActionListener(this);

    }
      public void actionPerformed(ActionEvent e)
      {
        int n1=Integer.parseInt(t1.getText());
         int n2=Integer.parseInt(t2.getText());
          int n3=Integer.parseInt(t3.getText());
          int si=(n1*n2*n3)/100;
          t4.setText(" "+si);
      }
    public static void main(String[] args)
    {
        new InterestCalculator();
    }
}