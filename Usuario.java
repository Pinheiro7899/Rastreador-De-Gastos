package br.uam.mooca.planilha;


public class Usuario {

    private String nome;
    private String email;
    private String senha; // apenas para testes

    /* Construtores */
    public Usuario() {}

    public Usuario(String nome, String email, String senha) {
        this.nome  = nome;
        this.email = email;
        this.senha = senha;
    }

    /* Getters / Setters */
    public String getNome()  { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    /* Utilidades */
    @Override
    public String toString() {
        return String.format("Usuario{nome='%s', email='%s'}", nome, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario other = (Usuario) o;
        return email != null && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return email == null ? 0 : email.hashCode();
    }
}