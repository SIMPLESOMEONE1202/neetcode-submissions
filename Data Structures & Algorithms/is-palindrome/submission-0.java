class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; // string ke first me pointer
        int j = s.length() - 1; // string ke last me pointer

        while (i < j) {

            // agar i wala character letter ya digit nahi hai toh usse skip karenge
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // agar j wala character letter ya digit nahi hai toh usse skip karenge
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // dono characters ko lowercase me convert karke compare karenge
            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {

                // agar dono equal nahi hue toh palindrome nahi hai
                return false;
            }

            i++; // aage wala pointer ek step aage
            j--; // peeche wala pointer ek step peeche
        }

        // agar poori string check ho gayi aur mismatch nahi mila
        return true;
    }
}