package com.ashmit.notesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.ashmit.notesapp.databinding.ActivityMainBinding

//import com.google.android.gms.dynamic.SupportFragmentWrapper

class MainActivity : AppCompatActivity() {
    //ActivityMainBinding is a generated binding class that allows you to access views in your layout (activity_main.xml) directly without using findViewById. thats why
    lateinit var binding : ActivityMainBinding
    lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)//used to set up view binding for your MainActivity. This allows you to easily access the views defined in your activity_main.xml layout without having to use findViewById.


        setContentView(binding.root) //sets the root view of your activity to the root view of the layout inflated using view binding (binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    //creating a fragment for Login page
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.main ,LoginFragment())
            .commit();

        //in this we have used the R.id.main without findviewbyid , saying set the loginfragment in change of main in mainLAyout

    }


}

