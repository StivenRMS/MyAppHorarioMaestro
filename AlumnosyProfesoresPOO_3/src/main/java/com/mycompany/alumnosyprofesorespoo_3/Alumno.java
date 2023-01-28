package com.mycompany.alumnosyprofesorespoo_3;

public class Alumno extends Persona {

    private int nota;

    public Alumno() {
        super();
        nota = MetodosSueltos.generarNumeroAleatorio(0, 10);

        super.setEdad(MetodosSueltos.generarNumeroAleatorio(12, 15));

    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void disponibilidad() {
        int prob = MetodosSueltos.generarNumeroAleatorio(0, 100);

        if (prob < 50) {
            super.setAsistencia(false);

        } else {
            super.setAsistencia(true);
        }

    }

    public String toString() {
        return "Nombre: " + super.getNombre() + ", sexo: " + super.getSexo() + " ,nota: " + nota;
    }

}
