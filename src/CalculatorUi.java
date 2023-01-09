
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUi {
    private JPanel Calc;
    private JButton a0Button;
    private JButton commaBtn;
    private JButton plusBtn;
    private JButton equalBtn;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiplyBtn;
    private JButton minusBtn;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divideBtn;
    private JTextField calcField;
    private JButton clearBtn;
    private JButton backspaceBtn;

    private double num1 = 0;
     private double num2 = 0;
    private String operation = "";
    private String currentNumber = "";
    private double currentResult = 0;

    public void selectedOperation(double num1,double num2, String operation) {
        switch (operation) {
            case "+":
                currentResult = num1 + num2;
                break;
            case "-":
                currentResult = num1 - num2;
                break;
            case "*":
                currentResult = num1 * num2;
                break;
            case "/":
                currentResult = num1 / num2;
                break;
            default:

                break;
         }
    }






    public CalculatorUi() {

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentResult = 0;
                calcField.setText("");
            }
        });
        backspaceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // controls if currentNumber is empty then delete one if not
                if (currentNumber.equals("")) {
                    return;
                }
                currentNumber = currentNumber.substring(0, currentNumber.length() - 1);

                calcField.setText(currentNumber);
            }
        });
        equalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num2 = Double.parseDouble(currentNumber);
                currentNumber = "";
                selectedOperation(num1, num2, operation); // check which operato *+-/ and numbers

               // begränsar antal decimaltal som visas
                if (String.valueOf(currentResult).length() > 10) {
                    String formattedResult = String.format("%.9f", currentResult);
                    currentResult = Double.parseDouble(formattedResult);
                }
                calcField.setText(String.valueOf(currentResult)); // check value of
            }
        });


            a0Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentNumber += "0";
                    calcField.setText(currentNumber);
                }
            });
            a1Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentNumber += "1";
                    calcField.setText(currentNumber);
                }
            });
            a2Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentNumber += "2";
                    calcField.setText(currentNumber);

                }
            });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "3";
                calcField.setText(currentNumber);

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "4";
                calcField.setText(currentNumber);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "5";
                calcField.setText(currentNumber);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "6";
                calcField.setText(currentNumber);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "7";
                calcField.setText(currentNumber);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "8";
                calcField.setText(currentNumber);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += "9";
                calcField.setText(currentNumber);
            }
        });

        plusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentNumber);
                currentNumber = "";
                calcField.setText("+");
                operation = "+";
            }
        });

        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentNumber);
                currentNumber = "";
                calcField.setText("-");
                operation = "-";
            }
        });

        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentNumber);
                currentNumber = "";
                calcField.setText("*");// shows in disply for clarity
                operation = "*";
            }
        });

        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentNumber);
                currentNumber = "";
                calcField.setText("/");
                operation = "/";
            }
        });

       // missing function to calculate with parse
        commaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += ",";
                calcField.setText( currentNumber);
            }
        });
    }





    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorUi");
        frame.setContentPane(new CalculatorUi().Calc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }

}



// This Calculator  is a simple program with a graphical user interface (GUI),
// and uses Java Swing bibliotek to create the GUI components and handle user input.
// The user can enter two numbers and an operation (+, -, *, or /) in the text fields,
//and click the "equal" button to perform the operation and display the result.
// The result is displayed in the display.
// still missing function to calculate with comma
