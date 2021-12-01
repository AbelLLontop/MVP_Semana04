/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import presentador.PRegistro;

/**
 *
 * @author John
 */
public class VRegistro_Console implements VRegistro {

    private PRegistro p_registro;

    @Override
    public void setPresentador(PRegistro p_registro) {
        this.p_registro = p_registro;
    }

    @Override
    public void iniciar() {
        Scanner in = new Scanner(System.in);

        boolean valido = false;

        do {
            System.out.println("1.Agregar");
            System.out.println("2.Quitar");
            System.out.println("s.Salir");           

            String opcion = in.nextLine();
            System.out.println("Opcion: "+opcion);

            if (opcion.equals("1")) {
                p_registro.agregar();
            } else if (opcion.equals("2")) {
                p_registro.quitar();
            
            } else if (opcion.equals("s")) {
                valido = true;
            } else {
                System.out.println("La opcion no es correcta, intentelo denuevo");
            }

        } while (!valido);

    }

    @Override
    public String getIngresoCodigo() {
        Validacion validacion = new Validacion();
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese Codigo:");
        String codigo = validacion.inCodigo(lee.next());
        if (!validacion.estadoValidacionDatos()) {
            mostrarMensaje(validacion.getMensaje());
        }
        return codigo;

    }

    @Override
    public String getIngresoNombre() {
        Validacion validacion = new Validacion();

        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese Nombre:");
        String nombre = validacion.inNombre(lee.next());
        if (!validacion.estadoValidacionDatos()) {
            mostrarMensaje(validacion.getMensaje());
        }
        return nombre;

    }

    @Override
    public double getIngresoNota() {
        Validacion validacion = new Validacion();
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese Nota:");
        Double nota = validacion.inDouble(lee.next());
        if (!validacion.estadoValidacionDatos()) {
            mostrarMensaje(validacion.getMensaje());
        }
        return nota;

    }

    @Override
    public String getCodeActualTableSeleccionada() {
        Validacion validacion = new Validacion();
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese Nota:");

        String codigo = validacion.inRegistro(lee.next());
        mostrarMensaje(validacion.getMensaje());

        return codigo;

    }

    @Override
    public void showSalidaBestAlumno(String nombre, double nota) {
        System.out.println("Nombre " + "Nota");
        System.out.println(nombre + "  " + nota);

    }

    @Override
    public void showPromedioCurso(double promedio) {
        System.out.println("El promedio Total es: " + promedio);
    }

    @Override
    public void showAllNotas(String[] cabecera, Object[][] contenido) {
        
        System.out.println("TAbla");
         System.out.format("%15s%15s%15s%15s\n",cabecera);
       
        for (Object[] row : contenido) {
            System.out.format("%15s%15s%15s%15s\n", row);
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
