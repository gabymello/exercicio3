
package equipamentoesportivo;


public class EquipamentoEsportivo {

    
    public static void main(String[] args) {
   
        Bicicleta bicicleta = new Bicicleta("Bicicleta de Corrida", 50.0, "Corrida");
        System.out.println("Equipamento: " + bicicleta.getNome());
        System.out.println("Tipo: " + bicicleta.getTipo());
        System.out.println("Durabilidade: " + bicicleta.definirDurabilidade() + " horas");

       
        Bola bola = new Bola("Bola de Volei", 15.0, "Plastico");
        System.out.println("\nEquipamento: " + bola.getNome());
        System.out.println("Material: " + bola.getMaterial());
        System.out.println("Durabilidade: " + bola.definirDurabilidade() + " horas");
    }
}

        
        
        
        
        
        
    
    

