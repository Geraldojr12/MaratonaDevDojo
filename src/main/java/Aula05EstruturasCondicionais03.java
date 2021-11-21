public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {
        // Doar salario > 5000
        double salario = 500;
        String doarSalario = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter!";

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda nao tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
