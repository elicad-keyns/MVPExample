package com.ek.mvpexample;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mainView;

    public MainPresenter(MainContract.View mView) {
        this.mainView = mView;
    }

    @Override
    public void onButtonWasClicked() {
        mainView.createToast();
    }

    @Override
    public void onDestroy() {
        // Если вьюшка умирает, дисконнектимся от бд или отписываемся от rxJava, в этом методе боремся  утечкой памяти
    }
}
