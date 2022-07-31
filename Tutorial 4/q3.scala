/*
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output. Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String. This particular function will be used to apply the given
format to the "name" input. You can use the test inputs for, say, "Benny", "Niroshan", "Saman"
“Kumara”, and make sure that the output is as shown below.
Output:
BENNY
NIroshan
saman
KumarA
*/

object Main extends App {
    def toUpper(str: String): String = {
        str.toUpperCase
    }
    def toLower(str: String): String = {
        str.toLowerCase
    }
    def formatNames(name: String, format: String => String): String = {
        format(name)
    }
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", toLower))
    println(formatNames("Saman", toUpper))
    println(formatNames("KumarA", toLower))
}