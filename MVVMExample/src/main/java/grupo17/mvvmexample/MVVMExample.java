package grupo17.mvvmexample;

import java.util.Scanner;
import model.User;
import view.UserView;
import viewmodel.UserViewModel;

public class MVVMExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User model = new User("", ""); // Cria um modelo inicial vazio
        UserViewModel viewModel = new UserViewModel(model);
        UserView view = new UserView();

        // Vincula o ViewModel à visão
        view.bind(viewModel);

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

            // Atualiza o ViewModel com os dados fornecidos pelo usuário
            viewModel.setUserName(name);
            viewModel.setUserEmail(email);

            // Exibe os dados atualizados na visão
            view.display();
        }

        scanner.close();
        System.out.println("Programa encerrado!");
    }
}
