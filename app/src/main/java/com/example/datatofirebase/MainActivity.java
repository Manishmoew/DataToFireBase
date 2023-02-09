package com.example.datatofirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.datatofirebase.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {


   ActivityMainBinding binding;
   String FirstName,Email,Age,PhoneNumber,userName;
   FirebaseDatabase db;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstName = binding.inputName.getText().toString();
                Email = binding.inputEmail.getText().toString();
                Age = binding.inputAge.getText().toString();
                PhoneNumber = binding.PhoneNumber.getText().toString();
                userName = binding.userName.getText().toString();

                if (!FirstName.isEmpty() && !Email.isEmpty()&& !Age.isEmpty() && !PhoneNumber.isEmpty() && !userName.isEmpty()){


                    Users users = new Users(FirstName,Email,Age,PhoneNumber,userName);
                    db = FirebaseDatabase.getInstance();
                    reference=db.getReference("Users");
                    reference.child(userName).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.inputName.setText("");
                            binding.inputEmail.setText("");
                            binding.inputAge.setText("");
                            binding.PhoneNumber.setText("");
                            binding.userName.setText("");


                            Toast.makeText(MainActivity.this,"Successfully updated",Toast.LENGTH_LONG).show();
                        }
                    });


                }


            }
        });




    }
}