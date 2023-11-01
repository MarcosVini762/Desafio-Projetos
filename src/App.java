// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor1 = new Scanner(System.in);
        
        int C = leitor1.nextInt();
        
        leitor1.nextLine();
        
        int contador = 0;
		
		//C++;
        
		String[] nome = new String[C];
        
		while (contador < C) {
            nome[contador] = leitor1.nextLine();
            
			contador++;
        }
		
        for (int i = 0; i < C; i++) {
            
            int espaço = nome[i].indexOf(" ");

            String verificador = nome[i].substring(0,espaço);
            
            if (verificador.equals("Thor")) {
                System.out.println("Y");
            } 
            else {
                System.out.println("N");
            }
        }
    }
}