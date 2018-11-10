 static String isValid(String s) {
        int[] letters = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            letters[s.charAt(i) - 'a']++;
        }
        length = letters.length;
        int currentValue = 0;
        boolean isValid = true;
        boolean hasBeenChanged = false;
        for (int i = 0; i < length && isValid; i++) {
            if (letters[i] != 0 && currentValue == 0) {
                currentValue = letters[i];
            } else if (letters[i] != 0 && letters[i] != currentValue) {
                if ((letters[i] - 1 == currentValue||letters[i] - 1 == 0) && !hasBeenChanged) {
                    hasBeenChanged = true;
                } else {
                    isValid = false;
                }
            }
        }
        String result = "";
        if (isValid) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }