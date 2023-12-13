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
        DatosUser datosUser = new DatosUser(this);
        String user1 = editTextUser1.getText().toString();
        String password1 = editTextPassword1.getText().toString();

        EntidadUser entidadUser = new EntidadUser(user1, password1);

        long count = datosUser.insert(entidadUser);

        if (count == 0) {
            Toast.makeText(this, "Este registro no fue almacenado", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Este registro fue almacenado", Toast.LENGTH_SHORT).show();
        }
    }

}