package br.ufjf.dcc.poo.aula10.exercicioRecord.exercicioInterfaces;



public class Principal {
    public static void main(String[] args) {
        System.out.println("\nUsando Class\n");

        ProdutoClasse produtoClasse = new ProdutoClasse("Produto Classe", 500);
        produtoClasse.setNome("Produto Classe 1");
        produtoClasse.setValor(501);
        System.out.println("Print do nome do produto usando classe " + produtoClasse.getNome());
        System.out.println("Print do valor do produto usando classe " + produtoClasse.getValor());
        produtoClasse.fazAlgo();
        ProdutoClasse produtoClasse2 = new ProdutoClasse("Produto Classe dois", 500);
        ProdutoClasse produtoClasse3 = new ProdutoClasse("Produto Classe", 500);
        System.out.println("Compara o objeto: produtoClasse com produtoClasse2: "+ produtoClasse.equals(produtoClasse2));
        System.out.println("Compara o objeto: produtoClasse com produtoClasse3: "+ produtoClasse.equals(produtoClasse3));
        System.out.println("Print hash code usando classe: "+ produtoClasse.hashCode());
        System.out.println("Print transforma objeto em string usando classe: "+ produtoClasse.toString());

        System.out.println("\n\nUsando Record \n");

//      Formas de instanciar um record
//      (Essas diferentes formas so é possivel pelos codigos no Record para diferentes tipos de construtores)
        ProdutoRecord produtoRecord = new ProdutoRecord("Produto Record", 500 );
//        ProdutoRecord produtoRecord = new ProdutoRecord();
//        ProdutoRecord produtoRecord = new ProdutoRecord("Produto Record" );
//        ProdutoRecord produtoRecord = new ProdutoRecord(500 );
        System.out.println("Print do nome do produto usando Record " + produtoRecord.Nome());
        System.out.println("Print do Valor do produto usando Record " + produtoRecord.valor());
        produtoRecord.fazAlgo();
        ProdutoRecord produtoRecord2 = new ProdutoRecord();
        ProdutoRecord produtoRecord3 = new ProdutoRecord("Produto Record", 500 );
        System.out.println("Compara o objeto: produtoRecord com produtoClasse2: "+ produtoRecord.equals(produtoRecord2));
        System.out.println("Compara o objeto: produtoClasse com produtoClasse3: "+ produtoRecord.equals(produtoRecord3));
        System.out.println("Print hash code usando Record: "+ produtoRecord.hashCode());
        System.out.println("Print transforma objeto em string usando Record: "+ produtoRecord.toString());


    }
}
