inputchess = list(map(int,input().split()))
# chess라는 배열에 현재 체스말 수를 입력 받는다.
stdchess = [1,1,2,2,2,8] #기준이 되는 배열을 정의
outputchess = []
for i in range(6): # for문을 이용해 stdchess의 값과 inputchess의 차를 구해서
    num = stdchess[i] - inputchess[i]
    outputchess.append(num) # outputchess에 저장한다.
for i in range(6):
    print(outputchess[i],end = " ")