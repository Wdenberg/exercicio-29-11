

public class Aplication {
    public static void main(String[] args) {
        Cabecalho cabecalho = new Cabecalho();
        Rodape rodape = new Rodape();
        Gerente Gerente = new Gerente();
        Gerente.setNome("Roberto");
        Gerente.setSalario(2000.0);
        cabecalho.setCabecalho("Cabecalho da pagina ");
        rodape.setRodape("fim da pagina ");
        Gerente.setAumento();
        Gerente.imprimir(cabecalho, rodape);

        programador Programador = new programador();

        Programador.setNome("Eduardo");
        Programador.setSalario(5000.0);
        Programador.setAumento("20.0");
        cabecalho.setCabecalho("começo da pagina");
        rodape.setRodape("fim da pagina ");
        Programador.imprimir(rodape);


    }
}
