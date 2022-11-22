public class Pessoa {

    //atributos da classe
    private String nome;
    private String sobrenome;
    private int idade;



    //construtor da classe
    Pessoa(String name, String surname, int age){
        this.nome = name;
        this.sobrenome = surname;
        this.idade = age;
    }

    //metodos
    public String getInformacoes(){
        return this.nome + " " + this.sobrenome + " tem " + this.idade + " anos";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

}
