package esteban.g.cannongame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    public void onClickButtonOkGCKE(View view) {
        DatosGCKE datosGCKE = new DatosGCKE(this);
        String userGCKE = editTextUserGCKE.getText().toString();
        String passwordGCKE = editTextPasswordGCKE.getText().toString();

        EntidadGCKE entidadGCKE = new EntidadGCKE(userGCKE, passwordGCKE);

        long count = datosGCKE.insert(entidadGCKE);

        if (count == 0) {
            Toast.makeText(this, "Registro no insertado", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Registro insertado", Toast.LENGTH_SHORT).show();
        }
    }

}