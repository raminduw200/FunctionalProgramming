object Main {
    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    def main(args: Array[String]): Unit = {
        print("Enter Shift: ");
        var shift = (scala.io.StdIn.readInt() + alphabet.length) % alphabet.length;

        var mssg = scala.io.StdIn.readLine("Enter Message: ");
        var enc = encrypt(mssg, shift);
        println("Encrypt Message: " + enc);
        var denc = decrypt(enc, shift);
        println("Decrypt Message: " + denc);
    }
    
    def encrypt(mssg: String, shift: Int): String = {
        mssg.map((c: Char) => {
            var indx = alphabet.indexOf(c.toUpper);
            if(indx == -1)
                c
            else
                alphabet((indx + shift) % alphabet.length);
        });
    }

    def decrypt(mssg: String, shift: Int): String = {
        mssg.map((c: Char) => {
            var indx = alphabet.indexOf(c);
            var x = indx-shift;
            if(indx == -1)
                c
            else if(x>=0) 
                alphabet(x);
            else
                alphabet(alphabet.length + x);
        });
    }
}