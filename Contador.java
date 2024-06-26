import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosContador Exception){
            System.err.println("O segundo parametro deve ser maior que o primeiro.");
        }
        terminal.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosContador{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosContador();
        }
        int contagem = parametroDois - parametroUm;
        for(int i=0; i<= contagem; i++){
            System.out.println(i);
        }
    }
}
