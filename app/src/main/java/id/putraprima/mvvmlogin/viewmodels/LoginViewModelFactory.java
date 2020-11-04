package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.FormLogin;

public class LoginViewModelFactory implements ViewModelProvider.Factory {
    private FormLogin formLogin;

    public LoginViewModelFactory(FormLogin formLogin) {
        this.formLogin = formLogin;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LoginViewModel.class)){
            return (T) new LoginViewModel(formLogin);
        }
        throw new IllegalArgumentException("Viewmodel Yang Diminta MainActivityViewModel");
    }
}
