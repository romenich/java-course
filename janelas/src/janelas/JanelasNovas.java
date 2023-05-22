package janelas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JanelasNovas {

    private JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    JanelasNovas window = new JanelasNovas();
                    window.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public JanelasNovas() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void show() {
        frame.setVisible(true);
    }
}
