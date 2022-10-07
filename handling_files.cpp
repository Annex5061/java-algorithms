#include <iostream>
#include <fstream>
using namespace std;

int main () {
  ofstream file;
  file.open ("codebind.txt");
  file << "Please writr this text to a file.\n this text is written using C++\n";
  file.close();
  return 0;
}
