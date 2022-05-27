package Paquetes;

public class Persona {
    private String nombre;
    private int Id;
    private int edad;
    private int telefono;
    private String direccion;

    public Persona(){
        nombre="indefinido";
        Id="indefinido";
        edad="indefinido";
        telefono="indefinido";

    }

    public String dime_nombre(){
        return "Bienvenido, su nombre es: "+ nombre;
    }
    public void establece_nombre(String nombre_Persona){
        nombre=nombre_Persona;
    }
    public String dime_Id(){
        return "Su identificación es: " + Id;
    }
    public void establece_Id(int Id_Persona){
        Id=Id_Persona;
    }
    public String dime_edad(){
        return "Su edad es: "+ edad;
    }
    public void establece_edad(int edad_Persona){
        edad=edad_Persona;
    }
    public String dime_telefono(){
        return "Su número de teléfono es: " + telefono;
    }
    public void establece_telefono(int telefono_Persona){
        telefono=telefono_Persona;
    }
    public String dime_direccion(){
        return "Su dirección es: " + direccion;
    }
    public void establece_direccion(String direccion_Persona){
        direccion=direccion_Persona;
    }
    
    
}
