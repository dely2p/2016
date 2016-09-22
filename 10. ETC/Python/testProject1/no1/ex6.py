'''
Created on 2016. 9. 21.

ROM
RAM --> 비휘발성 RAM
tuple :
    list와 유사하다.
        수정불가
    list보다 속도가 빠르다

@author: kitcoop
'''

t = 'a','b','c'
print("t : ",t)

t = ('a','b','c') #가독성을 위해서 이 () 방식으로 사용
print("t : ",t)

print("길이 : ", len(t), "b는 몇 번재 위치", t.index('b'))

p = (1,2,3)
print(p)
print("===================================")

#p[0]=100
#print(p)

#p[0] = 100 #수정불가

# 리스트 수정가능
# 튜플을 리스트로 변경
# 리스트 수정
# 튜플
q = list(p)
print("q : ",q)
q[0] = 100
print("q : ",q)

p = tuple(q);
print("p : ",p)

t1 = (10,20) #패킹
a,b = t1 #언패킹
a,b = b,a
print("a: ",a,"b: ",b)

t2 = (a,b) #패킹
print("t2: ",t2)

t3 = (100,20,40,30)
#t3.sort()
lst = list(t3)
print(lst)
lst.sort()
print(lst)
t3 = lst
print("t3: ",t3) #(20,30,40,100)



