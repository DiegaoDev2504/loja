public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

   }

   public double getPreco(){
        return preco;

   }

   public String getNome(){
        return nome;
   }

    public void setPreco(double preco){
        if(preco <= 0) {
            System.out.println("Preço inválido! Usando R$1,00.");
            preco = 1.0;
        }
        this.preco = preco;
    }
}
