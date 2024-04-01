package SomeProblem;

import javax.swing.*;

public class Demo {

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog(
                null,
                "username",
                "Log In : Username",
                JOptionPane.PLAIN_MESSAGE
        );
        //the password dialog shows the actual characters, can you
        //find the code to show
        String password = JOptionPane.showInputDialog(
                null,
                "password",
                "Log In : Password",
                JOptionPane.PLAIN_MESSAGE
        );

        if (username.isEmpty() || username.isBlank()) {
            JOptionPane.showInputDialog(
                    null,
                    "Username cannot be empty or blank!",
                    "Wrong username",
                    JOptionPane.PLAIN_MESSAGE
            );
        }

        if (password.isEmpty() || password.isBlank()) {
            JOptionPane.showInputDialog(
                    null,
                    "Password cannot be empty!",
                    "Wrong Password",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
    }
}
