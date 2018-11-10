static int alternatingCharacters(String s) {
	char prevChar = s.getCharAt(0);
	int length = s.length();
	int counter = 0;
	for (int i = 1; i < length; i++){
		if (s.getCharAt(i) == prevChar){
			counter++;
		}
		else {	
			prevChar = s.getCharAt(i);
		}
        }
}

//AAABB
//prevC = A == A counter = 1
//prevC = A == A counter = 2
//prevC = A != B counter = 2
//prevC = B == B counter = 3