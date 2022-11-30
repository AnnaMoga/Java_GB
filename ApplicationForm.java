package lesson_8;

import lesson_8.components.DigitJButton;
import lesson_8.components.OperatorJButton;
import lesson_8.listeners.ButtonListener;
import lesson_8.listeners.ClearFieldButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {


    private JTextField inputField;

    public ApplicationForm(String title) {
        super(title);

        setBounds(1000, 300, 250, 370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setLayout(new BorderLayout());
        add(createTopPanel(), BorderLayout.NORTH);
        setJMenuBar(createMenu());
        add(createCenterPanel(), BorderLayout.CENTER);


       // add(new Button("Кнопка"), BorderLayout.WEST);

        setVisible(true);
    }


    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        menuFile.add(clear);
        menuFile.add(new JMenuItem("Edit"));
        menuBar.add(menuFile);


        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));
        JMenuItem exit = new JMenuItem("Exit");
/*        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });*/

        exit.addActionListener(e -> System.exit(0));

        menuBar.add(exit);

        return menuBar;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);
        centerPanel.add(CreateDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(CreateOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel CreateOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton multiply = new OperatorJButton("*");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton delete = new OperatorJButton("/");
        delete.addActionListener(buttonListener);
        panel.add(delete);
        return panel;
    }

    private JPanel CreateDigitsPanel(ActionListener buttonListener) {
        JPanel digitalPanel = new JPanel();

        digitalPanel.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
            btn.addActionListener(buttonListener);

            digitalPanel.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        calc.addActionListener(buttonListener);
        digitalPanel.add(calc);
        calc.setEnabled(true);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        digitalPanel.add(clear);

        return digitalPanel;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8, 0, 8, 0));
        inputField.setBackground(new Color(0xE4E4EE));

      //  inputField.setText("(1 + 2) / 3 = 12");

        return top;
    }
}
