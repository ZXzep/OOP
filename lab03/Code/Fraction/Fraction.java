public class Fraction {
    public int topN;
    public int btmN;
    public double toFloat(){
        double topN2 = topN, btmN2 = btmN;
        double ans = topN2/btmN2;
        return ans;
    }
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public boolean myEquals(Fraction x){
        return (topN == x.topN/x.topN && btmN == x.btmN/x.topN);
        
    }
    public void LowestTermFrac(){
        if (btmN % topN == 0){
            btmN /= topN;
            topN /= topN;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        Fraction f2 = new Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        Fraction f3 = new Fraction();
        f3.topN = 5;
        f3.btmN = 15;
       
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
        }
}
