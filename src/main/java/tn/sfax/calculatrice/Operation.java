package tn.sfax.calculatrice;

public class Operation {
    private String operation;
    private double nombre1;
    private double nombre2;
    private double resultat;

    // Constructeur vide nécessaire à la sérialisation JSON
    public Operation() {
    }

    public Operation(String operation, double nombre1,
                     double nombre2, double resultat) {
        this.operation = operation;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.resultat = resultat;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getNombre1() {
        return nombre1;
    }

    public void setNombre1(double nombre1) {
        this.nombre1 = nombre1;
    }

    public double getNombre2() {
        return nombre2;
    }

    public void setNombre2(double nombre2) {
        this.nombre2 = nombre2;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
}