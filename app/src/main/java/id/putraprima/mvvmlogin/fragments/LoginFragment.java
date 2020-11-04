package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.models.FormLogin;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModel;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModelFactory;

public class LoginFragment extends Fragment {
    private LoginViewModel loginViewModel;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_login, container, false);
        final FragmentLoginBinding binding = FragmentLoginBinding.inflate(inflater, container, false);
        final View view = binding.getRoot();
        //
        LoginViewModelFactory mainActivityViewModelFactory = new LoginViewModelFactory(new FormLogin());
        loginViewModel = new ViewModelProvider(this, mainActivityViewModelFactory).get(LoginViewModel.class);
        binding.setViewModel(loginViewModel);
        binding.setLifecycleOwner(this);

//        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putString("Input Email", binding.editTextEmail.getText().toString());
//                bundle.putString("Input Password", binding.editTextPassword.getText().toString());
//                Navigation.findNavController(view).navigate(R.id.loginFragment, bundle);
//            }
//        });
        return view;
    }

}