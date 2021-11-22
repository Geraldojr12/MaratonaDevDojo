public class Aula05EstruturasCondicionais04 {
  // I want to know how much I have to pay in the Netherlands 2020 based on any annual salary
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual >= 347134 && salarioAnual <= 68508){
            valorImposto = salarioAnual * segundaFaixa;
        } else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
