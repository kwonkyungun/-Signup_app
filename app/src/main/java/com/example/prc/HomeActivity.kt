package com.example.prc

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import java.util.Random


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val editText = findViewById<TextView>(R.id.Id_view)  //Id)view 아이디 가져오기
        val strData = intent.getStringExtra("dataFromSignlnActivity")
        //Sinln class 에서 intent해서 받은dataFromSignlnActivity를 strData에 넣어주기
        val btn_close = findViewById<Button>(R.id.homecloss_btn) // 종료버튼 아이디가져오기
        editText.text = "아이디: $strData" //editText에 아이디: 문자를 추가하고 strData가져오기

        val logo = findViewById<ImageView>(R.id.imageView) // 이미지 뷰 아이디 가져오기
        val id = when((1..6).random()){              // 1부터 6까지 랜덤한 숫자를 출력
            1 -> R.drawable.facebook
            2 -> R.drawable.instergram
            3 -> R.drawable.skype
            4 -> R.drawable.twiter
            5 -> R.drawable.youtube
            else -> R.drawable.facebook
        }
        logo.setImageDrawable(ResourcesCompat.getDrawable(resources, id,null))

        btn_close.setOnClickListener {     // 종료 누르면 main화면으로 돌아가기

            finish()
        }
    }
}