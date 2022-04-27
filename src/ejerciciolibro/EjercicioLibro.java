 
package ejerciciolibro;


public class EjercicioLibro {

   
    public static void main(String[] args) {
        
        libro libro1=new libro (11,"titulo","autor1", 30);
        libro libro2=new libro (6554,"titulo2","autor2",35);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        
        if(libro1.getNumdepaginas()>libro2.getNumdepaginas()){
            System.out.println(libro1.getNumdepaginas()+"tiene mas paginas");
    }else{
            System.out.println(libro2.getNumdepaginas()+"tiene mas paginas");
        }
    }
    
}
