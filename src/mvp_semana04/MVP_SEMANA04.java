package mvp_semana04;

import presentador.PRegistro;
import vista.VRegistro;
import vista.VRegistro_Console;
import vista.VRegistro_Swing;

/*@author ABEL*/
public class MVP_SEMANA04 {
    public static void main(String[] args) {
        //VRegistro ivRegistro = new VRegistro_Swing();
        VRegistro ivRegistro = new VRegistro_Console();
        PRegistro presentador = new PRegistro(ivRegistro);
        ivRegistro.setPresentador(presentador);
        ivRegistro.iniciar();
    }

}
