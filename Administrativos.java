package Paquetes;

public class Administrativos {
    private String sexo;
    private String cargo;
    private int edad;
    private String religion;
    private String nacionalidad;

    public String dime_sexo(){
        return "Su sexo es: " + sexo;
    }
    public void establece_sexo(String sexo_Administrtivo){
        sexo=sexo_Administrtivo;
    }
    public String dime_cargo(){
        return "Su cargo es: " + cargo;
    }
    public void establece_cargo(String cargo_Administrativo){
        cargo=cargo_Administrativo;
    }
    public String dime_edad(){
        return "Su edad es: " + edad;
    }
    public void establece_edad(int edad_Administrativo){
        edad=edad_Administrativo;
    }
    public String dime_religion(){
        return "Su religion es: " + religion;
    }
    public void establece_religion(String religion_Administrativo){
        religion=religion_Administrativo;
    }
    public String dime_nacionalidad(){
        return "Su nacionalidad es: " + nacionalidad;
    }
    public void establece_nacionalidad(String nacionalidad_Administrativo){
        nacionalidad=nacionalidad_Administrativo;
    }

    
}
