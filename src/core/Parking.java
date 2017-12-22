package core;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Parking implements Observer {
    private JPanel panel1;
    private JLabel slot1;
    private JLabel slot2;
    private JLabel slot3;
    private JLabel slot4;
    private JLabel slot5;

    public Parking() {
        JFrame frame = new JFrame("Parking Sensors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel1);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ChannelF1)
        {
            String[] results = o.toString().split("-");
            int id = Integer.parseInt(results[0]);

            switch (id) {
                case 1 :
                    slot1.setText(results[1]);
                    break;
                case 2 :
                    slot2.setText(results[1]);
                    break;
                case 3 :
                    slot3.setText(results[1]);
                    break;
                case 4 :
                    slot4.setText(results[1]);
                    break;
                case 5 :
                    slot5.setText(results[1]);
                    break;
                default:
                    break;
            }
        }
    }
}
