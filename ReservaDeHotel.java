public class ReservaHotel {
 
    private String nomeHospede;
    private int numeroQuarto;
    private int quantDias;
    private double valorDiaria;
    private boolean ativa;

 
    public ReservaHotel(String nomeHospede, int numeroQuarto, int quantDias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.numeroQuarto = numeroQuarto;
        this.quantDias = quantDias;
        this.valorDiaria = valorDiaria;
        this.ativa = true; 
    }

  
    public double calcularValorTotal() {
        return quantDias * valorDiaria;
    }

    public void estenderHospedagem(int diasExtras) {
        if (ativa) {
            this.quantDias += diasExtras;
            System.out.println("Hospedagem de " + nomeHospede + " estendida em " + diasExtras + " dia(s). Total: " + quantDias + " dias.");
        } else {
            System.out.println("Não é possível alterar uma reserva inativa.");
        }
    }

    public void cancelarReserva() {
        if (ativa) {
            ativa = false;
            System.out.println("Reserva do quarto " + numeroQuarto + " (" + nomeHospede + ") foi cancelada.");
        } else {
            System.out.println("A reserva já se encontra inativa.");
        }
    }

    public void exibirResumo() {
        System.out.println("------------------------------------");
        System.out.println("Hóspede: " + nomeHospede);
        System.out.println("Quarto: " + numeroQuarto);
        System.out.println("Dias de permanência: " + quantDias);
        System.out.println("Valor total: R$ " + calcularValorTotal());
        System.out.println("Status: " + (ativa ? "Ativa" : "Cancelada"));
        System.out.println("------------------------------------");
    }


    public static void main(String[] args) {
       
        ReservaHotel reserva1 = new ReservaHotel("Carlos Silva", 101, 3, 150.0);
        ReservaHotel reserva2 = new ReservaHotel("Ana Souza", 205, 5, 200.0);

       
        System.out.println("--- Reserva 1 ---");
        reserva1.exibirResumo();
        reserva1.estenderHospedagem(2);
        System.out.println("Novo Valor Total: R$ " + reserva1.calcularValorTotal());

        
        System.out.println("\n--- Reserva 2 ---");
        reserva2.exibirResumo();
        reserva2.cancelarReserva();
        reserva2.exibirResumo();
    }
}
