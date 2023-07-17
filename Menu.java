package Package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JLabel welcomeLabel;
    private JButton playButton;

    public Menu() {
        super("Menu");

        // Create welcome label
        welcomeLabel = new JLabel("Welcome to the game!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create play button
        playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Switch to the playground
                setVisible(false);
                new PlayGround();
            }
        });

        // Add components to the content pane
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(welcomeLabel, BorderLayout.NORTH);
        contentPane.add(playButton, BorderLayout.SOUTH);
        setContentPane(contentPane);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
