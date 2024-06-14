package tetris;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {

    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginScreen() {
    
        setTitle("Tela de Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        JPanel panel = new JPanel();
        panel.setLayout(null);


        JLabel userLabel = new JLabel("Nome de Utilizador:");
        userLabel.setBounds(10, 20, 120, 25);
        panel.add(userLabel);

        userTextField = new JTextField(20);
        userTextField.setBounds(150, 20, 165, 25);
        panel.add(userTextField);


        JLabel passwordLabel = new JLabel("Palavra-passe:");
        passwordLabel.setBounds(10, 60, 120, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 60, 165, 25);
        panel.add(passwordField);

  
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 100, 80, 25);
        panel.add(loginButton);


        messageLabel = new JLabel("");
        messageLabel.setBounds(10, 130, 300, 25);
        panel.add(messageLabel);

       
        add(panel);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                char[] password = passwordField.getPassword();

                if (username.equals("Douglas") && String.valueOf(password).equals("1234")) {
                    
                    dispose();
                    
                } else {
                    messageLabel.setText("Nome de utilizador ou palavra-passe incorretos.");
                }
            }
        });
    }
}