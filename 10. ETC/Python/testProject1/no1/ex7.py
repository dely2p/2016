'''
Created on 2016. 9. 22.

@author: kitcoop
'''
a = {1,2,3}
print("a : ",a)

a ={1,1,1,2,2,2,3,3,3,4,4}
print("a : ",a)

#print("a[0] :"+a[0]) #순서가 없기 때문에 인덱싱도 지원하지 않음

b = {3,4}
print("b : ",b)
a ={1,2,3}
#a와 b의 집합 연산 가능
#교집합, 차집합, 합집합

print("a.union(b) : ",a.union(b))
print("a.intersection(b) : ",a.intersection(b))
print("a-b :",a-b) #차집합
print("a|b :",a|b) #합집합
print("a&b :",a&b) #교집합

b.add(5)
print("b : ",b)

b.update((6,7))

#update 함수로는 튜플로 추가, set 추가, 리스트 추가
b.update({8,9})
b.update([10,11])
print("b : ",b)

print("----------------------")
b.discard(7) #존재하면 삭제 없으면 무시
print("b : ",b)

print("----------------------")
b.remove(8) #반드시 삭제 없으면 에러
print("b : ",b)


# 문제
ex = [1,22,22,4,99,11,33,55]
# 1. 정렬
# 2. 중복 제거 (set 이용해서)

tmp = set(ex)
print(tmp)
ex = list(tmp)
ex.sort()
print(ex)

aa = (1) #튜플로 선언하지만 값이 1개 밖에 없을 땐 값이 int 형이 됨.
bb = (1,) #값이 1개지만 ,(콤마)와 같이 쓰면 튜플형이 됨.
print("aa : ",aa, type(aa))
print("bb : ",bb, type(bb))