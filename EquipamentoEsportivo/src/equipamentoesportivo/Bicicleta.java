
package equipamentoesportivo;


  public class Bicicleta extends Equipamento {
   
    private String tipo;

   
    public Bicicleta(String nome, double precoAluguel, String tipo) {
        super(nome, precoAluguel);  
        this.tipo = tipo;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 
    @Override
    public int definirDurabilidade() {
        return 50;
    }
}
  

