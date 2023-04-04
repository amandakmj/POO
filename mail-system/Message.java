public class Message {
    private String text;
    private String nomeArquivo;

    public Message(String text, String nomeArquivo){
        this.text = text;
        this.nomeArquivo = nomeArquivo;
    }

    public String getText() {
        return text;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }
    
}
