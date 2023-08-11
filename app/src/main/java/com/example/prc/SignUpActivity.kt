package com.example.prc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn = findViewById<Button>(R.id.Membership_closs)
        val name = findViewById<EditText>(R.id.Membership_edit_name)
        val ID = findViewById<EditText>(R.id.Membership_edit_id)
        val Password = findViewById<EditText>(R.id.Membership_edit_password)


        btn.setOnClickListener {                           // Membership_closs 란 버튼 변수를 가져와
                                                                  // 클릭시 일어나는 메소드를 정의
            if (name.text.toString().trim().isEmpty()) {          // 조건문 name을 String으로 형변환 후 isEmpty공백이라면 아래 Toast문 실행 공백이 아니라면 통과
                                                                  // trim은 문자열 양 끝의 공백을 제거
                Toast.makeText(this, "이름이 입력되지 않았습니다..", Toast.LENGTH_SHORT).show()
            }else if(ID.text.toString().trim().isEmpty()){
                Toast.makeText(this, "아이디가 입력되지 않았습니다..", Toast.LENGTH_SHORT).show()
            }else if( Password.text.toString().trim().isEmpty()){
                Toast.makeText(this, "비밀번호가 입력되지 않았습니다..", Toast.LENGTH_SHORT).show()
            }
            else  {
                Toast.makeText(this, "회원가입 되었습니다.", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SignUpActivity::class.java).apply{
                                //signln Class에 23~30번째 줄 registerForActivityResult의 데이터값 뿌려주기
                    putExtra("id",ID.text.toString())           //id값을 뿌려준다
                    putExtra("pw",Password.text.toString())     //pw값을 뿌려준다.
                }
                setResult(RESULT_OK, intent)  //signln에 답장을 주는 코드

                finish()
            }


        }
    }
}