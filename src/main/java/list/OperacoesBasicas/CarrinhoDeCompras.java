package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoItem;

    public CarrinhoDeCompras(){
        this.carrinhoItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item i : carrinhoItem) {
            if(i.getNome().equalsIgnoreCase(nome)){
//                carrinhoItem.;
            }
        }
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Leite", 9.50,4);
    }
}
