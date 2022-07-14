object Question {
    def main(args: Array[String]): Unit = {
        // (a) a=1,b=2 (b) a=1, b=3 (c) a=2, b=3 (d) a=2, b=2
        var (a,b) = (1,2); // ### \n ===
        // var (a,b) = (1,3); // ### \n ===
        // var (a,b) = (2,3); // ===
        // var (a,b) = (2,2); // ===
        if (a==1)
            if (b==1)
                System.out.println("***");
            else
                System.out.println("###");
        System.out.println("===");
    }
}