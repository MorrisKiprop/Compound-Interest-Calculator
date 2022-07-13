package com.morris.cicalulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class DailyCompoundmentLeapYearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_compoundment_leap_year)

        var LOANAMOUNT: EditText =findViewById(R.id.loanamount)
        var INTERESTRATE: EditText =findViewById(R.id.interestrate)
        var REPAYMENTPERIOD: EditText =findViewById(R.id.repaymentperriod)
        var CALCULATEBUTTON: Button =findViewById(R.id.calculatebutton)
        var MYRESULT: TextView =findViewById(R.id.totalrepaymentamount)


        CALCULATEBUTTON.setOnClickListener {

            var firsttText= LOANAMOUNT.text.toString()
            var secondText=INTERESTRATE.text.toString()
            var thirdText=REPAYMENTPERIOD.text.toString()



            if(firsttText.isEmpty()||secondText.isEmpty()||thirdText.isEmpty()){
                Toast.makeText(applicationContext, "Please enter all values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            try {

                var firstNumber=firsttText.toDouble()
                var secondNumber=secondText.toDouble()
                var thirdNumber=thirdText.toDouble()



                fun accountafterinterest() = firstNumber * (1 + secondNumber / 36600) .pow(366*thirdNumber)
                var COMPOUNDINTEREST=accountafterinterest()


                MYRESULT.text="The total amount accrued on a principal of $firstNumber at a rate of $secondNumber% per year compounded 366 times per year over $thirdNumber years  is $COMPOUNDINTEREST."

            }catch (e:Exception){
                Toast.makeText(applicationContext, "Enter valid input", Toast.LENGTH_SHORT).show()
            }
        }
    }
}