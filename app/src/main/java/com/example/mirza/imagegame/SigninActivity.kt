package com.example.mirza.imagegame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth

class SigninActivity : AppCompatActivity() {

    val mAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val signIn = findViewById<Button>(R.id.signinbtn)
        val signUp = findViewById<Button>(R.id.signupbtn)
        val emailTxt = findViewById<EditText>(R.id.emailtxt)
        val passwordTxt = findViewById<EditText>(R.id.passwordtxt)

        emailTxt.setOnFocusChangeListener { V, hasFocus ->
            if(hasFocus){
                emailTxt.setTextSize(45f)
            }
            else
            {
                emailTxt.setTextSize(25f) //normal size
            }

        }

        passwordTxt.setOnFocusChangeListener { V, hasFocus ->
            if(hasFocus){
                passwordTxt.setTextSize(45f)
            }
            else
            {
                passwordTxt.setTextSize(25f) //normal size
            }

        }

        signIn.setOnClickListener { v: View? ->
            signIn()
            //startActivity(Intent(this, GameActivity::class.java))
        }
        signUp.setOnClickListener { v: View? ->
            signUp()
        }

    }

    private fun signIn() {
        val emailTxt = findViewById<View>(R.id.emailtxt) as EditText
        val passwordTxt = findViewById<View>(R.id.passwordtxt) as EditText

        var email = emailTxt.text.toString()
        var password = passwordTxt.text.toString()

        if (!email.isEmpty() && !password.isEmpty()) {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, OnCompleteListener { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this, GameActivity::class.java))
                    Toast.makeText(this, "Successfully ", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, " NOT Successfully ", Toast.LENGTH_LONG).show()
                }
            })
        } else {
            Toast.makeText(this, "enter email or password ", Toast.LENGTH_LONG).show()
        }
    }

    private fun signUp() {
        val emailTxt = findViewById<View>(R.id.emailtxt) as EditText
        val passwordTxt = findViewById<View>(R.id.passwordtxt) as EditText

        var email = emailTxt.text.toString()
        var password = passwordTxt.text.toString()

        if (!email.isEmpty() && !password.isEmpty()) {
            mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, OnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "You are registred", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "ERROR", Toast.LENGTH_LONG).show()
                    }
                })
        } else {
            Toast.makeText(this, "enter email or password ", Toast.LENGTH_LONG).show()
        }
    }


}
