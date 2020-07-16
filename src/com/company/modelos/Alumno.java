package com.company.modelos;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alumno {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String dni;

    public Alumno(String nombre, String apellidos, Date fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void  getFechaNacimiento() {
        this.fechaNacimiento= fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                '}';
    }

    public int getEdad() {

        Calendar today = Calendar.getInstance();
Calendar c= new GregorianCalendar();
        int diff_year = today.get(Calendar.YEAR) - c.get(Calendar.YEAR);
        int diff_month = today.get(Calendar.MONTH) - c.get(Calendar.MONTH);
        int diff_day = today.get(Calendar.DAY_OF_MONTH) -c.get(Calendar.DAY_OF_MONTH);
        if (diff_month < 0 ) diff_year-=1;
        if(diff_month==0)
            if (diff_day<0) diff_year-=1;

        return diff_year;
    }
}