package sg.edu.rp.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()
            if(userDOB.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()

                var output = ""
                /*
                if(age < 18){
                    output = "Underage"
                    tvShowAge.text = "Your age is $age + $output"
                }else if(age in 18..65){
                    output = "Young People"
                    tvShowAge.text = "Your age is $age + $output"
                }else if(age in 66..79){
                    output = "Middle Age"
                    tvShowAge.text = "Your age is $age + $output"
                }else if(age in 80..99){
                    output = "Elderly"
                    tvShowAge.text = "Your age is $age + $output"
                }else {
                    output = "Long-lived elderly"
                    tvShowAge.text = "Your age is $age + $output"
                }

                 */

                when (age){
                    in 0..17 -> output = "Underage"
                    in 18..65 -> output = "Young People"
                    in 66..79 -> output = "Middle-aged"
                    in 80..99 -> output = "Elderly"
                    else->{
                        output = "Long-lived elderly"
                    }

                }
                tvShowAge.text = tvShowAge.text.toString() + "\n" + output



            }else{
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_LONG).show()
            }

        }
    }
}
