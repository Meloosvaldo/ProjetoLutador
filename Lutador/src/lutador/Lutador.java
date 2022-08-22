
 package lutador;


public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    
    //Métodos Públicos
    public void apresentar (){
        System.out.println("-----------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente do " + this.getNacionalidade());
        System.out.println("Com " +this.getIdade()+ " anos e " + this.getAltura()+ " de altura"); 
        System.out.println("Pesando " + this.getPeso()+ " Kg");
        System.out.println(this.getVitorias()+ " Vitorias");
        System.out.println(this.getDerrotas()+ " derrotas e ");
        System.out.println(this.getEmpates() + " empates!");
    }
    public void status(){
        System.out.println(this.getNome()+ " e um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias()+ " vezes");
        System.out.println("Perdeu " + this.getDerrotas()+ " vezes");
        System.out.println("Empatou " + this.getEmpates()+ " vezes");
    }
    public void ganharLuta (){
        this.setVitorias(this.getVitorias() + 1);
        //this.vitorias = this.vitorias + 1;
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Método Construtor
    public Lutador(String no, String na, int id, double al, double pe,int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
       
    }
      
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Invalido";
        } else if (peso<=70.3){
            this.categoria = "Leve";
        } else if (peso<83.9){
            this.categoria = "Medio";
        } else if (peso<120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }
       
}
