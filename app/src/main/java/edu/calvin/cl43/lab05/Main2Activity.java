package edu.calvin.cl43.lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 *  Chris Li, cl43, cs262, lab 05, Prof. Vanderlinden
 *  <p>
 *  Contains the listener for the checkbox.
 */

public class Main2Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerToCheckBox();
    }

    //Adds listeners to the checkbox
    public void addListenerToCheckBox(){
        CheckBox check = (CheckBox)findViewById(R.id.checkBox);
        check.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //checks if the checkbox was checked or not. It gives toast when setting the preference.
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Main2Activity.this, "Preference: True",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(Main2Activity.this, "Preference: False",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
