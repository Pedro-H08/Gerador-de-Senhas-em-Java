
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        String[] caracteres = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z", "!", "@", "#","$","%","&","*","_","/","[","]","{","}","0","1","2","3","4","5","6","7","8","9"};

        Random gerador = new Random();

        String valor = null;

        String[] senha = {valor, valor, valor, valor, valor, valor, valor, valor, valor, valor, valor, valor};

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Gerar senha?");
            String gerarSenha = sc.nextLine();

            if (gerarSenha.equalsIgnoreCase("sim")||gerarSenha.equalsIgnoreCase("s")){
                for (int i = 0; i < 12; i++){
                    int indice = gerador.nextInt(75);
                    String caracter = caracteres[indice];
                    senha[i] = caracter;

                }
                System.out.println(String.join("", senha));


            } else if (gerarSenha.equalsIgnoreCase("não")||gerarSenha.equalsIgnoreCase("n")|| gerarSenha.equalsIgnoreCase("nao")) {
                sc.close();
                break;

            }
            else{
                System.out.println("Entrada inválida.");
            }

        }while (true);
        


    }
}