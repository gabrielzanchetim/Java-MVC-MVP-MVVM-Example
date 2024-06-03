package viewmodel;

import model.User;
import view.UserViewInterface;

public class UserViewModel {
    private User model;

    public UserViewModel(User model) {
        this.model = model;
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public String getUserEmail() {
        return model.getEmail();
    }

    public void setUserEmail(String email) {
        model.setEmail(email);
    }

    public void updateView(UserViewInterface view) {
        view.printUserDetails(getUserName(), getUserEmail());
    }
}
