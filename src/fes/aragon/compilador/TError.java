/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.compilador;

/**
 *
 * @author eca28
 */
public class TError {
    String Lexema;
    int line,columna;
    String tipo,descripcion;

    public TError() {
    }

    public TError(String Lexema, int line, int columna, String tipo, String descripcion) {
        this.Lexema = Lexema;
        this.line = line;
        this.columna = columna;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    
}
