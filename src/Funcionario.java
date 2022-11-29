public class Funcionario {
    private String nome;
    private Double salario;
    private Double custo;

    private static final Double PERCENTUAL_CUSTO = 1.8;

    public void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * PERCENTUAL_CUSTO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAumento(Double percentual){
        double mult = (100.0 + percentual )/100.0;
        this.setSalario(this.getSalario() * mult);
    }
    public void setAumento(String percentual){
        double d = Double.parseDouble(percentual);
        this.setAumento(d);
    }
    public void setAumento(){
        this.setAumento(10.0);
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getCusto() {
        return custo;
    }

    public void imprimir(){
        System.out.println("Nome: "+getNome() + " Seu Salario e de: "+getSalario() + "Seu Custo e de: "+getCusto());

    }
    public void imprimir(Cabecalho cabecalho,  Rodape rodape){
       cabecalho.imprimir();
       imprimir();
       rodape.imprimir();
    }
    public void imprimir(Cabecalho cabecalho){
        cabecalho.imprimir();
        imprimir();
    }

    public void imprimir(Rodape rodape){
        imprimir();
        rodape.imprimir();
    }
}
