
package ejerciciolibro;


public class libro {
    private int ISBN ;
    private String  titulo;
    private String autor;
    private int numdepaginas;
  
    /*contructores*/
      public libro (int pISBN,String ptitulo,String pautor,int pnumdepaginas ){
          ISBN=pISBN;
          titulo=ptitulo;
          autor=pautor;
          numdepaginas=pnumdepaginas;
          
          
      }
      /*metodos*/

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumdepaginas() {
        return numdepaginas;
    }

    public void setNumdepaginas(int numdepaginas) {
        this.numdepaginas = numdepaginas;
    }
      
      /*vamos que se puede */
    public String toStting (){
        return "El libro "+titulo+"con ISBN"+ISBN+""+"creado por el autor"+autor+"tiene"+numdepaginas+"paginas";
        
        
    }

  
    }
}
