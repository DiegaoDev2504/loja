//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando objetos para usar como exemplo
        Cliente cliente = new Cliente("Ana", "ana@gmail.com");
        Produto notebook = new Produto("Notebook", 2900.50);
        Produto mouse = new Produto("mouse", 45.90);

        //Polimorfismo: variável do tipo Pessoa executa um método de Cliente;
        Pessoa pessoa = cliente;
        System.out.println(pessoa.apresentar());
        System.out.println();

        //Montando o pedido
        Pedido pedido = new Pedido(cliente);
        pedido.addProduto(notebook);
        pedido.addProduto(mouse);
        pedido.imprimir();
        System.out.println();

        //Encapsulamento: uso do setter do valor negativo para o produto
        mouse.setPreco(-10);



    }
}