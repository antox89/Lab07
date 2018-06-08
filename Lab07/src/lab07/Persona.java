

package lab07;

import java.util.ArrayList;
import java.util.Date;


public class Persona {
    
    private String correo, password;
    private Date nacimiento;
    private int tarjeta;
    private ArrayList<Pelicula> listaPelicula = new ArrayList();
    private ArrayList<Serie> listaSerie = new ArrayList();

    public Persona() {
    }

    public Persona(String correo, String password, Date nacimiento, int tarjeta) {
        this.correo = correo;
        this.password = password;
        this.nacimiento = nacimiento;
        this.tarjeta = tarjeta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<Pelicula> getListaPelicula() {
        return listaPelicula;
    }

    public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
        this.listaPelicula = listaPelicula;
    }

    public ArrayList<Serie> getListaSerie() {
        return listaSerie;
    }

    public void setListaSerie(ArrayList<Serie> listaSerie) {
        this.listaSerie = listaSerie;
    }
    
    public void setPeliculas(Pelicula pel){
        this.listaPelicula.add(pel);
    }
    
    public void setSeries(Serie ser){
        this.listaSerie.add(ser);
    }

    @Override
    public String toString() {
        return "Persona{" + "listaPelicula=" + listaPelicula + ", listaSerie=" + listaSerie + '}';
    }
    
    

}
