package com.example.prc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.datepicker.SingleDateSelector
import kotlin.random.Random

class SignlnActivity : AppCompatActivity() {
    lateinit var activityResultLauncher : ActivityResultLauncher<Intent>    //registerForActivityResult 변수를 선언해주기 위한 코드문
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signln)

        val Text_id = findViewById<EditText>(R.id.Id_edit)
        val Text_pasword = findViewById<EditText>(R.id.Password_edit)
        val intent = Intent(this, HomeActivity::class.java)         //

        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            // registerForActivityResult를 이용해 homeActivity에서 id데이터 값 과 pw데이터를 가져오는 코드문
            if (it.resultCode == RESULT_OK){
                val user_id = it.data?.getStringExtra("id")?:""
                val user_pw = it.data?.getStringExtra("pw")?:""
                Text_id.setText(user_id)
                Text_pasword.setText(user_pw)
            }
        }

        val btn = findViewById<Button>(R.id.Login_btn)
        btn.setOnClickListener {                //HomeActivity로 액티비토 화면전환 코드

            if (Text_id.text.toString().trim().isEmpty()) {         //text_id의 trim()으로 양쪽 공백을 제거하고 isEmpty로 공백인지 확인
                Toast.makeText(this, "아이디를 입력하세요.", Toast.LENGTH_SHORT).show()      //공백이라면 "아이디를 입력하세요" 문구 출력
            } else if (Text_pasword.text.trim().isEmpty()) {        //text_pasword의 trim()으로 양쪽 공백을 제거하고 isEmpty로 공백인지 확인
                Toast.makeText(this, "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()  //공백이라면 "아이디를 입력하세요" 문구 출력
            } else {
                val Text_id = findViewById<EditText>(R.id.Id_edit)
                val str_id = Text_id.text.toString()
                intent.putExtra("dataFromSignlnActivity", str_id)  //공백이 아니라면 str_id에 데이터를 dataFromSignlnActivity 넣어 putExtra로 다른 Activity에 데이터 전달
                Toast.makeText(this, "로그인 성공.", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

        }

        val btn2 = findViewById<Button>(R.id.Membership_btn)
        btn2.setOnClickListener {                //SignUpActivity 액티비토 화면전환 코드
//            val intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
            val intent = Intent(this, SignUpActivity::class.java)           // 종료되면서 다시 답장을 주기 위한 코드문
            activityResultLauncher.launch(intent)
        }
    }
}