package controller;

/*
    Classe que: recebe entradas, atualiza o modelo de dados 
    e instrui a visão para exibir a informação atualizada
*/
import model.User;
import view.UserView;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserEmail(String email) {
        model.setEmail(email);
    }

    public String getUserEmail() {
        return model.getEmail();
    }

    public void updateView() {
        view.printUserDetails(model.getName(), model.getEmail());
    }
}