package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practical3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate = load UI to memory
        binding = ActivityMainBinding.inflate(layoutInflater)
        //show the UI
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener {

            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            var smoker = binding.checkBoxSmoker.isChecked
            var premium = 0
            var textViewPremium: TextView = findViewById(R.id.textViewPremium)

            if(age == 0){
                premium += 60
            }

            else if(age == 1){
                premium += 70
            }

            else if(age == 2){
                premium += 90
            }

            else if(age == 3){
                premium += 120
            }

            else if(age == 4 && age == 5){
                premium += 150
            }

            if(gender == binding.radioButtonMale.id){

                 if(age == 1){
                    premium += 50
                }

                else if(age == 2){
                    premium += 100
                }

                else if(age == 3){
                    premium += 150
                }

                else if(age == 4 && age == 5){
                    premium += 200
                }
            }

            if(smoker){

                if(age == 1){
                    premium += 100
                }

                else if(age == 2){
                    premium += 150
                }

                else if(age == 3){
                    premium += 200
                }

                else if(age == 4 ){
                    premium += 250
                }

                else if(age == 5 ){
                    premium += 300
                }
            }

            binding.textViewPremium.text = String.format("RM %.d", premium)
        }

        binding.buttonReset.setOnClickListener {

            binding.spinnerAge.selectedItemPosition == 0
        }
    }
}