import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Pedido(Cliente cliente){
        this.cliente = cliente;

    }

    public void addProduto(Produto produto){
        produtos.add(produto);

    }

    public double calcularTotal(){
        double total = 0;
        for (Produto p : produtos){
            total += p.getPreco();
        }
        return total;

    }

    public void imprimir(){
        System.out.println("Pedido de " + cliente.getNome());
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + ": R$ " + p.getPreco());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }




}
