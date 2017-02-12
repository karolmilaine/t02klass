public class kolmnurk{
  double a, b, c;
  public kolmnurk(double alus, double korgus, double kulg){
    a = alus;
    b = korgus;
    c = kulg;
    if(a <=0){throw new RuntimeException("Sobimatu alus");}
		if(b <=0){throw new RuntimeException("Sobimatu korgus");}
    if(c <=0){throw new RuntimeException("Sobimatu kulg");}
  }

  public double pindala(){
    return (a * b) / 2;
  }

  public double umbermoot(){
    return a + b + c;
  }

  public String toString(){
    return "Kolmnurga ümbermõõt on "+
           umbermoot()+" ja pindala "+pindala()+" ruutmeetrit.";
 }
}


/*
[karojyrg@greeny t02klass]$ javac kolmnurk.java
[karojyrg@greeny t02klass]$ javac kolmnurk_proov.java
[karojyrg@greeny t02klass]$ java kolmnurk_proov
Kolmnurga ümbermõõt on 29.0 ja pindala 35.0 ruutmeetrit.
Kolmnurga ümbermõõt on 49.0 ja pindala 102.0 ruutmeetrit.
Kolmnurga ümbermõõt on 50.0 ja pindala 104.0 ruutmeetrit.


*/
