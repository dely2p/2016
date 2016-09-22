'''
Created on 2016. 9. 21.

@author: kitcoop
'''
a = 3
b = 2
print(" a " , a , " b " , b)
a , b = b , a
#tmp = b
#b = a
#a = tmp
print(" a " , a , " b " , b)


a = b = c = 3
print(a,b,c)
print(id(a),id(b),id(c))
print(type(a),type(b),type(c))
# * : 패킹 연산자
v1 , *v2 = 1 , 2 , 3 , 4 , 5
print(v1 , v2)
print(v2[1])
#[2,3,4,5] == List
*v1,v2,v3 = 1,2,3,4,5
print(v1,v2,v3)

# 산술 연산자
print(5+3, 5-3, 5*3, 5/3)
print(5 //3, 5%3, divmod(5,3))
# divmod는 몫과 나머지를 튜플 타입으로 리턴
# [1,2,3,] : list
# (1,2) : 튜플
print(3+4,(3+4)*2)
print("====================")
print("관계연산자")
print(5>4,3==5,5!=3)
print(5>3 and 4<3)
print(10>1 or 5<2, not(5>=3))

# 산술연산자 ==> 관계연산자 ==> 논리연산자
a = 4 + 5 >= 3
print(a)

print("문자열 더하기", end='abc')
print("대한"+"민국")
print("한국"*10)
print("====================")
a = 100
# ++a는 다른 용도로 사용 , 증감 연산자 X
a = a + 1
print(a)
print(a,a*-1, -a, +a, --a)
print(bool(True),bool(False),bool(0))
print(bool(1), bool(10), bool(-35))
# 0 이외의 값은 True
print(bool(''), bool(None))
print(int(30.2))
