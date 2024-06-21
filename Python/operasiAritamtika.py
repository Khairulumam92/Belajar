# operasi aritmatika

a = 10
b = 3

# operasi tambah +
print("operasi tambah +")
hasil = a + b
print (a,"+",b,"=",hasil)

# operasi pengurangan -
print("operasi pengurangan -")
hasil = a - b
print (a,"-",b,"=",hasil)

# operasi perkalian x
print("operasi perkalian x")
hasil = a * b
print (a,"x",b,"=",hasil)

# operasi pembagian /
print("operasi pembagian /")
hasil = a / b
print (a,"/",b,"=",hasil)

# operasi eksponen/pangkat
print("operasi eksponen")
hasil = a ** b
print (a,"^",b,"=",hasil)

# operasi modulus %
print("operasi modulus %")
hasil = a % b
print (a,"%",b,"=",hasil)

# operasi floor division 
print("operasi floor division //")
hasil = a // b
print (a,"//",b,"=",hasil)

#prioritas operasi
"""
1. ()
2. eksponen **
3. perkalian, modulus & floor division *, **, % & //
4. tambah dan pengurangan + & -
"""
x = 3
y = 2
z = 4
#masa
hasil = x ** y * (z + x) / y - y % z // x
print (x,'**',y,'*''(',z,'+',x,')''/',y,'-',y,'%',z,'//',x,'=',hasil)

hasil = x + y * z
print (x,'+' ,y, '*',z, '=',hasil )

hasil = (x + y) * z
print ('(' ,x,'+' ,y, ')' '*',z, '=',hasil)

