package com.example.mirza.imagegame

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.koushikdutta.ion.Ion
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        Ion.with(tigerimage).placeholder(R.mipmap.ic_launcher)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Royal_Bengal_Tiger_at_Kanha_National_Park.jpg/1280px-Royal_Bengal_Tiger_at_Kanha_National_Park.jpg")

        Ion.with(koalaimage).placeholder(R.mipmap.ic_launcher)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Friendly_Female_Koala.JPG/800px-Friendly_Female_Koala.JPG")

        Ion.with(zebrarimage).placeholder(R.mipmap.ic_launcher)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Equus_zebra_-_Disney%27s_Animal_Kingdom_Lodge%2C_Orlando%2C_Florida%2C_USA_-_20100119.jpg/270px-Equus_zebra_-_Disney%27s_Animal_Kingdom_Lodge%2C_Orlando%2C_Florida%2C_USA_-_20100119.jpg")

        Ion.with(ciyviimage).placeholder(R.mipmap.ic_launcher)
            .load("https://upload.wikimedia.org/wikipedia/commons/f/f6/Eastern_Gray_Squirrel_800.jpg")

        Ion.with(lomirimage).placeholder(R.mipmap.ic_launcher)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Male_Lion_on_Rock.jpg/1280px-Male_Lion_on_Rock.jpg")

        Ion.with(iaguariimage).placeholder(R.mipmap.ic_launcher)
            .load("https://upload.wikimedia.org/wikipedia/commons/0/0a/Standing_jaguar.jpg")

        val tiger = findViewById<EditText>(R.id.tigertxt)
        val koala = findViewById<EditText>(R.id.koalatxt)
        val zebra = findViewById<EditText>(R.id.zebratxt)
        val ciyvi = findViewById<EditText>(R.id.ciyvitxt)
        val lomi = findViewById<EditText>(R.id.lomitxt)
        val iaguari = findViewById<EditText>(R.id.iaguaritxt)
        val a: Int = 0
        // tigertxt.getBackground().mutate().setColorFilter(getResources().getColor(android.R.color.holo_red_light), PorterDuff.Mode.SRC_ATOP)
        // tigertxt.getBackground().mutate().setColorFilter(getResources().getColor(android.R.color.holo_green_light), PorterDuff.Mode.SRC_ATOP)

        tigertxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (tigertxt.getText().toString().equals("vefxvi") or tigertxt.getText().toString().equals("ვეფხვი")) {
                    tigertxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_green_light),
                        PorterDuff.Mode.SRC_ATOP
                    )

                } else
                    tigertxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_red_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        koalatxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (koalatxt.getText().toString().equals("koala") or koalatxt.getText().toString().equals("კოალა")) {
                    koalatxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_green_light),
                        PorterDuff.Mode.SRC_ATOP
                    )

                } else
                    koalatxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_red_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        zebratxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (zebratxt.getText().toString().equals("zebra") or zebratxt.getText().toString().equals("ზებრა")) {
                    zebratxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_green_light),
                        PorterDuff.Mode.SRC_ATOP
                    )

                } else
                    zebratxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_red_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        ciyvitxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (ciyvitxt.getText().toString().equals("ciyvi") or ciyvitxt.getText().toString().equals("ციყვი")) {
                    ciyvitxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_green_light),
                        PorterDuff.Mode.SRC_ATOP
                    )

                } else
                    ciyvitxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_red_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        lomitxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (lomitxt.getText().toString().equals("lomi") or lomitxt.getText().toString().equals("ლომი")) {
                    lomitxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_green_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
                } else
                    lomitxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_red_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        iaguaritxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (iaguaritxt.getText().toString().equals("iaguari") or iaguaritxt.getText().toString().equals("იაგუარი")) {
                    iaguaritxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_green_light),
                        PorterDuff.Mode.SRC_ATOP
                    )

                } else
                    iaguaritxt.getBackground().mutate().setColorFilter(
                        getResources().getColor(android.R.color.holo_red_light),
                        PorterDuff.Mode.SRC_ATOP
                    )
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

    }
}


//image links
/*
https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Royal_Bengal_Tiger_at_Kanha_National_Park.jpg/1280px-Royal_Bengal_Tiger_at_Kanha_National_Park.jpg
https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Friendly_Female_Koala.JPG/800px-Friendly_Female_Koala.JPG
https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Equus_zebra_-_Disney%27s_Animal_Kingdom_Lodge%2C_Orlando%2C_Florida%2C_USA_-_20100119.jpg/270px-Equus_zebra_-_Disney%27s_Animal_Kingdom_Lodge%2C_Orlando%2C_Florida%2C_USA_-_20100119.jpg
https://upload.wikimedia.org/wikipedia/commons/f/f6/Eastern_Gray_Squirrel_800.jpg
https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Male_Lion_on_Rock.jpg/1280px-Male_Lion_on_Rock.jpg
https://upload.wikimedia.org/wikipedia/commons/0/0a/Standing_jaguar.jpg
 */
