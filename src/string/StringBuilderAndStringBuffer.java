package string;

public class StringBuilderAndStringBuffer {

    /*String
Immutability:String objects are immutable. Once a String object is created,
its value cannot be changed. Any modification to a String
results in the creation of a new String object.

Performance:Because String is immutable, operations that
modify strings (like concatenation) can lead to performance issues,
especially in loops or repeated operations. This is because every modification
creates a new String object and may involve copying characters.

Usage:Use String when you have a fixed value or when the string does
not need to be modified after creation. It's suitable for constant values
or where string data is not expected to change frequently.



StringBuilder
Mutability:StringBuilder objects are mutable. You can modify the contents of a StringBuilder
object without creating new instances. This makes it more efficient for operations
that involve frequent modifications to the string.

Thread Safety:StringBuilder is not synchronized, meaning it is not thread-safe.
It is designed for single-threaded scenarios where performance is critical and
synchronization overhead is not needed.

Performance:StringBuilder generally provides better performance for operations
like concatenation and modifications compared to String due to its mutable nature.
It avoids the overhead of creating multiple String instances.

Usage:Use StringBuilder when you need to perform a series of modifications or
concatenations to strings in a single thread. It's particularly useful in loops or
complex string-building scenarios.

StringBuffer
Mutability:Like StringBuilder, StringBuffer objects are mutable. You can change the contents
 of a StringBuffer object without creating new instances.

Thread Safety:StringBuffer is synchronized, meaning it is thread-safe.
It uses synchronized methods to ensure that multiple threads can safely access
and modify the StringBuffer instance without causing data corruption.

Performance:
Due to its synchronization, StringBuffer can be slower than StringBuilder in
scenarios where thread safety is not a concern. The synchronization adds
overhead, which can impact performance.

Usage:Use StringBuffer in multi-threaded scenarios where you need to modify strings but also
require thread safety. For most single-threaded scenarios, StringBuilder
is preferred due to better performance.

Summary of Differences
Immutability: String is immutable; StringBuilder and StringBuffer are mutable.

Thread Safety: String is inherently thread-safe due to immutability;
StringBuffer is synchronized (thread-safe), while StringBuilder is not synchronized (not thread-safe).

Performance: StringBuilder generally offers the best performance in single-threaded scenarios, followed by
StringBuffer (due to synchronization overhead). String can be inefficient for repeated modifications.
*/


    public static void main(String[] args) {

        //String
        String str = new String("Mam");

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Manik");           //16
        stringBuilder.append("ManikManikManikManikManik");                   //21 * 2 + 2

        System.out.println(stringBuilder.length());     //25
        System.out.println(stringBuilder.capacity());   //44


        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Manik");
        stringBuffer.append("ManikManikManikManikManik");
        System.out.println(stringBuffer.length());     //25
        System.out.println(stringBuffer.capacity());   //44
    }
}





















