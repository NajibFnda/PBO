public class Sum {

 // Overloaded jumlah(). Method ini memiliki 2 parameter
 public int jumlah(int x, int y)
 {
 return (x + y);
 }

 // Overloaded jumlah(). Method ini memiliki 3 parameter
 public int jumlah(int x, int y, int z)
 {
 return (x + y + z);
 }

 // Overloaded jumlah(). Method ini memiliki 2 paramater dengan tipe data double
 public double jumlah(double x, double y)
 {
 return (x + y);
 }

 // Driver code
 public static void main(String args[])
 {
 Sum s = new Sum();
 System.out.println(s.jumlah(10, 20));
 System.out.println(s.jumlah(10, 20, 30));
 System.out.println(s.jumlah(10.5, 20.5));
 }
}