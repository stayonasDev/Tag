# 연결리스트 스택
### 장점
1. 순차 리스트는 물리적으로 배열이 연결되어 삽입, 삭제가 N 만큼의 시간이 소요 되지만
   연결 리스트는 각 노드가 다음 노드를 가르켜 삽입, 삭제 삭제가 빠르다.
2. 크기가 동적이다.
3. 연결리스트의 장점을 사용하여 LIFO를 사용할 수 있다.

### 단점
1.순차 리스트는 물리적인 배열로 인덱스로 검색이 빠르지만,
  연결 리스트는 각 노드가 가르키는 노드로 이동하며 검색하는 선형 검색이여서 느리다.

2.구현이 복잡하다.

<br> <br>
----
#구현
 - Node를 먼저 구현한다 노드는 다음 노드를 가르키는 Node와 자신의 데이터를 가진다. 
``` JAVA
class Node<T>{
   private T data;
   private Node<T> node;
//생성자 
}
```

- Stack 구현 LIFO 특성에 맞게 상단 데이터를 가르키게 함
``` JAVA
class ArrayListStack<T>{
  private Node <T> top;
//생성자들과 메서드들
}
```
- C 구현 예시
``` C
#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
   int data;
   struct Node *node;
} Node;

typedef struct Stack{
   Node *top;
} Stack;

void push(Stack *stack, int data){
    Node *node = (Node *)malloc(sizeof(Node));
    node -> data = data;
    node -> node = stack->top;
    stack -> top = node;
}

int main() {
    Stack stack;
    // stack.top = ?;
    return 0;
}
```

구현 방법을 예시로 Stack을 만들어보자.

스택은 push(삽입), pop(삭제), size(원소 수), isEmpty(true, flase), search(검색) 구현

중요한 것은 메스드 수행 전 후 LIFO가 유지되어야 한다.
