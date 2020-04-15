package layout;

import javax.swing.JFrame;
import views.adicionarProduto;

public class Janela extends JFrame {
    public Janela(){
        add(new adicionarProduto());
        setSize(280, 400);
        show();
    }
}
