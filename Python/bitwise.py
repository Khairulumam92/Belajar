# operasi bitwise, operasi biner/binary

a = 5
b = 9

# bitwise or (|)
c = a | b
print("\n ========OR========")
print('nilai :', a, ', binary :', format(a, '08b'))
print('nilai :', b, ', binary :', format(b, '08b'))
print("----------(|)----------")
print('nilai :',c, ',binary :', format(c, '08b'))

# bitwise and (&)
c = a & b
print("\n ========AND========")
print('nilai :', a, ', binary :', format(a, '08b'))
print('nilai :', b, ', binary :', format(b, '08b'))
print("----------(&)----------")
print('nilai :', c, ', binary :', format(c, '08b'))

# bitwise XOR (^)
c = a ^ b
print("\n ========XOR========")
print('nilai :', a, ', binary :', format(a, '08b'))
print('nilai :', b, ', binary :', format(b, '08b'))
print("----------(^)----------")
print('nilai :', c, ',binary :', format(c, '08b'))

# bitwise NOT (~)
c = ~b
print("\n ========NOT========")
print('nilai :', b, ', binary :', format(b, '08b'))
print("----------(~)----------")
print('nilai :', c, ',binary :', format(c, '08b'))