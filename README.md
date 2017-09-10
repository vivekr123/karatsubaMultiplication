#karatsubaMultiplication
Using Karatsuba Multiplication in Java to reduce the Big O complexity of schoolbook multiplication.
It is defined that if we want to multiply two integers u and v both with length n, u = 10^(n/2)a + b and v = 10^(n/2)c + d. Using these defintions, we see x * y = (10^(n/2)a + b) * (10^(n/2)c + d) = 10^(n)ac + 10^(n/2)(ad + bc) + bd. The values of ac, bd, and (a+b)(c+d) are computed to derive the answers for the preceding equation, as we can see that ad + bc = (a+b)(c+d) - bd - ac. Using this technique, we only use 3 recursive multiplications instead of 4, which would otherwise be ac,ad,bc, and bd. Hence, the asymptotic upper bound, the big O, can be reduced from O(n^2) to O(n^log(3)).
