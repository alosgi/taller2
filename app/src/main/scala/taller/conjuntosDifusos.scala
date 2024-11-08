package taller


class ConjuntosDifusos {

    type ConjuntoDifuso = Int => Double

    //Para poder definir un conjunto difuso, se debe definir una función que reciba un entero y devuelva un double
    object ConjuntoDifuso {
        def apply(f: Int => Double): ConjuntoDifuso = f
    }

}