package ru.quizactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.annotation.ElementType;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;
    private EditText repeatPassword;
    private TextView questionTextView;
    private AlertDialog sos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        login = findViewById(R.id.password);
        login = findViewById(R.id.repear_password);
        sos.setView(login);
        // create alert dialog
        AlertDialog alertDialog = sos;
        // show it
        alertDialog.show();

    }

}