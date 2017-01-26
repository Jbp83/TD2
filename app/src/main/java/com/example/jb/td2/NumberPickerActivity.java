package com.example.jb.td2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;

/**
 * Created by Jb on 26/01/2017.
 */

public class NumberPickerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_picker_layout);
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMinValue(10);
        numberPicker.setMaxValue(20);
    }



}
