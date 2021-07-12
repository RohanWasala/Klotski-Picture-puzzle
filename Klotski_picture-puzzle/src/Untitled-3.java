import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class main3 {
  public static void main(String arg[]) {
    new picpuzzle3();
  }
}
class picpuzzle3 extends JFrame implements ActionListener, mertix {
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, sample, starB;
  Icon star;
  Icon samicon1 = new ImageIcon("pic/main.jpg");

  picpuzzle3() {
    super("picture puzzle");
    mertix.super.perpare();
    Icon ic0 = new ImageIcon("pic/" + ma[2][2] + ".jpg");
    Icon ic1 = new ImageIcon("pic/" + ma[0][0] + ".jpg");
    Icon ic2 = new ImageIcon("pic/" + ma[0][1] + ".jpg");
    Icon ic3 = new ImageIcon("pic/" + ma[0][2] + ".jpg");
    Icon ic4 = new ImageIcon("pic/" + ma[1][0] + ".jpg");
    Icon ic5 = new ImageIcon("pic/" + ma[1][1] + ".jpg");
    Icon ic6 = new ImageIcon("pic/" + ma[1][2] + ".jpg");
    Icon ic7 = new ImageIcon("pic/" + ma[2][0] + ".jpg");
    Icon ic8 = new ImageIcon("pic/" + ma[2][1] + ".jpg");
    Icon ic9 = new ImageIcon("pic/" + ma[2][2] + ".jpg");

    b1 = new JButton(ic1);
    b1.setBounds(10, 80, 100, 100);
    b2 = new JButton(ic2);
    b2.setBounds(110, 80, 100, 100);
    b3 = new JButton(ic3);
    b3.setBounds(210, 80, 100, 100);
    b4 = new JButton(ic4);
    b4.setBounds(10, 180, 100, 100);
    b5 = new JButton(ic5);
    b5.setBounds(110, 180, 100, 100);
    b6 = new JButton(ic6);
    b6.setBounds(210, 180, 100, 100);
    b7 = new JButton(ic7);
    b7.setBounds(10, 280, 100, 100);
    b8 = new JButton(ic8);
    b8.setBounds(110, 280, 100, 100);
    b9 = new JButton(ic9);
    b9.setBounds(210, 280, 100, 100);
    sample = new JButton(samicon1);
    sample.setBounds(380, 100, 200, 200);

    JLabel l1 = new JLabel("Sample:");
    l1.setBounds(330, 200, 70, 20);
    JLabel l2 = new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
    l2.setBounds(5, 15, 500, 20);
    JLabel l3 = new JLabel("click sample picture to next puzzle");
    l3.setBounds(380, 320, 200, 20);
    l3.setForeground(Color.red);

    starB = new JButton(ic0);
    starB.setBounds(330, 5, 50, 50);
    star = b9.getIcon();

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(sample);
    add(l1);
    add(l2);
    add(starB);
    add(l3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
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
      } else if (b4.getIcon() == star) {
        b4.setIcon(s1);
        b1.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b2) {
      Icon s1 = b2.getIcon();
      if (b1.getIcon() == star) {
        b1.setIcon(s1);
        b2.setIcon(star);
      } else if (b5.getIcon() == star) {
        b5.setIcon(s1);
        b2.setIcon(star);
      } else if (b3.getIcon() == star) {
        b3.setIcon(s1);
        b2.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b3) {
      Icon s1 = b3.getIcon();
      if (b2.getIcon() == star) {
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if (b6.getIcon() == star) {
        b6.setIcon(s1);
        b3.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b4) {
      Icon s1 = b4.getIcon();
      if (b1.getIcon() == star) {
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if (b5.getIcon() == star) {
        b5.setIcon(s1);
        b4.setIcon(star);
      } else if (b7.getIcon() == star) {
        b7.setIcon(s1);
        b4.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b5) {
      Icon s1 = b5.getIcon();
      if (b2.getIcon() == star) {
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if (b4.getIcon() == star) {
        b4.setIcon(s1);
        b5.setIcon(star);
      } else if (b6.getIcon() == star) {
        b6.setIcon(s1);
        b5.setIcon(star);
      } else if (b8.getIcon() == star) {
        b8.setIcon(s1);
        b5.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b6) {
      Icon s1 = b6.getIcon();
      if (b3.getIcon() == star) {
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if (b5.getIcon() == star) {
        b5.setIcon(s1);
        b6.setIcon(star);
      } else if (b9.getIcon() == star) {
        b9.setIcon(s1);
        b6.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b7) {
      Icon s1 = b7.getIcon();
      if (b4.getIcon() == star) {
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if (b8.getIcon() == star) {
        b8.setIcon(s1);
        b7.setIcon(star);
      }
    } // end of if

    if (e.getSource() == b8) {
      Icon s1 = b8.getIcon();
      if (b7.getIcon() == star) {
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if (b5.getIcon() == star) {
        b5.setIcon(s1);
        b8.setIcon(star);
      } else if (b9.getIcon() == star) {
        b9.setIcon(s1);
        b8.setIcon(star);
      }

    } // end of if

    if (e.getSource() == b9) {
      Icon s1 = b9.getIcon();
      if (b8.getIcon() == star) {
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if (b6.getIcon() == star) {
        b6.setIcon(s1);
        b9.setIcon(star);
      }
    } // end of if
  }
}



