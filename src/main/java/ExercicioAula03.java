
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

import java.util.Date;

public class ExercicioAula03 {

    public static void main(String args[]){
        String nome = "Junior";
        String endereco = "Av Chapadao";
        double salario = 5431.12;
        String dataRecebimentoSalario = "20/12/2020";

        String relatorio = "Eu " +nome+ " morando no endereco "+endereco+ " confirmo que recebi o salário de "+salario+ " na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }
}
