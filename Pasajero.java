public class Pasajero{
    //Atriutos
    private String nombres;
    private String apellidos;
    private String numeroDePasaporte;
    private String asiento;
    private int edad;

    //Metodos

    Pasajero(){}
     
    //Constructor por parametros
    Pasajero(String nombres, String apellidos, String numderoDePasaporte, String asiento, int edad){
        this.nombres = nombres;
        this.apellidos=apellidos;
        this.mumeroDePasaportes= numderoDePasaporte;
        this.asiento=asiento;
        this.edad=edad;
    }
    //Getters y setters

    //Getters
    public String getNombres(){
        return this.nombres;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String NumderoDePasaporte(){
        return this.numderoDePasaporte;
    }
    public String getAsiento(){
        return this.asiento;
    }
    public int getEdad(){
        return this.edad;
    }

    // Setters
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setApellido(String apellidos){
        this.apellidos=apellidos;
    }
    public void setNumeroDePasaporte(String numderoDePasaporte){
        this.numderoDePasaporte=numderoDePasaporte;
    }
    public void setAsiento(String asiento){
        this.asiento=asiento;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }