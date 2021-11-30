package modelo;

import java.util.ArrayList;


/*@author ABEL*/
public class MRegistro {

    private ArrayList<Nota> notas = new ArrayList<Nota>();

    private double promedioTotal;

    public void calcularPromedioTotal() {
        int sizeNotas = notas.size();
        if (sizeNotas > 0) {
            int acumulador = 0;
            for (Nota nota : notas) {
                acumulador += nota.getNota();
            }
            promedioTotal = acumulador / sizeNotas;
        } else {
            promedioTotal = 0;
        }

    }

    public Nota calcularBestAlumno() {
        if (notas.size() > 0) {
            Nota bestAlumno = notas.get(0);
            for (Nota nota : notas) {
                if (nota.getNota() > bestAlumno.getNota()) {
                    bestAlumno = nota;
                }
            }
            return bestAlumno;
        } else {
            return null;
        }

    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public void quitarNota(String codigo) {
        Nota nota  = buscarPorCodigo(codigo);
        notas.remove(nota);
    }

    private Nota buscarPorCodigo(String codigo) {
        for (Nota nota : notas) {
            if (nota.getCodigoAlumno().equals(codigo)) {
                return nota;
            }
        }
        System.out.println("No se encontro el usuario de codigo: "+codigo);
        return null;
    }

    public double getPromedioTotal() {
        return promedioTotal;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }
    
    

}
