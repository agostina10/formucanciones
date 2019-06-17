
public class Memoria {
      private String Artista;
    private String Cancion;
    private int gb;
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Memoria(String Artista, String Cancion, int gb) {
        this.Artista = Artista;
        this.Cancion = Cancion;
        this.gb = gb;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getCancion() {
        return Cancion;
    }

    public void setCancion(String Cancion) {
        this.Cancion = Cancion;
    }

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {
        return "Memoria{" + "Artista=" + Artista + ", Cancion=" + Cancion + '}';
    }
    
    
    //metodo para agregar//
    public  String agregartcancion(String artista,String cancion){
       String rptaRegistro=null; 
       return rptaRegistro;
       
        //try{
            //Connection accesoDB= conexion.getConexion();
            
            //CallableStatement cs= accesoDB.prepareCall("(call sp_insertCancion(?,?");
            
            //cs.setString(1,artista);
            //cs.setString(2,cancion);
            ///int numFAfectas= cs.executeUpdate();
            
            //if(numFAFectas>0){
                //rptaRegistro="registro exitoso.";
                
        //}
       // }
        //catch (Exception e) {
            
            
        //}
        
        //return rptaRegistro;
    
        
        
        
        
        
    }
        
        
    //public ArrayList<Memoria> listmusica(){
       //ArrayList listamusica=new ArrayList(); 
       
       //memoria =memoria;
        
        
        
    //}
    

}


