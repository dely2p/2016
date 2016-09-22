'''
Created on 2016. 9. 22.

import json
dict 사전형{키:값} : map 계열, json순서가 없으며, 키는 중복할 수 없고, 값은 중복 가능
myDic = dict(k1=1, k2='abc', k3=3.4)
@author: kitcoop
'''
myDic = dict(k1=1,k2='abc',k3=3.4)
print("myDic", myDic)

dic = {"파이썬":"비단뱀","자바":"커피","스프링":"용수철"}
print("dic",dic)
print("len(dic)",len(dic))
print("dic['자바'] : ", dic['자바'])
#print("dic[0]", dic[0]) 순서가 없어서 인덱싱이 안됨

dic['오라클'] = "예언자"
print("dic",dic)

del dic['오라클']
print("dic",dic)