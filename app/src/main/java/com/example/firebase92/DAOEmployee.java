package com.example.firebase92;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap; //

public class DAOEmployee {
    private DatabaseReference databaseReference;

    public DAOEmployee() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Employee.class.getSimpleName()); //mengoneksikan database dengan android studio
    }

    public Task<Void> add(Employee emp) {
        return databaseReference.push().setValue(emp);
    }

    public Task<Void> update(String key, HashMap<String, Object> hashMap) { //di sini diambil keynya dan diganti dengan string
        return databaseReference.child(key).updateChildren(hashMap);

    }

    public Task<Void> remove(String key) {
        return databaseReference.child(key).removeValue(); //akan menghapus sesuai dengn key nya
    }
}
