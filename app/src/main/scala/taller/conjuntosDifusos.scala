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

    def complemento(s: ConjuntoDifuso): ConjuntoDifuso = {
        def Auxcomp(x: Int): Double = {
            1.0 - s(x)
        }
        Auxcomp
    }

    def Union(cd1: ConjuntoDifuso, cd2: ConjuntoDifuso): ConjuntoDifuso = {
        def auxUnion(x: Int): Double = {
            math.max(cd1(x), cd2(x))
        }
        auxUnion
    }

    
    def Igualdad(cd1: ConjuntoDifuso, cd2: ConjuntoDifuso): Boolean = {
        def AuxIgualdad(x: Int): Boolean = {
            if (x>1000) true 
            else if (cd1(x) != cd2(x)) false
            else AuxIgualdad(x+1)
        }
        AuxIgualdad(0)
    }

    def Inclusion (cd1: ConjuntoDifuso, cd2: ConjuntoDifuso): Boolean = {
        def AuxInclusion(x: Int): Boolean = {
            if (x>1000) true
            else if (cd1(x) > cd2(x)) false//0,2 esta incluido 0,199999
            else AuxInclusion(x+1)

        }
        AuxInclusion(0)//hasta que mi iterador llegue a 1001
    }

}