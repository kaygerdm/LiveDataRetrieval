
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author kayger
 */
public class NFLGUI extends JFrame implements ActionListener {

    //private instance variables
    //frame
    JFrame frame;

    //panels
    JPanel jp;
    JPanel jpLeft;
    JPanel jpRight;
    JPanel top;
    JPanel bottom;
    JPanel center1;
    JPanel center2;

    //text areas
    JTextArea playByPlay;
    JTextArea schedual;
    JTextArea weekSchedual;
    JTextArea gameBox;
    JTextArea teamStats;
    JTextArea playerProfile;

    //JButton
    JButton NE; //button for each team in NFL

    public void display() {
        frame = new JFrame();
        frame.setSize(450,550);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout (0,3));
        //add panel and components in order
        
        //left panel
        jpLeft = new JPanel();
        playByPlay = new JTextArea();
        jpLeft.add(playByPlay);
        frame.add(jpLeft);
        //right panel
        jpRight = new JPanel();
        jpRight.setLayout(new GridLayout());
        NE = new JButton(); //create one for each team in grid layout
        jpRight.add(NE);
        frame.add(jpRight);
        //top panel
        top = new JPanel();
        schedual = new JTextArea();
        top.add(schedual);
        frame.add(top);
        //bottom panel
        bottom = new JPanel();
        weekSchedual = new JTextArea();
        bottom.add(weekSchedual);
        frame.add(bottom);
        //top center panel
        center1 = new JPanel();
        gameBox = new JTextArea();
        center1.add(gameBox);
        frame.add(gameBox);
        //bottom center panel
        center2 = new JPanel();
        center2. setLayout(new GridLayout(0,2));
        teamStats = new JTextArea();
        center2.add(teamStats);
        playerProfile = new JTextArea();
        center2.add(playerProfile);
        frame.add(center2);
        
        frame.setVisible(true);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
