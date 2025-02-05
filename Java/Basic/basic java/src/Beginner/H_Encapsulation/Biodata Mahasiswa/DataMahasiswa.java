package Beginner.H_Encapsulation.Biodata Mahasiswa;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        
        // Mengisi data menggunakan setter
        mhs1.setNama("Budi Santoso");
        mhs1.setNim("123456789");
        mhs1.setIpk(3.75);
        
        // Mencoba mengisi IPK tidak valid (lebih dari 4.0)
        mhs1.setIpk(4.5); // Akan ditolak
        
        // Mengakses data menggunakan getter
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("NIM: " + mhs1.getNim());
        System.out.println("IPK: " + mhs1.getIpk());
    }
}

class Mahasiswa {
    // Variabel privat (tersembunyi)
    private String nama;
    private String nim;
    private double ipk;

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama dengan validasi
    public void setNama(String nama) {
        if (!nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Error: Nama tidak boleh kosong!");
        }
    }

    // Getter untuk NIM
    public String getNim() {
        return nim;
    }

    // Setter untuk NIM dengan validasi
    public void setNim(String nim) {
        if (nim.length() == 9) {
            this.nim = nim;
        } else {
            System.out.println("Error: NIM harus 9 digit!");
        }
    }

    // Getter untuk IPK
    public double getIpk() {
        return ipk;
    }

    // Setter untuk IPK dengan validasi
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("Error: IPK harus antara 0.0 - 4.0!");
        }
    }
}