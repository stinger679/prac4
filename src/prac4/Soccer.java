package prac4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Soccer extends JFrame {
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lb1 = new JLabel("Result:"+" 0 X 0");
    JLabel lb2 = new JLabel("Last Scorer: N/A");
    Label lab3 = new Label("Winner: DRAW");
    int MilanResult = 0, MadridResult = 0;
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Font fnt2 = new Font("Times new roman",Font.BOLD,16);
    public Soccer() {
        super("Soccer");
        setSize(400, 200);
        add (but1, BorderLayout.WEST);
        but1.setFont(fnt2);
        add(but2, BorderLayout.EAST);
        but2.setFont(fnt2);
        add(lb1, BorderLayout.CENTER);
        lb1.setFont(fnt);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        add(lb2, BorderLayout.NORTH);
        lb2.setFont(fnt);
        lb2.setHorizontalAlignment(SwingConstants.CENTER);
        add(lab3, BorderLayout.SOUTH);
        lab3.setFont(fnt);
        but1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MilanResult++;
                lb1.setText("Result: "+MilanResult+" X "+MadridResult);
                lb2.setText("Last Scorer: AC Milan");
                if (MilanResult>MadridResult)
                    lab3.setText("Winner: AC Milan");
                else
                if (MilanResult==MadridResult)
                    lab3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MadridResult++;
                lb1.setText("Result: "+MilanResult+" X "+MadridResult);
                lb2.setText("Last Scorer: Real Madrid");
                if (MadridResult>MilanResult)
                    lab3.setText("Winner: Real Madrid");
                else
                if (MilanResult==MadridResult)
                    lab3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        new Soccer().setVisible(true);
    }
}