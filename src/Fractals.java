
import java.awt.*;

public class Fractals {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FractalWindow();
            }
        });
    }
}
