package Paquetes;

public class Estudiantes {
    private int año_escolar;
    private int valor_pension;
    private String materia_favorita;
    private String deporte_preferido;
    private String medio_de_transporte;

    public String dime_año_escolar(){
        return "Su año escolar es: " + año_escolar;
    }
    public void establece_año_escolar(int año_escolar_Estudiante){
        año_escolar=año_escolar_Estudiante;
    }
    public String dime_valor_pension(){
        return "El valor de la pensión es: " + valor_pension;
    }
    public void establece_valor_pension(int valor_pension_Estudiante){
        valor_pension=valor_pension_Estudiante;
    }
    public String dime_materia_favorita(){
        return "Su materia favorita es: " + materia_favorita;
    }
    public void establece_materia_favorita(String materia_favorita_Estudiante){
        materia_favorita=materia_favorita_Estudiante;
    }
    public String dime_deporte_preferido(){
        return "Su deporte preferido es: " + deporte_preferido;
    }
    public void establece_deporte_preferido(String deporte_preferido_Estudiante){
        deporte_preferido=deporte_preferido_Estudiante;
    }
    public String dime_medio_de_transporte(){
        return "Su medio de transporte es: " + medio_de_transporte;
    }
    public void establece_medio_de_transporte(String medio_de_transporte_Estudiante){
        medio_de_transporte=medio_de_transporte_Estudiante;
    }

    
}
