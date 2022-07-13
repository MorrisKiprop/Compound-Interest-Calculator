package com.morris.cicalulator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAnnual: Button =findViewById(R.id.btnAnnualCompoundment)
        val btnSemiAnnual: Button =findViewById(R.id.btnSemiAnnualCompoundment)
        val btnQuartely: Button =findViewById(R.id.btnQuartelyCompoundment)
        val btnMonthly: Button =findViewById(R.id.btnMonthlyCompoundment)
        val btnDailyNormalYear: Button =findViewById(R.id.btnDailyCompoundmentNormalYear)
        val btnDailyLeapYear: Button =findViewById(R.id.btnDailyCompoundmentLeapYear)
        val btnWeekly: Button =findViewById(R.id.btnWeeklyCompoundment)
        val btnSemiMonthly: Button =findViewById(R.id.btnSemiMonthlyCompoundment)
        val btnBiMonthly: Button =findViewById(R.id.btnBiMonthlyCompoundment)
        val btnContinuous: Button =findViewById(R.id.btnContionuousCompoundment)







        btnAnnual.setOnClickListener {
            val intent= Intent(this,AnnualCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnSemiAnnual.setOnClickListener {
            val intent= Intent(this,SemiAnnualCompoundment::class.java)
            startActivity(intent)
        }
        btnQuartely.setOnClickListener {
            val intent= Intent(this,QuartelyCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnMonthly.setOnClickListener {
            val intent= Intent(this,MonthlyCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnDailyNormalYear.setOnClickListener {
            val intent= Intent(this,DailyCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnContinuous.setOnClickListener {
            val intent= Intent(this,ContinuousCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnDailyLeapYear.setOnClickListener {
            val intent= Intent(this,DailyCompoundmentLeapYearActivity::class.java)
            startActivity(intent)
        }
        btnWeekly.setOnClickListener {
            val intent= Intent(this,WeeklyCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnSemiMonthly.setOnClickListener {
            val intent= Intent(this,SemiMonthlyActivity::class.java)
            startActivity(intent)
        }
        btnBiMonthly.setOnClickListener {
            val intent= Intent(this,BiMonthlyCompoundmentActivity::class.java)
            startActivity(intent)
        }
    }
}