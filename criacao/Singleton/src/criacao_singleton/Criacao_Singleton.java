/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao_singleton;
import java.io.*;

/**
 *
 * @author eduarda
 */
public class Criacao_Singleton {

    private static Criacao_Singleton instance;
    
    private Criacao_Singleton(){}
    
    public synchronized static Criacao_Singleton getInstance(){
        if (instance == null){
            instance = new Criacao_Singleton();
        }
        return instance;
    }
    
    private long numero = 0;
    
    public synchronized long getNumero() throws IOException{
        numero = readLong("./src/criacao_singleton/UltimoNumero.txt", 999990101);
        saveProxNum();
        return numero;
    
    }
    
    private synchronized void saveProxNum() throws IOException{
        writeLong("./src/criacao_singleton/UltimoNumero.txt", numero+1);
    }
            
            
            
    public synchronized static void writeLong(String filename, long numero) throws IOException {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
        dos.writeLong(numero);
    }
}

    public synchronized static long readLong(String filename, long valueIfNotFound) {
        if (!new File(filename).canRead())
            return valueIfNotFound;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            return dis.readLong();
        } catch (IOException ignored) {
            return valueIfNotFound;
        }
    }
}
