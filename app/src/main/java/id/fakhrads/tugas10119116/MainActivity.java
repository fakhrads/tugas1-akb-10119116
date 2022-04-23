// NAMA : FAKHRI ADI SAPUTRA
// KELAS : IF-03
// NIM : 10119116
// TANGGAL : 23-04-2022
package id.fakhrads.tugas10119116;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toProfile(View view) {

        Intent Profile = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(Profile);
        finish();
    }

    public void toLogin(View view) {
        Intent login = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(login);
        finish();
    }
}