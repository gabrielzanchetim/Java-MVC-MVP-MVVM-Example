package view;

public interface UserViewInterface {
    void printUserDetails(String userName, String userEmail);
    void setPresenter(Presenter presenter);

    interface Presenter {
        void onUserNameChanged(String name);
        void onUserEmailChanged(String email);
        void updateView();
    }
}
