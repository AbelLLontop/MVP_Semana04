package modelo;
/*@author ABEL*/
public class Nota {
    private String nombreAlumno;
    private String codigoAlumno;
    private double nota;
    private String condicion;

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCondicion() {
        return condicion;
    }

    public void calcularCondicion(){
           condicionarRango(0,5,"Pésimo");
           condicionarRango(6,10,"Malo");
           condicionarRango(11,15,"Bueno");
           condicionarRango(16,20,"Excelente");   
    }

    
    private void condicionarRango(int min,int max,String mensaje){
        if((nota<=min && nota<=max)){
            condicion= mensaje;
        }     
    }

    
   
}
