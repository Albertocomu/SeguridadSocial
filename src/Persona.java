public class Persona {
    String dni;
    String numss;
    String nombre;
    String apellido;
    int edad;
    double salario;


    public Persona(String dni, String numss, String nombre, String apellido, int edad, double salario) {
        this.dni = dni;
        this.numss = numss;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {return dni;}
    public String getNumss() {return numss;}
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public int getEdad() {return edad;}
    public double getSalario() {return salario;}

    public void setDni(String dni) {this.dni = dni;}
    public void setNumss(String numss) {this.numss = numss;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setSalario(double salario) {this.salario = salario;}

    @Override
    public String toString() {
        return "Persona{" +
                ", numss='" + numss + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}