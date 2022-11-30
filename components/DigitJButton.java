package lesson_8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJButton extends JButton {
    public DigitJButton(String text) {
        super(text);
        setFont(new Font("TimesNewRoman", Font.PLAIN, 25));
        setBackground(new Color(0x7D7D9E));
    }
}
