'''
Created on 2016. 9. 20.
python 특징
1. 플랫폼에 독립적
2. 인터프리터식 언어
3. 객체지향 언어
4. 동적 타이핑이 가능
5. 가독성이 좋다
6. Glue language
7. 유니코드를 지원
8. 라이브러리(모듈)이 풍부하다
9. free

아나콘다
BitTorrent

문명4
마야

@author: kitcoop
'''
print("aaa")

#파이썬은 인터프리터 방식이므로 에러나면
#아래코드는 실행되지 않음

print("bbb")
print("ccc")

#콘솔에 Hello Python World! 메세지를 출력

print("Hello Python World!")

#single line comment
#javascript
'''
'''
#한줄주석
"""
"""
print("---------------")
#변수명 = 값
var1 = "안녕"; #; 라인종결자가 있어도 없어도 상관없다.
print(var1);
var1 = 5;
print(var1)

a = 10
b = 20.5
c = b
print(a,b,c)
#id(변수명) => 참조값을 확인할 수 있다.
print("--------- id(c)---------")
print(a,id(a))
print(b,id(b))
print(c,id(c))
c = 222
print("--------- c = 222---------")
print(a,id(a))
print(b,id(b))
print(c,id(c))

print(" is 는 주소 비교,  == 값을 비교")
print( a is b , a == b )
print( a is c , a == c )


#파이썬의 변수 규칙
# 1. A-Z, a-z, 0~9, _, $
# 2. 변수명은 숫자로 시작할 수 없다.
# 3. 예약어 사용할 수 없다.
# 4. 의미있게 지정


# 예약어 리스트
import keyword
print(keyword.kwlist)

# 파이썬의 자료형
# 1. 문자
# 2. 수치 (int, float, complex)
# 3. 부울 (True, False)
# 4. list
# 5. set
# 6. tuple
# 7. dict

print(7, type(7))
print(3.14, type(3.14))
print(3+2j,type(3+2j))
print(True, type(True))
print("a", type("a"))
A = 10
a = 20
print(A,a)

print((1,), type((1,)))
print([1], type([1]))
print({1}, type({1}))
print({"k":1}, type({"k":1}))
