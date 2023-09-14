import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = tc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = tc.nextInt();

        try {

            contar(parametroUm,parametroDois);

        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        int contagem = 0;
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroDois < parametroUm){

            throw new ParametrosInvalidosException();

        }else {
            contagem = parametroDois - parametroUm;
        }
        for (int i = 0; i < contagem; i++) {
            System.out.println("Quamtidade de interações: " + (i+1));
        }

    }
}