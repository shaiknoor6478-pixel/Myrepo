public class HaystackBuiltIn {
    public static void main(String[] args) {
        String haystack = "This is a great big haystack with a needle in it.";
        String needle = "needle";
        int index = haystack.indexOf(needle);

        if (index != -1) {
            System.out.println("Found the needle at index: " + index);
        } else {
            System.out.println("Needle not found in the haystack.");
        }
    }
}