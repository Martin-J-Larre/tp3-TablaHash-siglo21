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
    int estado;  //0 = VacÃ-o, 1 = Eliminado, 2 = Ocupado
    

    public TablaHash(){
        
    }
    
    // FuncionHash asigna una clave
    static int funcionHash(int n, int m){
        return (n & 0x7fffffff) % m;    

    }
    
    static void insertaHash(TablaHash[] h, int m, int n) {
        boolean i = false;
        int j = funcionHash(n, m);
        int el = 0;
        int b = 0;
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
                el = h[j].dato = n;
                b = j;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            System.out.print ("Elemento " + el + " insertado con Éxito! en el bucket " + b + " \n");
        } else {
            System.out.print ("Tabla llena!!! \n");
            }
        }
    
    
        // 1 - Hashear n y guardar el resultado de la llave en j
        // 2 - En un loop ejecutar la posicion de la llave j y en esa iteracion checkear
        // .   las condiciones, en el caso de no econtar el dato buscado
        // .   incrementar j+= y ejecutar el proceso en la suiente iteracion, ya 
        //     que el dato que se busca puede estar en otra posicion por colision.   
        // 3 - checkear si estado es 0 (vacio) y retornar -1
        // 4 - chechear si hay coincide el dato y si estado es 1 (eliminado) entonces 
        // .   retornar -1 sino retornar el dato buscado.
        // 5 - Si ninguna de los condiciones es vedadera incrementar j+= y ejecutar 
        //     el proceso en la suiente iteracion hasta que no pase la condicion del loop y
        //     retorne -1 sin poder encontar el dato.
    
    static int buscaHash(TablaHash[] h, int m, int n) {

        int j = funcionHash(n, m);
        do { 
            if (h[j].estado == 0) {
               return -1; 
            } else if (h[j].dato == n){
                   if(h[j].estado == 1){
                       return -1;
                   } else {
                       System.out.print ("Elemento " + n + " encontrado en el bucket " + j + "! \n");
                       return j;
                   }
            } else {
                    j++;
               }
           
        } while (j < m);
            return -1;
        }
    
    
    static int eliminaHash(TablaHash[] h, int m, int n) {
    int i = buscaHash(h, m, n);
    if (i == -1) {
    return -1;
    } else {
    h[i].estado = 1;
    System.out.print ("Elemento " + n + " Borrado! \n");
    return 1;
    }
    }
}

