# Signup_app 회원가입 개인프로젝트 
# 화면 구조
# Signln Activity 

1. 아이디/비밀번호를 입력하지 않으면 Toast문을 통해 "아이디/비밀번호를 입력하세요" 를 출력하면서 다음페이지로 이동 금지
2. 아이디 비밀번호를 입력했다면 "로그인 성공" Toast문 메세지 출력
3. 로그인이 성공하면 putExtra/ intent를 통해 Home 화면에 Id값을 전
4. registerForActivityResult를 이용해 회원가입(Signup 화면)의 입력한 아이디 비밀번호 데이터값을 불러온다.

