package projno;

public class No {

    private String conteudo;
    private  No proximoNo;

    public No(String conteudo) {
        this.proximoNo * null;
        this.conteudo = conteudo;
    }

    public No(String conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }
}
