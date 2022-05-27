package Paquetes;


public class Docentes {
    private String especialidad;
    private String direccion_de_grado;
    private String horario;
    private String medio_de_transporte;
    private int años_de_experiencia;

    public String dime_especialidad(){
        return "Su especialidad es: " + especialidad;
    }
    public void establece_especialidad(String espedialidad_Docente){
        especialidad=espedialidad_Docente;
    }
    public String dime_direccion_de_grado(){
        return "Usted es director(a) del grado: " + direccion_de_grado;
    }
    public void establece_direccion_de_grado(String direccion_de_grado_Docente){
        direccion_de_grado=direccion_de_grado_Docente;
    }
    public String dime_horario(){
        return "Su horario es: " + horario;
    }
    public void establece_horario(String horario_Docente){
        horario=horario_Docente;
    }
    public String dime_medio_de_transporte(){
        return  "Su medio de transporte es: " + medio_de_transporte;
    }
    public void establece_medio_de_transporte(String medio_de_transporte_Docente){
        medio_de_transporte=medio_de_transporte_Docente;
    }
    public String dime_años_de_experiencia(){
        return "Sus años de experiencia son: " + años_de_experiencia;
    }public void establece_años_de_experiencia(int años_de_experiencia_Docente){
        años_de_experiencia=años_de_experiencia_Docente;
    }


}
