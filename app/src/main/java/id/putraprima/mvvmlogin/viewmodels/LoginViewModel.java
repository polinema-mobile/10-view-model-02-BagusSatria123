package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.FormLogin;

public class LoginViewModel extends ViewModel {

    public FormLogin formLogin;

    public LoginViewModel(FormLogin formLogin) {
        this.formLogin = formLogin;
    }

}
