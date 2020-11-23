public class Livro {
    private int id;
    private String nome;
    private String autor;
    private boolean emprestado;


    Livro(){
        this(-1, "", "", false);
    }

    Livro(int pId, String pNome, String pAutor, boolean pEmprestado){
        id = pId; nome = pNome; autor = pAutor; emprestado = pEmprestado;
    }

    public int getId(){ return this.id; }
    public void setId(int id){ this.id = id; }
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }
    public String getAutor(){ return this.autor; }
    public void setAutor(String autor){ this.autor = autor; }
    public boolean getEmprestado() { return this.emprestado; }
    public void setEmprestado(boolean emprestado){ this.emprestado = emprestado; }

}