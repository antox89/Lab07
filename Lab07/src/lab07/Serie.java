

package lab07;

import java.util.ArrayList;


public class Serie {
    
    private int id, rating, nTemporadas, duracion;
    private String nombre, categoria,productora,director;
    private ArrayList<String> listaActores = new ArrayList();
    private ArrayList<String> listaIdiomas= new ArrayList();
    private ArrayList<String> listaSubs = new ArrayList();
    private ArrayList<String> listaComentarios = new ArrayList();

    public Serie() {
    }

    public Serie(int id, int rating, int nTemporadas, int duracion, String nombre, String categoria, String productora, String director) {
        this.id = id;
        this.rating = rating;
        this.nTemporadas = nTemporadas;
        this.duracion = duracion;
        this.nombre = nombre;
        this.categoria = categoria;
        this.productora = productora;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getListaActores() {
        return listaActores;
    }

    public void setListaActores(ArrayList<String> listaActores) {
        this.listaActores = listaActores;
    }

    public ArrayList<String> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(ArrayList<String> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public ArrayList<String> getListaSubs() {
        return listaSubs;
    }

    public void setListaSubs(ArrayList<String> listaSubs) {
        this.listaSubs = listaSubs;
    }

    public ArrayList<String> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<String> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    @Override
    public String toString() {
        return "Título: " + nombre + " Duración: " + duracion;
    }

    
    
    

}
