package com.example.test123;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test123.R;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        String nik = intent.getStringExtra("NIK");
        String namaLengkap = intent.getStringExtra("NAMA");
        String tanggalLahir = intent.getStringExtra("TANGGAL_LAHIR");
        String tempatLahir = intent.getStringExtra("TEMPAT_LAHIR");
        String alamat = intent.getStringExtra("ALAMAT");
        String usia = intent.getStringExtra("USIA");
        String jenisKelamin = intent.getStringExtra("JENIS_KELAMIN");
        String kewarganegaraan = intent.getStringExtra("KEWARGANEGARAAN");
        String kompetensi = intent.getStringExtra("KOMPETENSI");
        String email = intent.getStringExtra("EMAIL");

        // Menampilkan data di TextView
        TextView textViewNik = findViewById(R.id.vNik);
        textViewNik.setText(nik);

        TextView textViewNama = findViewById(R.id.vNama);
        textViewNama.setText(namaLengkap);

        TextView textViewTglLahir = findViewById(R.id.vBirthday);
        textViewTglLahir.setText(tanggalLahir);

        TextView textViewTempatLahir = findViewById(R.id.vTempatLahir);
        textViewTempatLahir.setText(tempatLahir);

        TextView textViewAlamat = findViewById(R.id.vAlamat);
        textViewAlamat.setText(alamat);

        TextView textViewUsia = findViewById(R.id.vUsia);
        textViewUsia.setText(usia);

        TextView textViewJenisKelamin = findViewById(R.id.vJenis);
        textViewJenisKelamin.setText(jenisKelamin);

        TextView textViewKewarganegaraan = findViewById(R.id.Kewarga);
        textViewKewarganegaraan.setText(kewarganegaraan);

        TextView textViewKompetensi = findViewById(R.id.vBidang);
        textViewKompetensi.setText(kompetensi);

        TextView textViewEmail = findViewById(R.id.Email);
        textViewEmail.setText(email);

        Button btnBack = findViewById(R.id.kembali);
        btnBack.setOnClickListener(v -> finish());

    }
}

/* package com.example.test123;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        String nik = intent.getStringExtra("NIK");
        String namaLengkap = intent.getStringExtra("NAMA");
        String tanggalLahir = intent.getStringExtra("TANGGAL_LAHIR");
        String tempatLahir = intent.getStringExtra("TEMPAT_LAHIR");
        String alamat = intent.getStringExtra("ALAMAT");
        String usia = intent.getStringExtra("USIA");
        String jenisKelamin = intent.getStringExtra("JENIS_KELAMIN");
        String kewarganegaraan = intent.getStringExtra("KEWARGANEGARAAN");
        String kompetensi = intent.getStringExtra("KOMPETENSI");
        String email = intent.getStringExtra("EMAIL");

        // Menampilkan data di TextView
        TextView textViewNik = findViewById(R.id.vNik);
        textViewNik.setText(nik);

        TextView textViewNama = findViewById(R.id.vNama);
        textViewNama.setText(namaLengkap);

        TextView textViewTglLahir = findViewById(R.id.vBirthday);
        textViewTglLahir.setText(tanggalLahir);

        TextView textViewTempatLahir = findViewById(R.id.vTempatLahir);
        textViewTempatLahir.setText(tempatLahir);

        TextView textViewAlamat = findViewById(R.id.vAlamat);
        textViewAlamat.setText(alamat);

        TextView textViewUsia = findViewById(R.id.vUsia);
        textViewUsia.setText(usia);

        TextView textViewJenisKelamin = findViewById(R.id.vJenis);
        textViewJenisKelamin.setText(jenisKelamin);

        TextView textViewKewarganegaraan = findViewById(R.id.Kewarga);
        textViewKewarganegaraan.setText(kewarganegaraan);

        TextView textViewKompetensi = findViewById(R.id.vBidang);
        textViewKompetensi.setText(kompetensi);

        TextView textViewEmail = findViewById(R.id.Email);
        textViewEmail.setText(email);

        Button btnBack = findViewById(R.id.kembali);
        btnBack.setOnClickListener(v -> finish());

    }
}


 */