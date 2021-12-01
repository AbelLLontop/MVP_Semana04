package vista;

import presentador.PRegistro;

/*@author ABEL*/
public interface VRegistro {
    public void setPresentador(PRegistro p_registro);
    public String getIngresoCodigo();
    public String getIngresoNombre();
    public double getIngresoNota();
    public String getCodeActualTableSeleccionada();
    public void showSalidaBestAlumno(String nombre, double nota);
    public void showPromedioCurso(double promedio);
    public void showAllNotas(String[] cabecera, Object[][] contenido);
    public void iniciar();
}
