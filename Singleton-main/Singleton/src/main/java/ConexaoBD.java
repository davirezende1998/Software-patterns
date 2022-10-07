public class ConexaoBD {

    private ConexaoBD() {}
    private static ConexaoBD instance = new ConexaoBD();
    public static ConexaoBD getInstance() {
        return instance;
    }

    private String bd;
    private String url;
    private String username;
    private String password;

    public String getNomeDoBanco() {
        return bd;
    }

    public void setNomeDoBanco(String name) {
        this.bd = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String link) {
        this.url = link;
    }

    public String getNomeDoUsuario() {
        return username;
    }

    public void setNomeDoUsuario(String user) {
        this.username = user;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String key) {
        this.password = key;
    }
}