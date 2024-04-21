
package tablahashtp3;

// Tabla hash V1 ejemplo/Test

public class TablaHashTP3 {

    
     
    
    public static void main(String[] args) {
       TablaHash tabla = new TablaHash();
       int m = 15;
       
       for(Integer i = 0; i <m; i++){
           tabla.insertarHash(i, m);
       }
    };
    
}
