package ejercicion83;


import ejercicion83.FiguraGeométrica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Pirámide extends FiguraGeométrica {
    private double base; 
    private double altura; 
    private double apotema; 
    public Pirámide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen()); 
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
        }
    
    public double calcularSuperficie() {
        double áreaBase = Math.pow(base, 2.0);
        double áreaLado = 2.0 * base * apotema;
        return áreaBase + áreaLado;
    }
}