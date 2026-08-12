public class Filme {
   
    private String titulo;
    private int anoLancamento;
    private String genero;
    private int duracaoEmMinutos;
    private boolean emExibicao;

    public Filme(String titulo, int anoLancamento, String genero, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.emExibicao = false; 
    }

   
    public void reproduzir() {
        if (!emExibicao) {
            emExibicao = true;
            System.out.println("▶ Reproduzindo o filme: " + titulo);
        } else {
            System.out.println(" O filme " + titulo + " já está sendo exibido.");
        }
    }

    public void pausar() {
        if (emExibicao) {
            System.out.println("⏸ Filme " + titulo + " pausado.");
        } else {
            System.out.println(" Não é possível pausar, pois o filme não está rodando.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("------------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracaoEmMinutos + " min");
        System.out.println("------------------------------------");
    }

    
    public static void main(String[] args) {
       
        Filme filme1 = new Filme("Inception", 2010, "Ficção Científica", 148);
        Filme filme2 = new Filme("O Chefão", 1972, "Crime", 175);
        Filme filme3 = new Filme("Divertida Mente", 2015, "Animação", 95);

     
        filme1.exibirDetalhes();
        filme1.reproduzir();
        filme1.pausar();

        filme2.exibirDetalhes();
        filme2.reproduzir();

        filme3.exibirDetalhes();
    }
}
