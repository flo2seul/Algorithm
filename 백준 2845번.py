L, P = input().split()
L = int(L)
P = int(P)
A = list(map(int, input().split()))
for i in A:
   print(i-L*P,end=" ")
