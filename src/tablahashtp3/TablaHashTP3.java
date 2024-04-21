
package tablahashtp3;

// Tabla hash V1 ejemplo/Test

public class TablaHashTP3 {

    
     
    
    public static void main(String[] args) {
       int i, n,elemento;
        // Tabla Definida de 15
        int m=15;
        TablaHash[] h = new TablaHash[m];
        for (i = 0; i < m; i++) {
            h[i] = new TablaHash();
            h[i].estado = 0;
        }    
    // Insertar elemento
    TablaHash.insertaHash(h, m, 15);
    TablaHash.insertaHash(h, m, 130);
    TablaHash.insertaHash(h, m, 7);
    TablaHash.insertaHash(h, m, 32);
//    TablaHash.insertaHash(h, m, 42);
//    TablaHash.insertaHash(h, m, 62);
//    TablaHash.insertaHash(h, m, 162);
//    TablaHash.insertaHash(h, m, 752);
//    TablaHash.insertaHash(h, m, 678);

    //Buscando un elemento

    elemento=7;
    i = TablaHash.buscaHash(h, m, elemento);
    };

    
}
