/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablahashtp3;

/**
 *
 * @author martin
 */
public class TablaHash {
    int dato;
    int estado;
    

    public TablaHash(){
        
    }
    
    // FuncionHash asigna una clave
    static int funcionHash(int n, int m){
        
        //return ((n & 0x7fffffff) % m); This is not working
        
        //Buena opción: f(c) = c % B, siendo c la clave y B el tamaño de la tabla
        //return (n % m); No
        return ((n + 1) % m);
        
    }
    
    public Integer buscarHash(){
        return null;
    }
    
    public void insertarHash(int n, int m){
        System.out.println(n + " Tiene el Hash --->" + funcionHash(n, m));
    };
    
    public void eliminarHash(){}
}
