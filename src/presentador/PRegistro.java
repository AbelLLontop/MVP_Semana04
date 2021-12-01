package presentador;

import java.util.ArrayList;
import modelo.MRegistro;
import modelo.Nota;
import vista.VRegistro;

/*@author ABEL*/
public class PRegistro {
    private VRegistro v_registro;
    private MRegistro m_registro;
    
    public PRegistro(VRegistro v_registro){
        this.v_registro = v_registro;
        this.m_registro = new MRegistro();
    }
    
    public void agregar(){
       obtenerDatos();       
       hacerCalculos();
       actualizarVista();     
    }
    public void quitar(){
        m_registro.quitarNota(v_registro.getCodeActualTableSeleccionada());
        hacerCalculos();
        actualizarVista();
    }
    private void obtenerDatos(){
        Nota nota = new Nota();
        nota.setCodigoAlumno(v_registro.getIngresoCodigo());
        nota.setNombreAlumno(v_registro.getIngresoNombre());
        nota.setNota(v_registro.getIngresoNota());
        nota.calcularCondicion();
        m_registro.agregarNota(nota);        
    }
    public void actualizarVista(){
        String[] cabecera = {"Codigo","Nombre","Nota","Condición"};
        Object[][] contenido = formatoTable(cabecera,m_registro.getNotas());    
        v_registro.showAllNotas(cabecera, contenido);
    }
    
    public Object[][] formatoTable(String[] cabecera,ArrayList<Nota> notas){
        Object[][] contenido = new Object[notas.size()][cabecera.length];
        int cont = 0;
        for(Nota nota : notas){
            contenido[cont][0] = nota.getCodigoAlumno();
            contenido[cont][1] = nota.getNombreAlumno();
            contenido[cont][2] = nota.getNota();
            contenido[cont][3] = nota.getCondicion();     
            cont++;
        }
        
        return contenido;
    }
    
   
    private void hacerCalculos(){
        Nota bestAlumno = m_registro.calcularBestAlumno();      
        m_registro.calcularPromedioTotal();       
        v_registro.showPromedioCurso(m_registro.getPromedioTotal());
        v_registro.showSalidaBestAlumno(bestAlumno.getNombreAlumno(),bestAlumno.getNota());
    }
    
   
    
}
