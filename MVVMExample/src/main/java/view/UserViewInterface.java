package view;

import viewmodel.UserViewModel;

public interface UserViewInterface {
    void printUserDetails(String userName, String userEmail);
    void bind(UserViewModel viewModel);
}
