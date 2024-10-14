package curso.java.one.aulafilme.modelos.calc;

public class Recomendacao {


    public void filtro(Classificar classificar){
        if(classificar.getClassificacao() >= 4){
            System.out.println("Muito popular no momento.");
        }else if (classificar.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento.");
        }else{
            System.out.println("Ainda sem avaliações, assiste e comente se gostou");
        }
    }
        }
