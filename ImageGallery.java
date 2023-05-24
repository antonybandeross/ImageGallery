import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ImageGallery {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Gallery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(panel);
        
        File imagesDirectory = new File("path/to/images/directory");
        File[] imageFiles = imagesDirectory.listFiles();
        
        for (File imageFile : imageFiles) {
            ImageIcon imageIcon = new ImageIcon(imageFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            
            JLabel imageLabel = new JLabel(imageIcon);
            panel.add(imageLabel);
        }
        
        frame.add(scrollPane);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
