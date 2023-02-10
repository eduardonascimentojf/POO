package br.ufjf.dcc.poo.aula10.exercicioEnum;



public class Planeta {
    EnumPlanetas planeta;

    public Planeta(String planeta) {
        this.planeta = EnumPlanetas.valueOf(planeta);
    }

    public void viajarPlaneta(){
        switch (this.planeta){
            case MERCURIO -> System.out.println("É o menor dos planetas!");
            case MARTE -> System.out.println("É o planeta preferido da SpaceX, Twitter e Tesla");
            case TERRA -> System.out.println("É Habitavel!");
            case URANO -> System.out.println("É o planeta mais frio!");
            case SATURNO -> System.out.println("É conhecido pelo seus anéis que foi dividido em sete grupos de anéis principais!");
            case VENUS -> System.out.println("É o planeta mais quente!");
            case NETUNO -> System.out.println("É o mais distante do sol!");
            case JUPITER -> System.out.println("É o maior planeta!");
            default -> System.out.println("Planeta não existente!");
        }
    }
}
