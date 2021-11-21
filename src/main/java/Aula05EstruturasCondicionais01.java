
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado para comprar bebida alcoolica");
        } else {
            System.out.println("Nao autorizado para comprar bebida alcoolica");
        }
    }
}
