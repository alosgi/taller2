package taller


class ConjuntosDifusos {

    type ConjuntoDifuso = Int => Double

    //Para poder definir un conjunto difuso, se debe definir una función que reciba un entero y devuelva un double
    object ConjuntoDifuso {
        def apply(f: Int => Double): ConjuntoDifuso = f
    }

    def Pertenece(elemen : Int, s: ConjuntoDifuso): Double = {
        s(elemen)
    }

    def  muchoMayorQue(a: Int, m:Int): ConjuntoDifuso = {
        
        //x funciona para evaluar el conjunto difuso
        def mma(x: Int): Double={
            
            if (x <= a) 0.0
            else if (x > a && x <= m) (x-a).toDouble/(m-a).toDouble 
            else 1.0
        
        }
        mma
    }

}