import 'dart:io';

void main() {
  stdout.write('nama anda: ');
  String name = stdin.readLineSync()!;
  stdout.write('umur anda: ');
  int age = int.parse(stdin.readLineSync()!);
  print('halo $name, umur anda $age tahun');
}
