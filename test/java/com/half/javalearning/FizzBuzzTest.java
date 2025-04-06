
/**
 * Test class for FizzBuzz implementation
 */
class FizzBuzzTest {
    private final FizzBuzz fb = new FizzBuzz();
    private final PrintStream originalOut = System.out;

    /**
     * Restores original System.out after each test
     */
    @org.junit.After
    public void tearDown() {
        System.setOut(originalOut);
    }

    /**
     * Helper method to test FizzBuzz output
     * @param n Input number
     * @param expected Expected output string
     * @throws IOException If there's an I/O error
     */
    private void assertFizzBuzzOutput(int n, String expected) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        
        fb.fizzBuzz(n);
        System.out.flush();
        
        org.junit.Assert.assertEquals(expected, baos.toString());
    }

    @org.junit.Test
    public void testFizzBuzz() throws IOException {
        assertFizzBuzzOutput(1, "1\n");
        assertFizzBuzzOutput(2, "1\n2\n");
        assertFizzBuzzOutput(3, "1\n2\nFizz\n");
        assertFizzBuzzOutput(5, "1\n2\nFizz\n4\nBuzz\n");
        assertFizzBuzzOutput(15, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
    }

    @org.junit.Test
    public void testMultiplesOfThree() throws IOException {
        assertFizzBuzzOutput(3, "1\n2\nFizz\n");
        assertFizzBuzzOutput(6, "1\n2\nFizz\n4\nBuzz\nFizz\n");
        assertFizzBuzzOutput(9, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n");
    }

    @org.junit.Test
    public void testMultiplesOfFive() throws IOException {
        assertFizzBuzzOutput(5, "1\n2\nFizz\n4\nBuzz\n");
        assertFizzBuzzOutput(10, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n");
    }

    @org.junit.Test
    public void testFizzBuzzNumbers() throws IOException {
        assertFizzBuzzOutput(15, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
        assertFizzBuzzOutput(30, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n");
    }
}