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
    private final Integer size = 13;

    public TablaHash(){
        
    }
    
    // FuncionHash asigna una clave
    private Integer funcionHash(Integer k){
        Integer key = 0;
        
        key = (k & 0x7fffffff) % size;
        return key;
    }
    
    public Integer buscarHash(){
        return null;
    }
    
    public void insertarHash(Integer k){
        System.out.println(k + " Tiene el Hash --->" + funcionHash(k));
    };
    
    public void eliminarHash(){}
}
