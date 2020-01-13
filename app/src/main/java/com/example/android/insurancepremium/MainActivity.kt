package com.example.android.insurancepremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //enum class

        var reset = findViewById<Button>(R.id.buttonReset)
        reset.setOnClickListener {
            spinnerAge.setSelection(0)
            radioButtonMale.isChecked=false;
            radioButtonFemale.isChecked=false;
            checkBoxSmoker.isChecked=false;

            textViewPremium.text= "Insurance Premium: "
        }

        fun calculate(view: View){
            if(spinnerAge.selectedItem.equals("Less than 17")){
                val insurance=60;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }

            if(spinnerAge.selectedItem.equals("17 - 25")){
                val insurance=70;
                textViewPremium.text="Insurance Premium: RM "+ insurance
            }
            else if(spinnerAge.selectedItem.toString().equals("17 - 25")&&(radioButtonMale.isSelected)){
                val insurance=120;
                textViewPremium.text="Insurance Premium: RM "+ insurance
            }
            else if(spinnerAge.selectedItem.toString().equals("17 - 25")&&(radioButtonMale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=220;
                textViewPremium.text="Insurance Premium: RM "+ insurance
            }
            else if(spinnerAge.selectedItem.toString().equals("17 - 25")&&(radioButtonFemale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=170;
                textViewPremium.text="Insurance Premium: RM "+ insurance
            }


            if(spinnerAge.selectedItem.equals("26 - 30")){
                val insurance=90;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("26 - 30")&&(radioButtonMale.isSelected)){
                val insurance=190;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("26 - 30")&&(radioButtonMale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=340;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("26 - 30")&&(radioButtonFemale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=240;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }


            if(spinnerAge.selectedItem.equals("31 - 40")){
                val insurance=120;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("31 - 40")&&(radioButtonMale.isSelected)){
                val insurance=270;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("31 - 40")&&(radioButtonMale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=470;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("31 - 40")&&(radioButtonFemale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=320;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }


            if(spinnerAge.selectedItem.equals("41 - 55")){
                val insurance=150;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("41 - 55")&&(radioButtonMale.isSelected)){
                val insurance=350;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("41 - 55")&&(radioButtonMale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=600;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("41 - 55")&&(radioButtonFemale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=400;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }


            if(spinnerAge.selectedItem.equals("More than 55")){
                val insurance=150;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("More than 55")&&(radioButtonMale.isSelected)){
                val insurance=350;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("More than 55")&&(radioButtonMale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=650;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }
            else if(spinnerAge.selectedItem.equals("More than 55")&&(radioButtonFemale.isSelected)&&(checkBoxSmoker.isSelected)){
                val insurance=450;
                textViewPremium.text="Insurance Premium: RM "+ insurance;
            }

        }


    }





}
