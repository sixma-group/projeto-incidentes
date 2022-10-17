package classes;

public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private String telefone;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private boolean ativo;
    private String observacaoEntrega;
    
    public Cliente(int id, String nome, String cpf, String email, 
            String celular, String telefone, String logradouro, String bairro, 
            String cidade, String estado, String cep, boolean ativo, 
            String observacaoEntrega){
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.celular = celular;
            this.telefone = telefone;
            this.logradouro = logradouro;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
            this.ativo = ativo;
            this.observacaoEntrega = observacaoEntrega;
    }
    
    public Cliente(){
        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }
    
    public String getCelular(){
        return this.celular;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
    public boolean getAtivo(){
        return this.ativo;
    }
    
    public String isAtivo(){
        return getAtivo() == true ? "Sim" : "Não";
    }
    
    public void setObservacaoEntrega(String observacaoEntrega){
        this.observacaoEntrega = observacaoEntrega;
    }
    
    public String getObservacaoEntrega(){
        return this.observacaoEntrega;
    }
    
}
