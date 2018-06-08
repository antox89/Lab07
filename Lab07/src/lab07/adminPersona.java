

package lab07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


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
            fw=new FileWriter(archivo,true);
            bw=new BufferedWriter(fw);
            
            for(Persona t : listaPersona){
                bw.write(t.getCorreo()+";");
                bw.write(t.getPassword()+";");
                bw.write(t.getTarjeta()+";");
                bw.write(t.getNacimiento()+";");
            }
            bw.flush();
        }catch(Exception e){
            
        }
        fw.close();
        bw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc=null;
        listaPersona=new ArrayList();
        if(archivo.exists()){
            try{
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listaPersona.add(new Persona(/*sc.next(),sc.next(),sc.next(),sc.nextInt()*/));
                }
            }catch(Exception e){
                
            }
            sc.close();
        }
    }

}
