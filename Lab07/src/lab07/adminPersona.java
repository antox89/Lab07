

package lab07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class adminPersona {
    
    private ArrayList<Persona> listaPersona = new ArrayList();
    private File archivo = null;
    
    public adminPersona(String path){
        archivo=new File(path);
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminPersona{" + "listaPersona=" + listaPersona + '}';
    }
    
    public void setPersona(Persona per){
        this.listaPersona.add(per);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw= null;
        BufferedWriter bw=null;
        
        try{
            fw=new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            
            for(Persona t : listaPersona){
                bw.write(t.getCorreo());
                bw.write(t.getPassword());
                bw.write(t.getTarjeta());
            }
            bw.flush();
        }catch(Exception e){
            
        }
        fw.close();
        bw.close();
    }

}
