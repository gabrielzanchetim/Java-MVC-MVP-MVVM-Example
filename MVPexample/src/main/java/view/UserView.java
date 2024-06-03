package view;

public class UserView implements UserViewInterface {
    private Presenter presenter;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void printUserDetails(String userName, String userEmail) {
        System.out.println("User:");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + userEmail);
    }
}