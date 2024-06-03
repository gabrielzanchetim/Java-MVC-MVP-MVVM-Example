package view;

/*
    Classe responsável pela visão, 
    deve exibir os detalhes do usuário
*/
public class UserView {
    public void printUserDetails(String userName, String userEmail) {
        System.out.println("------------------USER------------------");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + userEmail);
        System.out.println("----------------------------------------");
    }
}