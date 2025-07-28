public class Lanchonete {

    public static void main(String[] args){
        System.out.println("Itens");
        Item item1 = new Item("Xsalada", 15.00, 1);
        Item item2 = new Item("Xbacon", 17.00, 2);
        Item item3 = new Item("Coca-Cola", 4.00, 3);
        Item item4 = new Item("Guarana", 6.00, 4);
        Carrinho a = new Carrinho();
            a.adicionarItem(item1);
            a.adicionarItem(item2);
            a.adicionarItem(item3);
            a.adicionarItem(item4);

            a.removerItem(3);

        a.calcularPreco();
    }
}
