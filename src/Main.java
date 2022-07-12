public class Main {
   public static void main(String[] args) {
        Cliente werito = new Cliente();
        Trabajador godin = new Trabajador();
        werito.setNombre("Pedro");
        werito.setEdad(20);
        werito.setTelefono(123123);
        werito.setCredito((float) 125.32);
        System.out.println("Cliente " + werito.getNombre() + " edad " + werito.getEdad() +" telefono " + werito.getTelefono() +" tu credido es: " + werito.getCredito());

       godin.setNombre("Joaquin");
       godin.setEdad(23);
       godin.setTelefono(1231223);
       godin.setSalario((float) 1235.32);
       System.out.println("Trabajador " + godin.getNombre() + " edad " + godin.getEdad() +" telefono " +godin.getTelefono() +" tu credido es: " +godin.getSalario());

   }

}

class Persona{
    public String nombre;
    public int edad, telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{
    public float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    public float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}