while True:
    
    data = input("masukkan nama anda : ")
    umur = int(input("masukkan umur anda : "))

    print("nama anda adalah", data)
    # print("umur anda adalah : ", umur,"tahun")
    
    if umur > 18:
        print("anda berumur", umur, "maka anda boleh masuk")
    else:
        print("Umur anda kurang dari yang di tetapkan")