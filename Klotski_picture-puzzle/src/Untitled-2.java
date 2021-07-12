import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class main2 {
  public static void main(String arg[]) {
    new picpuzzle2();
  }
}
class picpuzzle2 extends JFrame implements ActionListener, mertix {
    JButton b1, b2, b3, b4, sample, starB;
    Icon star;
    Icon samicon1 = new ImageIcon("pic2/main4.jpg");
  
    picpuzzle2() {
      super("picture puzzle");
      mertix.super.perpare();
      Icon ic0 = new ImageIcon("pic2/" + ma[1][1] + ".jpg");
      Icon ic1 = new ImageIcon("pic2/" + ma[0][0] + ".jpg");
      Icon ic2 = new ImageIcon("pic2/" + ma[0][1] + ".jpg");
      Icon ic3 = new ImageIcon("pic2/" + ma[1][0] + ".jpg");
      Icon ic4 = new ImageIcon("pic2/" + ma[1][1] + ".jpg");
  
      b1 = new JButton(ic1);
      b1.setBounds(20, 160, 150, 150);
      b2 = new JButton(ic2);
      b2.setBounds(170, 160, 150, 150);
      b3 = new JButton(ic3);
      b3.setBounds(20, 310, 150, 150);
      b4 = new JButton(ic4);
      b4.setBounds(170, 310, 150, 150);
      sample = new JButton(samicon1);
      sample.setBounds(700, 250, 250, 250);
  
      JLabel l1 = new JLabel("Sample:");
      l1.setBounds(560, 350, 140, 40);
      JLabel l2 = new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
      l2.setBounds(5, 15, 500, 20);
      JLabel l3 = new JLabel("click sample picture to next puzzle");
      l3.setBounds(700, 140, 200, 20);
      l3.setForeground(Color.red);
  
      starB = new JButton(ic0);
      starB.setBounds(330, 5, 50, 50);
      star = b4.getIcon();
  
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      ;
      add(sample);
      add(l1);
      add(l2);
      add(starB);
      add(l3);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      sample.addActionListener(this);
      setLayout(null);
      setSize(600, 500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == b1) {
        Icon s1 = b1.getIcon();
        if (b2.getIcon() == star) {
          b2.setIcon(s1);
          b1.setIcon(star);
        } else if (b3.getIcon() == star) {
          b3.setIcon(s1);
          b1.setIcon(star);
        }
      } // end of if
  
      if (e.getSource() == b2) {
        Icon s1 = b2.getIcon();
        if (b1.getIcon() == star) {
          b1.setIcon(s1);
          b2.setIcon(star);
        } else if (b4.getIcon() == star) {
          b4.setIcon(s1);
          b2.setIcon(star);
        }
      } // end of if
  
      if (e.getSource() == b3) {
        Icon s1 = b3.getIcon();
        if (b1.getIcon() == star) {
          b1.setIcon(s1);
          b3.setIcon(star);
        } else if (b4.getIcon() == star) {
          b4.setIcon(s1);
          b3.setIcon(star);
        }
      } // end of if
  
      if (e.getSource() == b4) {
        Icon s1 = b4.getIcon();
        if (b2.getIcon() == star) {
          b2.setIcon(s1);
          b4.setIcon(star);
        } else if (b3.getIcon() == star) {
          b3.setIcon(s1);
          b4.setIcon(star);
        }
      } // end of if
    }
  }