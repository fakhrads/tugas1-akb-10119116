// NAMA : FAKHRI ADI SAPUTRA
// KELAS : IF-03
// NIM : 10119116
// TANGGAL : 23-04-2022
package id.fakhrads.tugas10119116;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
            actionBar.hide();
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent login = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(login);
                finish();

            }
        },waktu_loading);
    }
}