'''
Created on 2016. 9. 22.

@author: kitcoop
'''
for i in [3,2,1,5,4]:
    print(i,end=" ")
print()

for i in [3,2,1,5,4]:
    print(i,end=" ")
print()

soft = {"java":"제임스고슬링",
        "파이썬": "귀도 반 로썸",
        "오라클":"레리 엘리슨",
        "문명":"시드 마이어"}
for i in soft.items():
    #print(i)
    print(i[0]+' : '+i[1])
print()
print("------------------------")
for i in soft.keys():
    print(i)
print()
print("------------------------")
for i in soft.values():
    print(i)
print()

# 2 출력
n=2
for i in [1,2,3,4,5,6,7,8,9]:
    print(n,"*",i,"=",n*i)
print();

for n in [2,3]:
    for j in [1,2,3,4,5,6,7,8,9]:
    #print(n+"*"+i+"="+n*i)
        print("{0}*{1}={2}".format(n,j,n*j))
print();

print("과일 값 구하기")
price = {'사과':1000,'배':2000,"망고":3000,"감":50}
my = {'사과':4,'감':2}

bill = sum(my[f]*price[f] for f in my)
print("총 구매액  : ",bill)


# 1부터 10까지의 누적합을 출력
total = sum(i for i in [1,2,3,4,5,6,7,8,9,10])
print(total)

i = sum(i for i in list(range(1,101)))
print(i)

vsum=0
for i in [1,2,3,4,5,6,7,8,9,10]:
    vsum += i
print(vsum)

# 1에서 11까지 2씩 증가하는 값 출력
print(list(range(1,11,2)))

# 문제 : 1부터 1000사이의 값중 3의 배수의 누적합을 구해 출력
print(sum(i for i in list(range(3,1000,3))))