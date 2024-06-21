# operasi logika boolean not, or, and, xor 
'''
NOT = Kebalikan data awal
OR = jika ada True maka True
AND = jika ada False maka False
XOR = jika beda maka True
'''

print("===NOT===")
a = False
c = not a
print("data a =", a)
print("---Not---")
print("data c =", c)

print("===OR===")
a = False
b = False
c = a or b
print(a, 'or',b, '=', c)
a = True
b = False
c = a or b
print(a, 'or',b, '=', c)
a = False
b = True
c = a or b
print(a, 'or',b, '=', c)
a = True
b = True
c = a or b
print(a, 'or',b, '=', c)

#logika and
print("===AND===")
a = False
b = False
c = a and b
print(a, 'and',b, '=', c)
a = True
b = False
c = a and b
print(a, 'and',b, '=', c)
a = False
b = True
c = a and b
print(a, 'and',b, '=', c)
a = True
b = True
c = a and b
print(a, 'and',b, '=', c)

#logika XOR
print("===XOR===")
a = False
b = False
c = a ^ b
print(a, 'xor',b, '=', c)
a = True
b = False
c = a ^ b
print(a, 'xor',b, '=', c)
a = False
b = True
c = a ^ b
print(a, 'xor',b, '=', c)
a = True
b = True
c = a ^ b
print(a, 'xor',b, '=', c)

