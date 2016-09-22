'''
Created on 2016. 9. 22.

@author: kitcoop
'''
a = 1
while a<=5:
    print(a,end="\t") #end 출력후 뒷부분
    a+=1
    
# 문제 사용자로부터 입력받은 단을 출력하세요
# ex) 몇단? 3
# 3단 출력

dan = int(input('몇단? '))
print("%d단 출력" %dan)
i=1
while i<10:
    print(dan,"*",i,"=",dan*i)
    i=i+1