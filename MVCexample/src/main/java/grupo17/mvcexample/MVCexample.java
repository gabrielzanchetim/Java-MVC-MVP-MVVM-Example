package grupo17.mvcexample;

import controller.UserController;
import model.User;
import view.UserView;
import java.util.Scanner;

public class MVCexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User model = new User("", ""); // Cria um modelo inicial vazio
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        while (true) {
            System.out.println("(Digite 0 para sair)");

            System.out.print("Enter User Name: ");
            String name = scanner.nextLine();
            if (name.equals("0")) {
                break;
            }

            System.out.print("Enter User Email: ");
            String email = scanner.nextLine();
            if (email.equals("0")) {
                break;
            }

            // Atualiza o modelo com os dados fornecidos pelo usuário
            controller.setUserName(name);
            controller.setUserEmail(email);

            // Atualiza a visão com os novos dados
            controller.updateView();
        }
        scanner.close();
        System.out.println("Programa encerrado!");
    }
}
