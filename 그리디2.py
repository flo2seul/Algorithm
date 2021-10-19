# N, M = map(int,input().split())
# A = []
# B = []
#
# for i in range(N):
#     A = list(map(int, input().split()))
#     A.sort()
#     B.append(A[0])
# B.sort()
# print(B[N-1])

#min() 함수 이용하기
n, m = map(int, input().split())

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    min_value = min(data)
    result = max(result, min_value)
print(result)