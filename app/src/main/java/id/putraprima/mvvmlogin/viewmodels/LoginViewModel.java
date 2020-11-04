package id.putraprima.mvvmlogin.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.FormLogin;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<FormLogin> formLoginMutableLiveData = new MutableLiveData<>();
    private FormLogin formLogin;

    public LoginViewModel(FormLogin formLogin) {
        this.formLogin = formLogin;
        this.formLoginMutableLiveData.setValue(this.formLogin);

    }

    public void doLogin(){
        this.formLogin.setName(this.formLogin.getName());
        this.formLogin.setPassword(this.formLogin.getPassword());
        this.formLoginMutableLiveData.setValue(this.formLogin);

//        Log.d("NAME Count", String.valueOf(this.getFormLogin()));
//        Log.d("PASSWORD Count", String.valueOf(this.getFormLogin()));

    }

    public LiveData<FormLogin> formLoginLiveData(){
        return this.formLoginMutableLiveData;
    }
}
