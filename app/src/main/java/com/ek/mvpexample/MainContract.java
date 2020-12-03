package com.ek.mvpexample;

public interface MainContract {

    interface View {
        void createToast();
    }

    interface Presenter {
        void onButtonWasClicked();
        void onDestroy();
    }
}
