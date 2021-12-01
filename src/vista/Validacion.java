package vista;

/*@author ABEL*/
public class Validacion {

    private String mensaje = "";

    public double inDouble(String nota) {
        try {
            double notaValida = Double.parseDouble(nota);
            if(notaValida>20){
                mostrarError("Error la nota no debe exceder los 20");
                return -1;
            }
            
            return notaValida;
            

        } catch (Exception e) {
            mostrarError("Error de formato en la nota");
                               
        }
        return -1;
    }

    public String inNombre(String nombre) {
        if (nombre.equals("")) {
            mostrarError("El campo nombre no debe estar vacio");
            return "";
        }
        return nombre;
    }

    public String inCodigo(String codigo) {
        if (codigo.equals("")) {
            mostrarError("El campo codigo no debe estar vacio");
            return "";
        }
        return codigo;
    }
    
    public String inRegistro(String registro) {
        if (registro.equals("")) {
            mostrarError("Debe seleccionar un registro");
            return "";
        }
        return registro;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void mostrarError(String mensajesValidacion) {
        this.setMensaje("Error: " + mensajesValidacion);
    }

    public boolean estadoValidacionDatos() {
        return mensaje.equals("");
    }
}
