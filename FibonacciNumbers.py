n = int(input())
k = 0
j = 1
for i in range(1, n + 1):
    k, j = k + j, k
print(k)