package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button //to reach any button widget (view)
import android.widget.EditText //to reach any EditText widget (view)
import android.widget.TextView //to reach any TextView widget (view)
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btResult) // to variable button to btResult
        val edtxt1: EditText = findViewById(R.id.ednum1)
        val edtxt2: EditText = findViewById(R.id.ednum2)
        val resultTV: TextView = findViewById(R.id.textresult)
        var flag : String = "Female"
//here .. create a spinner items (options)
        val spinnerVal : Spinner = findViewById(R.id.spselect)
        var options = arrayOf("Female","Male")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long)
            {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?)
            {
                TODO("Not yet implemented")
            }
        }



            button.setOnClickListener { view ->
            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
                if(flag =="Female")
                    resultTV.text = female(x,y).toString();
                else
                    resultTV.text = male(x,y).toString();        }


}}

fun female(a: Int, b: Int): Char
{
    if(a>=40 && b<=55)
    {return 'S'}
    if(a>=56 && b<=70)
{return 'M'}
    if(a>=71 && b<=85)
{return 'L'}
    return 'M'
}

fun male(a: Int, b: Int): Char
{
    if(a>=50 && b<=65)
    {return 'S'}
    if(a>=66 && b<=80)
    {return 'M'}
    if(a>=81 && b<=95)
    {return 'L'}
    return 'M'
}

