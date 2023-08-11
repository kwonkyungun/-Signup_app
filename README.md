# Signup_app 회원가입 개인프로젝트 

# Signln Activity 
1. 아이디/비밀번호를 입력하지 않으면 Toast문을 통해 "아이디/비밀번호를 입력하세요" 를 출력하면서 다음페이지로 이동 금지
2. 아이디 비밀번호를 입력했다면 "로그인 성공" Toast문 메세지 출력
3. 로그인이 성공하면 putExtra/ intent를 통해 Home 화면에 Id값을 전
4. registerForActivityResult를 이용해 회원가입(Signup 화면)의 입력한 아이디 비밀번호 데이터값을 불러온다.

# Signup Activity 
1. 이름, 아이디, 비밀번호를 입력하지 않으면 Toast를 통해 입력해 달라는 메세지 출력
2. 이름 아이디 비밀번호를 모두 작성시 회원가입 가능
3. 회원가입 클릭 시 Signln 화면으로 돌아감
# Home Activity 
1. Signup 화면에서 입력한 ID 데이터 값을 가져온다.
2. 프로필 이미지가 랜덤으로 변경(총5개 사진으로 구성)
3. 종료 버튼 클릭시 버튼 색 변경
4. 종료 버튼 클릭 시 signln으로 돌아
# 화면 구조
# Signln Activity 
![1](https://user-images.githubusercontent.com/139091726/259958827-e9458268-ef2e-4706-a471-ec43bcbe9097.png)

# Signup Activity 
![2](https://github.com/kwonkyungun/Signup_app/assets/139091726/642d58c1-ad5c-4530-9da6-2787eaded680)

# Home Activity 
![3](https://github.com/kwonkyungun/Signup_app/assets/139091726/eee5ecd5-e853-4384-9974-9d8de63753a1)
