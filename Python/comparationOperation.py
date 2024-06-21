#operator perbandingan >, <, >=, <=, ==, !=, is, is not
a = 4
b = 2

print("===operator lebih dari >")
hasil = a > 3
print(a, '> ' '3'' =',hasil)

print("===operator kurang dari <")
hasil = a < 3
print(a, '< ' '3'' =',hasil)

print("===operator lebih dari/sama dengan >=")
hasil = a >= 3
print(a, '>= ' '3'' =',hasil)

print("===operator kurang dari/sama dengan <=")
hasil = a <= 3
print(a, '<= ' '3'' =',hasil)

print("===operator sama dengan ==")
hasil = a == 4
print(a, '== ' '4'' =',hasil)

print("===operator tidak sama dengan !=")
hasil = a != 3
print(a, '!= ' '3'' =',hasil)

#untuk is dan is not harus tesrimpan dalam memory atay berbentuk variabel terlebih dahulu
x = 4
y = 3
print("===operator is")
hasil = x is y
print(x, 'is' ,y, '=',hasil)
print(x, 'hex id =',hex(id(x)))

print("===operator is not")
hasil = x is not y
print(x, 'is' ,y, '=',hasil)
print(x, 'hex id =',hex(id(x)))
print(y, 'hex id =',hex(id(y)))

