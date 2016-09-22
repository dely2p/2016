'''
Created on 2016. 9. 22.

@author: kitcoop
'''

var = 5

if var>=3:
    print('3보다 크다')
else:
    print('거짓')
print("하하하")
#파이썬은 블럭을 들여쓰기로 결정하므로 탭을
#아무렇게나 넣으면 전혀 다른 실행결과를 가질 수 있다.

print("---------------------")
money = 1000
age = 20
if money>=500:
    item = "apple"
    if age<=30:
        msg = "young"
    else:
        msg = "old"
else:
    item = "banana"
    if age<=30:
        msg ="young"
    else:
        msg = "old"
print(item)
print(msg)

score = int(input('점수입력: '))
print("입력된값 : ", score)
if 90<=score<=100:
    print("A")
elif score>=80:
    print("B")
elif score>=70:
    print("C")
elif score>=60:
    print("D")
else:
    print("F")