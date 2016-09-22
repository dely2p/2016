'''
Created on 2016. 9. 21.
ex5.py
list : 파이썬에서 자주 사용되는 자료형
순서가 있으며, 수정가능한 자료형, 중복데이터
@author: kitcoop
'''

a = [1,2,3]
b = [10,a,10.5,True,'문자열']
#집합형 자료

print(a)
print(a[1])

print(b)
print(b[1][2])

print("id(a) : ", id(a))
print("id(b) : ", id(b))

a[0] = 100

print(a) # [100,2,3]

fa = ["엄마","아빠","나"]
print("len(fa) : ", len(fa))

fa.append("아루")
print(fa)
print("len(fa) : ", len(fa))

fa.remove("아루")
print("fa : ",fa)
print("len(fa) : ", len(fa))

fa.insert(0, "할아버지")
print("fa : ",fa)
print("len(fa) : ", len(fa))

fa.extend(["삼촌","고모"])
print("fa : ",fa)
print("len(fa) : ", len(fa))

fa += ["아저씨","아줌마"]
print("fa : ",fa)
print("len(fa) : ", len(fa))

fa += '군인' #그룹이 아니면 개개의 글자순으로
print("fa : ",fa)
print("len(fa) : ", len(fa))

del fa[1]
print("fa : ",fa)
print("len(fa) : ", len(fa))

ss = [3,1,4,6,31,22]

print("ss : ",ss)

ss.sort()
print("ss : ",ss)

#내림차순으로 정령
ss.sort(reverse=True)
print("ss : ",ss)

ss2 = ['123','34','234']
ss2.sort()
print("ss2 : ",ss2)  #''(문자열)라서 아스키코드 순으로 정렬함

# 숫자형으로 인식 정렬
ss2.sort(key=int)
print("ss2 : ",ss2)

# 숫자형 내림차순 정렬
ss2.sort(key=int, reverse=True)
print("ss2 : ",ss2)



