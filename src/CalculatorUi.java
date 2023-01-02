import javax.swing.*;

public class CalculatorUi {
    private JPanel Calc;
    private JButton a0Button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button12;
    private JButton button13;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button1;
    private JTextField textField;
    private JButton ACButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorUi");
        frame.setContentPane(new CalculatorUi().Calc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
