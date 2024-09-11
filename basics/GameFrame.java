import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        // Initialize the frame
        this.setTitle("My game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Add the panel
        this.add(new GamePanel());

        // Pack the frame to fit the preferred size of its components
        this.pack();

        // Make the frame visible
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure Swing components are created on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new GameFrame());
    }
}

// Ensure GamePanel is defined; here's a simple placeholder
class GamePanel extends JPanel {
    public GamePanel() {
        // Initialize panel settings and components here
        this.setPreferredSize(new java.awt.Dimension(800, 600)); // Example preferred size
    }
}
