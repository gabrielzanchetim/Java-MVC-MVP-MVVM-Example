package view;

import viewmodel.UserViewModel;

public class UserView implements UserViewInterface {
    private UserViewModel viewModel;

    @Override
    public void bind(UserViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void printUserDetails(String userName, String userEmail) {
        System.out.println("User:");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + userEmail);
    }

    public void display() {
        printUserDetails(viewModel.getUserName(), viewModel.getUserEmail());
    }
}
