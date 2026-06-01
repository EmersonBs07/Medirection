package ApiVoz;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Acessibilidade {

    public static void adicionarLeitura(JComponent componente,String texto) {

        componente.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(
                    FocusEvent e) {

                assistenteVoz.falar(texto);
            }
        });

        componente.addMouseListener(
                new MouseAdapter() {

            @Override
            public void mouseEntered(
                    MouseEvent e) {

                assistenteVoz.falar(texto);
            }
        });
    }
}
