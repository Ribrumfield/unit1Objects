
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL ( "http://images.clipartpanda.com/stick-clipart-pT58qxETB.png");
        //http://horstmann.com/java4everyone/duke.gif
        JOptionPane.showMessageDialog(null, "Good day","Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}