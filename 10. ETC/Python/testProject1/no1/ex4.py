'''
Created on 2016. 9. 21.

@author: kitcoop
'''

s = "sequence"
print("길이 : ", len(s))

print("e글자의 포함횟수", s.count("e"))

print("e몇번째 글자", s.find('e'))

#print("3번째 e는 몇번째글자", s.find('e',3))

print("뒤에서 첫번째 e는 몇번째 글자", s.rfind('e'))

ss = 'abc'
print('abc',ss,id(ss))

#문자열의 일부만 뽑아서 추출
print(s,s[0],s[2:5],s[3:])
print(s[-1],s[-4:-1]) # 뒤에서부터 4번째부터 ~ 뒤에서 첫번째까지

#Hello World 문자열에서
#   o Wor 문자열을 추출하여 출력!

str = "Hello World"
print(str[4:9])

print(s[1:7:2]) #1번부터 7번까지 2씩 증가하면서 2씩 증가
print(s[::2])

# Hello World 문자열에서
# 처음부터 끝까지 3의 배수로 문자열을 잘라서 출력

print(s[::3])
