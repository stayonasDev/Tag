<h2>연결 리스트 스택</h2>
 - 연결리스트를 활용한 스택
 <br>
 
 <h3>장점</h3>
 
  - 연결 리스트의 장점으로 스택은 동적으로 크기를 생성한다
  - 순차 리스트는 삽입 삭제 시 원소의 불필요한 이동이 있지만 <br/>
    연결 리스트는 삽입 삭제 시 Link가 가리키고 있는 주소를 바꾸면 되기에 <br/>
    삽입 삭제가 빠르다
    
<h3>단점</h3>

 - 구현이 복잡
 - 순차 리스트는 물리적인 순서로 검색이 빠르지만<br />
   연결 리스트는 반대로 논리적으로 검색이 느리다.
<h3>특징</h3>
<p>
  구현 시 연결 리스트와 스택의 특징을 생각하며 구현을 하면 된다.
  연결 리스트는 data와 다음 데이터 주소를 참조한 Link를 만들고
  스택은 LIFO 후입선출 특징을 나타내기 위해 Head가 새로 들어온 데이터를 가르키게 만든다.
</p>


 - 첫 번째 처음 스택에 push 해드 상태
   
<img src="https://github.com/stayonasDev/Tag/assets/149605122/60a45599-49bd-4bb4-8c40-fc649425f722" width="300px" height="300px">
<br>

 - 두 번째 push 해드, 링크 변경
   
<img src="https://github.com/stayonasDev/Tag/assets/149605122/5e8c64d1-28bd-48f5-81fc-73b5fa4732f5" width="300px" height="300px">
<br>

 - 세 번째 push 상세
   
<img src="https://github.com/stayonasDev/Tag/assets/149605122/68f834d7-11fd-4f0c-a5b5-e6000d889828" width="300px" height="300px">
