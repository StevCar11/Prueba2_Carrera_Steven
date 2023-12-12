package esteban.g.cannongame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText editTextUser1, editTextPassword1;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUser1 = findViewById(R.id.editText_User);
        editTextPassword1 = findViewById(R.id.editText_Password);

        sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);

        String savedUser = sharedPreferences.getString("lastUser", "");
        String savedPassword = sharedPreferences.getString("lastPassword", "");

        editTextUser1.setText(savedUser);
        editTextPassword1.setText(savedPassword);
    }
}