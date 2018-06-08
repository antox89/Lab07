

package lab07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class adminSerie {
    
    private ArrayList<Serie> listaSeries = new ArrayList();
    private File archivo = null;
    
    public adminSerie(String path){
        this.archivo=new File(path);
    }

    public ArrayList<Serie> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setSerie(Serie ser){
        this.listaSeries.add(ser);
    }

    @Override
    public String toString() {
        return "adminSerie{" + "listaSeries=" + listaSeries + '}';
    }
    
    public void escribirArhivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(archivo, true);
            bw=new BufferedWriter(fw);
            for(Serie pt: listaSeries){
                bw.write(pt.getNombre()+";");
                bw.write(pt.getId()+";");
                bw.write(pt.getDuracion()+";");
                bw.write(pt.getDirector()+";");
                bw.write(pt.getProductora()+";");
                bw.write(pt.getCategoria()+";");
                bw.write(pt.getRating()+";");
            }
            bw.flush();
        }catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc=null;
        listaSeries=new ArrayList();
        if(archivo.exists()){
            try{
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listaSeries.add(new Serie(sc.nextInt(),sc.nextInt(),sc.nextInt(),
                            sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next()));
                }
            }catch(Exception e){
                
            }
            sc.close();
        }
    }

}
