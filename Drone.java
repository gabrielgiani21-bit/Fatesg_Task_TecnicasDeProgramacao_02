public class Drone {
 
    private String marca;
    private String modelo;
    private String cor;
    private int numeroSerie;
    private int nivelBateria;
    private boolean emVoo;

    public Drone(String marca, String modelo, String cor, int numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numeroSerie = numeroSerie;
        this.nivelBateria = 100; 
        this.emVoo = false;     
    }

    
    public void decolar() {
        if (!emVoo && nivelBateria > 10) {
            emVoo = true;
            System.out.println(" Drone " + modelo + " (S/N: " + numeroSerie + ") decolou com sucesso!");
        } else if (nivelBateria <= 10) {
            System.out.println(" Bateria muito baixa para decolar!");
        } else {
            System.out.println(" O drone já está em voo.");
        }
    }

    public void realizarInspecao() {
        if (emVoo) {
            nivelBateria -= 20; 
            System.out.println(" Realizando inspeção da área... Bateria restante: " + nivelBateria + "%");
        } else {
            System.out.println(" Impossível inspecionar: o drone precisa estar em voo!");
        }
    }

    public void pousar() {
        if (emVoo) {
            emVoo = false;
            System.out.println(" Drone " + modelo + " pousou com segurança.");
        } else {
            System.out.println(" O drone já está no chão.");
        }
    }

  
    public static void main(String[] args) {
      
        Drone drone1 = new Drone("DJI", "Mavic 3 Enterprise", "Cinza", 1001);
        Drone drone2 = new Drone("Autel", "EVO II Dual", "Laranja", 2002);

        System.out.println("--- Testando Drone 1 ---");
        drone1.decolar();
        drone1.realizarInspecao();
        drone1.pousar();

        System.out.println("\n--- Testando Drone 2 ---");
        drone2.decolar();
        drone2.realizarInspecao();
        drone2.realizarInspecao();
        drone2.pousar();
    }
}
