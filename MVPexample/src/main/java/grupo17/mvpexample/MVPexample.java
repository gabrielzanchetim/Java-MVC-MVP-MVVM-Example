package grupo17.mvpexample;

import java.util.Scanner;
import model.User;
import presenter.UserPresenter;
import view.UserView;

public class MVPexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User model = new User("", ""); // Cria um modelo inicial vazio
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(model, view);

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

            // Atualiza o modelo através do apresentador
            presenter.onUserNameChanged(name);
            presenter.onUserEmailChanged(email);

            // Atualiza a visão através do apresentador
            presenter.updateView();
        }

        scanner.close();
        System.out.println("Programa encerrado!");
    }
}
