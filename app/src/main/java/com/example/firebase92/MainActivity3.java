package com.example.firebase92;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity3 extends AppCompatActivity {
    TextView nameUser;
    TextView posisiUser;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText edit_nama = findViewById(R.id.edit_nama);
        EditText edit_posisi = findViewById(R.id.edit_posisi);
        Button btn_kirim = findViewById(R.id.simpan);
        DAOEmployee doa = new DAOEmployee();

        btn_kirim.setOnClickListener(v -> {
            Employee emp = new Employee(edit_nama.getText().toString(), edit_posisi.getText().toString());
            doa.add(emp).addOnSuccessListener(suc -> { //jika baris atas berhasil maka akan keluar seperti baris dibawah :
                Toast.makeText(this, "berhasil input", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er -> { //jika baris 32 gagal maka akan muncul seperti baris di bawah:
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}
            /*HashMap<String,Object>hashMap = new HashMap<>();
            hashMap.put("nama", edit_nama.getText().toString());
            hashMap.put("posisi", edit_posisi.getText().toString());
            doa.update("-NEjE3-uHSvlXr1nEHY0", hashMap).addOnSuccessListener(suc->{
                Toast.makeText(this, "berhasil di update", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener( er-> {
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });

            doa.remove("-NEjE3-uHSvlXr1nEHY0").addOnSuccessListener(suc->{
                Toast.makeText(this, "berhasil di hapus", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener( er-> {
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });


        });
            };
        */

