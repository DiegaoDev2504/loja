public class Cliente extends Pessoa {

    private String email;

    public Cliente(String nome, String email){
        super(nome); //Chama o construtor de Pessoa, classe que da qual Cliente herda.
        this.email = email;
    }

    public String getEmail(){
        return email;

    }

    //Sobrescrebe o método apresentar

    @Override
    public String apresentar() {
        return "Cliente: " + getNome() + "(" + email +")";

    }

}
