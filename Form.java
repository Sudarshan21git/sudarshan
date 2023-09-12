import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Form implements ActionListener{
    JFrame f;
    JLabel l, l1, l2,l3,l4,l5,l6;
    JTextField t1,t2,t3;
    JButton b1;
    JRadioButton rb1,rb2;
    JCheckBox cb1,cb2,cb3;
    JComboBox<String> cb;
    JTextArea t;







    public Form() {
        f = new JFrame("form");
        l = new JLabel("Student form");
        l1 = new JLabel("Roll");
        l2 = new JLabel("NAME");
        l3 = new JLabel("COLLEGE");
        l4=new JLabel("Gender");
        l5 =new JLabel("Hobbies");
        l6= new JLabel("program");
        t1 =new JTextField(20);
        t2 =new JTextField(20);
        t3 =new JTextField(20);
        rb1=new JRadioButton("male");
        rb2= new JRadioButton("female");
        ButtonGroup bg= new ButtonGroup();
        bg.add(rb1);bg.add(rb2);
        cb1= new JCheckBox("playing");
        cb2 = new JCheckBox("Reading");
        cb3= new JCheckBox("Swimming");
String[]name={"BCA","BSC.Csit","BICT"};
cb= new JComboBox(name);
b1 =new JButton("save");
t=new JTextArea();
f.setSize(600, 600);
f.setVisible(true);
f.setDefaultCloseOperation(3);
f.setLayout(null);
l.setBounds(200, 40, 200, 20);
l1.setBounds(20, 80, 100, 20);
t1.setBounds(100, 80, 150, 20);
l2.setBounds(20, 110, 100, 20);
t2.setBounds(100, 110, 150, 20);
l3.setBounds(20,140,150,20);
t3.setBounds(100, 140, 150, 20);
l4.setBounds(20, 170, 100, 20);
rb1.setBounds(100,170,100,20);
rb2.setBounds(200,170,100,20);
l5.setBounds(20, 200, 150, 20);
cb1.setBounds(100, 200, 150, 20);
cb2.setBounds(250, 200, 100, 20);
cb3.setBounds(350, 200, 100, 20);
l6.setBounds(20, 230, 100, 20);
cb.setBounds(100,230,100,20);
b1.setBounds(100, 300, 80, 20);
t.setBounds(350, 20, 200, 150);

f.add(l);f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);
f.add(t1);f.add(t2);f.add(t3);f.add(rb1);f.add(rb2);
f.add(cb1);f.add(cb2);f.add(cb3);f.add(t);
f.add(b1);f.add(cb);
b1.addActionListener(this);
   
    }
    public void actionPerformed(ActionEvent e){
        String r=t1.getText();
        String n=t2.getText();
        String c=t3.getText();
        String gender="";
        if(rb1.isSelected())
           gender="male";
         else
         gender="female";
         String Hobbies ="";
         if (cb1.isSelected())
         Hobbies+= " playing ";
         if (cb2.isSelected())
         Hobbies+= " reading ";
         
         if (cb3.isSelected())
         Hobbies+= " swimming "; 
         String program =cb.getItemAt(cb.getSelectedIndex());

         
         
        t.setText("Roll="+r +  System.lineSeparator() +"Name="+n +  System.lineSeparator() + "College=" + c  +  System.lineSeparator()  + "gender=" + gender   +  System.lineSeparator()+ "Hobies=" + Hobbies  +  System.lineSeparator() + "Program=" + program   );


    }


    public static void main(String args[]) {
        new Form();
    }
}
