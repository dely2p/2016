'''
Created on 2016. 9. 22.
파이썬 : 정규표현식
기본모듈에서 지원하지 않아서 모듈 추가
@author: kitcoop
'''

import re

ss = '1234 abc가나다ABC_555_6_77_88 123 엉아 abc'
#입력 자료 오류 검사할 때, 다량의 데이터에서 원하는 데이터를 참조할 때

print(re.findall('123',ss))
#혹시 escape문자를 검색할 수도 있으므로 r을 붙여서 사용
print(re.findall(r'가나다', ss))

print(re.findall('[0-9]{3}', ss))

#문제 : 연속 2자 이상의 소문자를 출력
print(re.findall('[a-z]{2,}',ss))
#문제 : 한글 2자 이상 출력
print(re.findall('[가-힣]{2,}', ss))