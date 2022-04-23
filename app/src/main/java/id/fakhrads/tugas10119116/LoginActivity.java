// NAMA : FAKHRI ADI SAPUTRA
// KELAS : IF-03
// NIM : 10119116
// TANGGAL : 23-04-2022
package id.fakhrads.tugas10119116;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void toMain(View view) {
        Intent Main = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(Main);
        finish();
    }

    public void toRegister(View view) {
        Intent Register = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(Register);
    }
}