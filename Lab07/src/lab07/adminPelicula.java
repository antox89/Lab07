

package lab07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class adminPelicula {
    
    private ArrayList<Pelicula> listaPeliculas=new ArrayList();
    private File archivo=null;
    
    public adminPelicula(String path){
        this.archivo=new File(path);
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPelicula(Pelicula pel){
        this.listaPeliculas.add(pel);
    }

    @Override
    public String toString() {
        return "adminPelicula{" + "listaPeliculas=" + listaPeliculas + '}';
    }
    
    public void escribirArhivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(archivo, true);
            bw=new BufferedWriter(fw);
            for(Pelicula pt: listaPeliculas){
                bw.write(pt.getNombre()+";");
                bw.write(pt.getId()+";");
                bw.write(pt.getDuracion()+";");
                bw.write(pt.getDirector()+";");
                bw.write(pt.getProductora()+";");
                bw.write(pt.getCategoria()+";");
                bw.write(pt.getRating());
            }
            bw.flush();
        }catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc=null;
        listaPeliculas=new ArrayList();
        if(archivo.exists()){
            try{
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listaPeliculas.add(new Pelicula(sc.nextInt(),sc.nextInt(),
                            sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
                }
            }catch(Exception e){
                
            }
            sc.close();
        }
    }

}
