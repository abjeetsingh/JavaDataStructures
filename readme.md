in bit manupulation u can reduce the time complexity of your program by using bits instead of demicals operations like + - * divide

to find the mask of right most set bit
==> bit & -bit

>> right shift

to divide a number by 2 just use >> 1
to multiply by 2 << use left shift

to remove the least significant set bit use

n & (n-1) 

ie if 
n = 13

1101
 if we use n&n-1

1101 --> 1100 --> 1000 --> 0000


to make mask of the least significant bit use

num & -num

for eg is num == 1100
mask will be = 0100

most significant bit mask = num & -num

Mathametical application in coding =sieveOfErotoSthenes, GCD, 