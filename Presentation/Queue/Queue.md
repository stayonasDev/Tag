### Queue
#### 특징
- FIFO(FirtstInFirstOut)<br>먼저 들어온 데이터가 먼저 나가는 선입 선출 구조
- Front, Rear <br> Front: 데이터가 삭제되는 곳을 가리킴 <br> Rear: 데이터가 삽입된 곳을 가리킴 
- Enqueue(삽입), Dequeue(삭제)<br> Enqueue: Rear가 가리키는 (다음)지역 삽입<br>
 Dequeue: Front가 가리키는 지역 반환
----
#### 장점
- 선입선출 구조로 먼저 들어간 데이터가 먼저 나온다
- 보통 LinkedList로 Queue를 구현 시 삽입 삭제는 빠르지만
검색은 선형 검색으로 느리다.
- 운영체제 readyQueue와 같이 스케줄링 작업에서
먼저 들어온 프로세스를 작업할 때 사용


#### 단점
- 구현이 복잡하다
- LinkedList로 구현 시 선형 검색으로 시간이 N 만큼 반복될 수 있다
-  선입선출 구조로 스케줄링에 잘못 사용하면 Convoy effect가 발생한다.

<hr>
- 구현 

``` JAVA
class Node<E>{
   E data; // 값
   Node<E> node; //다음 주소를 가리킴
}
```

큐 몸체

```JAVA
class Queue<E>{
    Node<E> front; //먼저 들어온 데이터를 가리킴
    Node<E> rear; //데이터 삽입 가리킴
    int size; //데이터 요소
}
```
---
#### 구현
- boolean offer(E data): 데이터 삽입 용량제한 없음
- E poll(): front 반환, 삭제 없다면 null 반환
- E peek(): 메소드는 front를 반환, 삭제는하지 않음 큐가 비어있으면 null 반환

#### 참고
- 데이터 삽입 시 rear는 새로운 데이터, 삽입 될 떄마다 뒤로 이동
- 데이터 삭제 시 front를 반환하고 front 뒤로 이동
- 순차리 리스트도 구현 해보기