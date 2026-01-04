class Solution(object):
    def sumFourDivisors(self, nums):
        res = 0
        for n in nums:
            cnt = s = 0
            for i in range(1, int(n ** 0.5) + 1):
                if n % i == 0:
                    j = n // i
                    if i == j: 
                        cnt += 1; s += i
                    else:
                        cnt += 2; s += i + j
                if cnt > 4: break
            if cnt == 4: res += s
        return res