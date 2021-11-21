
public class ExercicioAula05 {
    public static void main(String[] args) {

        System.out.println("Problema:");
        System.out.println("******Se idade jogador for menor que 15: CATEGORIA INFANTIL:");
        System.out.println("******Se idade jogador for maior que 15 e menor que 18: CATEGORIA JUVENIL:");
        System.out.println("******Se idade jogador for maior que 18: CATEGORIA ADULTO");

        int idade = 10;
        String categoria;
        if (idade < 15){
            categoria = "Jogador com idade de "+idade+" anos: ****CATEGORIA INFANTIL****";
        } else if(idade > 15 && idade < 18){
            categoria ="Jogador com idade de "+idade+" anos: ****CATEGORIA JUVENIL****";
        } else{
            categoria ="Jogador com idade de "+idade+" anos: ****CATEGORIA ADULTO****";
        }
        System.out.println(categoria);
    }
}
