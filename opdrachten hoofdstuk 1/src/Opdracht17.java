import javax.swing.*;
import java.net.*;

public class Opdracht17 {
    public static void main(String[] args) throws Exception{
        URL imageLocation = new URL(
                "http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null,"Hello", "Avocado",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
