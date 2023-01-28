
package com.mycompany.alumnosyprofesorespoo_3;

public abstract class Persona {
    private String nombre;
    private char  sexo;
    private int edad;
    private boolean asistencia;
    
    private final String[] NOMBRES_CHICOS = {"PEPE","RITCH","CHUCHO","LUCHO","LINCHE"};
    private final String[] NOMBRES_CHICAS = {"LUPE","LUCI","JULI","JOSY","DANI"};
    private final int CHICO = 0;
    private final int CHICA = 1;

    

    public Persona() {
        int determinarSexo=MetodosSueltos.generarNumeroAleatorio(0, 1);
        if (determinarSexo == CHICO) {
            nombre = NOMBRES_CHICOS[MetodosSueltos.generarNumeroAleatorio(0, 4)];
            sexo = 'H';
        }else{
            nombre = NOMBRES_CHICAS[MetodosSueltos.generarNumeroAleatorio(0, 4)];
            sexo = 'M';
        }
        
        disponibilidad();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
   
    
    
    
    public abstract  void disponibilidad();
        
    
    
    
    
}
