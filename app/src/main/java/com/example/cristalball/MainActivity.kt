package com.example.cristalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristalball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtPred.setOnClickListener{
            binding.txtPred.text = getPred()
        }
    }
private fun randomNumber() : Int{
    val sizePred = resources.getStringArray(R.array.predictions).size - 1
    return (0..sizePred).random()
}
    private fun getPred() : String{
       return resources.getStringArray(R.array.predictions)[randomNumber()]
    }

}