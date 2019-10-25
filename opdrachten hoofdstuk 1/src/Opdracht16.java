import javax.swing.*;

public class Opdracht16 {
    public static void main (String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Sorry " + name + " I can't do that!");
    }
}
