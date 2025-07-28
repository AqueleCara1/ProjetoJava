import java.util.ArrayList;

public class Carrinho {
    
    private ArrayList<Item> itens;

    public Carrinho(){
    itens = new ArrayList<>();
    }


    public void adicionarItem(Item item){
      itens.add(item);  
      System.out.println(item.getNome()+" Foi adicionado ao carrinho !");
    }

    public void removerItem(int codigo){
        for (int i=0; i<itens.size(); i++){
            if(itens.get(i).getCodigo() == codigo){
                System.out.println(itens.get(i).getNome()+" Foi removido com sucesso !");
                itens.remove(i);
            }
        }
    }

    public void calcularPreco(){
         double valor = 0;
         for (int i=0; i<itens.size(); i++){
            valor += itens.get(i).getPreco();
    }
        System.out.println("O total é R$: "+valor);
}
}