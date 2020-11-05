package id.putraprima.mvvmlogin.viewmodels;

import android.util.Patterns;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.FormLogin;

public class LoginViewModel extends ViewModel {
    public MutableLiveData<FormLogin> formLoginMutableLiveData;
    public FormLogin formLogin = new FormLogin();

    public LoginViewModel() {
        formLoginMutableLiveData = new MutableLiveData<>();
    }

    public LiveData<FormLogin> getFormLoginLiveData(){
        return formLoginMutableLiveData;
    }
    public void login(String username, String password) {

    }


    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}
