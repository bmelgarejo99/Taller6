/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6;

/**
 *
 * @author Administrador
 */
public class Paciente 
{
    private double codigo;
    private String apellidos;
    private String nombres;
    private String sexo;
    private String direccion;
    private String lugarAtendido;
    private String motivo;
    private String medico;
    private String fecha;
    public double getCodigo() {
        return codigo;
    }

    public void Paciente(double codigo,String apellidos,String nombres,String sexo,String direccion,String lugarAtendido,String motivo,String medico,String fecha) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.direccion = direccion;
        this.lugarAtendido = lugarAtendido;
        this.motivo = motivo;
        this.medico = medico;
        this.fecha = fecha;
    }
    
    public Paciente()
    {
     double codigo=0;
     String apellidos="";
     String nombres="";
     String sexo="";
     String direccion="";
     String lugarAtendido="";
     String motivo="";
     String medico="";
     String fecha="";
    }
    public Paciente(double c,String ap,String n,String se,String di,String lA,String mo,String me,String fe)
    {
     double codigo=c;
     String apellidos=ap;
     String nombres=n;
     String sexo=se;
     String direccion=di;
     String lugarAtendido=lA;
     String motivo=mo;
     String medico=me;
     String fecha=fe;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }
    public String getSexo() {
        return sexo;
    }
    public String getDireccion() {
         return direccion;
    }
    public String getLugarAtendido() {
        return lugarAtendido;
    }
    public String getMotivo() {
        return motivo;
    }
    public String getMedico() {
        return medico;
    }
    public String getFecha() {
        return fecha;
    }
  
}


