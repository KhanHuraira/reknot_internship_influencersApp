package com.example.influencerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        sendotpbtn();
        otpboxautomove();
        verifyotpbtn();

    }

    private fun otpboxautomove() {

        val edittext22 = findViewById<EditText>(R.id.edittext2_2)
        val edittext23 = findViewById<EditText>(R.id.edittext2_3)
        val edittext24 = findViewById<EditText>(R.id.edittext2_4)
        val edittext25 = findViewById<EditText>(R.id.edittext2_5)
        val edittext26 = findViewById<EditText>(R.id.edittext2_6)
        val edittext27 = findViewById<EditText>(R.id.edittext2_7)

        edittext22.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                edittext23.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

        edittext23.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                edittext24.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

        edittext24.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                edittext25.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

        edittext25.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                edittext26.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

        edittext26.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                edittext27.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

    }

    fun verifyotpbtn() {

        val button22 = findViewById<Button>(R.id.button2_2)

        val edittext22 = findViewById<EditText>(R.id.edittext2_2)
        val edittext23 = findViewById<EditText>(R.id.edittext2_3)
        val edittext24 = findViewById<EditText>(R.id.edittext2_4)
        val edittext25 = findViewById<EditText>(R.id.edittext2_5)
        val edittext26 = findViewById<EditText>(R.id.edittext2_6)
        val edittext27 = findViewById<EditText>(R.id.edittext2_7)

        button22.setOnClickListener {

                if(edittext22.length()==0){
                    edittext22.requestFocus();
                }
                else if(edittext23.length()==0){
                    edittext23.requestFocus();
                }
                else if(edittext24.length()==0){
                    edittext24.requestFocus();
                }
                else if(edittext25.length()==0){
                    edittext25.requestFocus();
                }
                else if(edittext26.length()==0){
                    edittext26.requestFocus();
                }
                else if(edittext27.length()==0){
                    edittext27.requestFocus();
                }
                else{

                    Toast.makeText(this, "OTP verified!", Toast.LENGTH_SHORT).show()

                    val intent= Intent(this,MainActivity3::class.java)
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                    finish()


                }

        }




    }

    fun sendotpbtn() {

        val linearlayout21       = findViewById<LinearLayout>(R.id.linearlayout2_1)
        val linearlayout22       = findViewById<LinearLayout>(R.id.linearlayout2_2)
        val button21             = findViewById<Button>(R.id.button2_1)
        val edittext21           = findViewById<EditText>(R.id.edittext2_1)

        button21.setOnClickListener {

            val phone_no=edittext21.getText().toString();

            if(phone_no.length != 10){
                edittext21.requestFocus();
                edittext21.setError("Enter valid number");
            }
            else{
                Toast.makeText(this, "sending OTP...", Toast.LENGTH_SHORT).show()

                linearlayout21.setVisibility(View.INVISIBLE)

                linearlayout22.setVisibility(View.VISIBLE)
            }

        }
    }
}