public class Vuelo{
    private String codigo;
    private String origen;
    private String destino;
    private int disponibilidad;
    private Pasajero pasajeros[];
}


vuelo(){}

Vuelo(String codigo, String origen, String destino, int disponibilidad,  Pasajero pasajeros[]){
this.codigo=codigo;
this.origen=origen;
this.destino=destino;
this.disponibilidad=disponibilidad;
this.pasajeros=pasajeros;
}

public String getCodigo(){
return this.codigo
}
public String getOirgen(){
return this.origen
}
public String getDestino(){
return this.destino
}
public int getDisponibilidad(){
return this.disponibilidad
}
public Pasajero [] getPasajeros(){
return this.pasajeros
}

//Setters
public void setCodigo(String codgio){
this.codgio=codgio;
}
public void setOrigen(String origen){
this.origen=origen;
}
public void setDestino(String destino){
this.destino=destino;
}
public void setDisponibilidad(int disponibilidad){
this.disponibilidad=disponibilidad;
}
public void setPasajeros(Pasajero pasajeros){
this.pasajeros=pasajeros;
}