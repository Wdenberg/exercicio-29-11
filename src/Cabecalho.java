public class Cabecalho {

    private String cabecalho;

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public  void imprimir(){
        System.out.println(this.getCabecalho());
    }
}
