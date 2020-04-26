package schupharma.main;

import schupharma.views.Home;
import static java.awt.EventQueue.invokeLater;

public class Main {

    public static void main(String[] args) {
        invokeLater(() -> new Home().setVisible(true));
    }

}
