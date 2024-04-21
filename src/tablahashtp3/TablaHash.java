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
        int result  = ((n & 0x7fffffff) % m); 
        System.out.println("Hashed ---->" + result);
        return result; 
        // ((n & 0x7fffffff) % m) ???? This is not working
        
        //Buena opción: f(c) = c % B, siendo c la clave y B el tamaño de la tabla
        //return (n % m); No
        //return ((n + 1) % m);
        
    }
    
    static void insertaHash(TablaHash[] h, int m, int n) {
        System.out.println("n" + n);
        boolean i = false;
        int j = funcionHash(n, m);
        do {
        if (h[j].estado == 0 || h[j].estado == 1) {
        h[j].dato = n;
        h[j].estado = 2;
        i = true;
        } else {
        j++;
        }
        } while (j < m && !i);
        if (i) {
        System.out.print ("Elemento insertado con Éxito! \n");
        } else {
        System.out.print ("Tabla llena!!! \\n");
        }
        }
    
    static int buscaHash(TablaHash[] h, int m, int n) {
        //h es la tabla hash
        //m es el tamaño de la tabla
        //n es el valor buscado
        // y debe devolver el valor mismo que busca n si lo encuentra y -1 si no
        // encuentra nada
        return 1;
        }
    
    
    static int eliminaHash(TablaHash[] h, int m, int n) {
    int i = buscaHash(h, m, n);
    if (i == -1) {
    return -1;
    } else {
    h[i].estado = 1;
    System.out.print ("Elemento Borrado! \n");
    return 1;
    }
    }
}

