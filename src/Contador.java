import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
    try {    
        System.out.println("Insira o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segundo número: ");
        int parametroDois = terminal.nextInt();
        contar(parametroUm,parametroDois);
    
    }catch (ParametrosInvalidosException e){
        System.out.println("Parâmetros inválidos !!");

    }
    
}

    public static void contar (int parametroUm,int parametroDois)throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else 
            for (; parametroUm <= parametroDois; parametroUm++){
                System.out.println("contando: "+parametroUm);                    
            }

    }
}   

