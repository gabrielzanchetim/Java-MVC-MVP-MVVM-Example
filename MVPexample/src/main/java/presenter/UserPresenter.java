package presenter;

import model.User;
import view.UserViewInterface;

public class UserPresenter implements UserViewInterface.Presenter {
    private User model;
    private UserViewInterface view;

    public UserPresenter(User model, UserViewInterface view) {
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void onUserNameChanged(String name) {
        model.setName(name);
    }

    @Override
    public void onUserEmailChanged(String email) {
        model.setEmail(email);
    }

    @Override
    public void updateView() {
        view.printUserDetails(model.getName(), model.getEmail());
    }
}