import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Para imprimir uma contagem, digite dois números inteiros. O primeiro número subtraído do segundo resultará no total da contagem:");
            
            System.out.println("Digite o primeiro número:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo número:");
            int parametroDois = terminal.nextInt();
                
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } catch (InputMismatchException e) {
            System.out.println("Os valores inseridos devem ser números inteiros");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;

            for(int i=0; i<contagem; i++) {
                System.out.println("Imprimindo contagem: " + (i+1));
            }
        }
    }    
}

