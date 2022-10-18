package classes;

public class Incidente {
    
    private int id;
    private String prioridade;
    private String requisitante;
    private String departamento;
    private String cargo;
    private String email;
    private String telefone;
    private String descricao;
    private String areaServico;
    private String tipoServico;
    
    
    public Incidente(int id, String prioridade, String requisitante, String departamento, 
            String cargo, String email, String telefone, String descricao,
            String areaServico, String tipoServico){
            this.id = id;
            this.prioridade = prioridade;
            this.requisitante = requisitante;
            this.departamento = departamento;
            this.cargo = cargo;
            this.email = email;
            this.telefone = telefone;
            this.descricao = descricao;
            this.areaServico = areaServico;
            this.tipoServico = tipoServico;
    }
    
    public Incidente(){
        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;
    }
    
    public String getPrioridade(){
        return this.prioridade;
    }
    
    public void setRequisitante(String requisitante){
        this.requisitante = requisitante;
    }
    
    public String getRequisitante(){
        return this.requisitante;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getAreaServico(){
        return this.areaServico;
    }
    
    public void setAreaServico(String areaServico){
        this.areaServico = areaServico;
    }
    
    public String getTipoServico(){
        return this.tipoServico;
    }
    
    public void setTipoServico(String tipoServico){
        this.tipoServico = tipoServico;
    }
}
