public class ExceptionHandling3 {

    public static String verifyName(String name) throws CustomException {
        if (name.endsWith("rohith")) {
            throw new CustomException("invalid name");
        }
        return "verified";
    }

    public static void main(String[] args) {
        try {
            verifyName("rohith");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("executing by default");
        }
    }
}
