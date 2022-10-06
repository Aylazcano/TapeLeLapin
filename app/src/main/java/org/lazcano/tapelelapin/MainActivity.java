 package org.lazcano.tapelelapin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.lazcano.tapelelapin.databinding.ActivityMainBinding;

 public class MainActivity extends AppCompatActivity {

     ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}