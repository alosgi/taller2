package taller
import org.scalatest.funsuite.AnyFunSuite

class TestConjuntoDifusos extends AnyFunSuite {
    val c = new ConjDifusos()

    // test("Pertenece 3 en muchoMayorQue(3, 7)"){
    //         assert(c.Pertenece(3, c.muchoMayorQue(3, 7)) == 0.0)
    // }

    // test("Pertenece 5 en muchoMayorQue(1, 5)") {
    //     assert(c.Pertenece(5, c.muchoMayorQue(1, 5)) == 1.0)
    // }

    // test("Pertenece 0 en muchoMayorQue(1, 5)") {
    //     assert(c.Pertenece(0, c.muchoMayorQue(1, 5)) == 0.0)
    // }

    // test("Pertenece 7 en muchoMayorQue(3, 7)") {
    //     assert(c.Pertenece(7, c.muchoMayorQue(3, 7)) == 1.0)
    // }

    //------------------------------------------------------//
    // test("Pertenece 1 en grande(2, 2)") {
    // assert(c.Pertenece(1, c.grande(2, 2)) == math.pow(1.0 / (1 + 2), 2)) // (1 / 3)^2
    // }

    // test("Pertenece 2 en grande(2, 2)") {
    //     assert(c.Pertenece(2, c.grande(2, 2)) == math.pow(2.0 / (2 + 2), 2)) // (2 / 4)^2
    // }

    // test("Pertenece 3 en grande(2, 3)") {
    //     assert(c.Pertenece(3, c.grande(2, 3)) == math.pow(3.0 / (3 + 2), 3)) // (3 / 5)^3
    // }

    // test("Pertenece 4 en grande(3, 1)") {
    //     assert(c.Pertenece(4, c.grande(3, 1)) == math.pow(4.0 / (4 + 3), 1)) // 4 / 7
    // }

    // test("Pertenece 5 en grande(4, 2)") {
    //     assert(c.Pertenece(5, c.grande(4, 2)) == math.pow(5.0 / (5 + 4), 2)) // (5 / 9)^2
    // }

    //------------------------------------//

    // val conjuntoEjemplo = c.ConjuntoDifuso(x => if (x <= 5) 0.8 else 0.3)
    // val complementoEjemplo = c.complemento(conjuntoEjemplo)

    // test("Pertenece 3 en complemento de conjuntoEjemplo") {
    // assert(c.Pertenece(3, complementoEjemplo) == 1.0 - 0.8) // Debe devolver 0.2
    // }

    // test("Pertenece 6 en complemento de conjuntoEjemplo") {
    //     assert(c.Pertenece(6, complementoEjemplo) == 1.0 - 0.3) // Debe devolver 0.7
    // }

    // test("Pertenece 5 en complemento de conjuntoEjemplo") {
    //     assert(c.Pertenece(5, complementoEjemplo) == 1.0 - 0.8) // Debe devolver 0.2
    // }

    // test("Pertenece 0 en complemento de conjuntoEjemplo") {
    //     assert(c.Pertenece(0, complementoEjemplo) == 1.0 - 0.8) // Debe devolver 0.2
    // }

    // test("Pertenece 10 en complemento de conjuntoEjemplo") {
    //     assert(c.Pertenece(10, complementoEjemplo) == 1.0 - 0.3) // Debe devolver 0.7
    // }

    //------------------------------------//

    // val conjuntoDifuso1 = c.ConjuntoDifuso(x => if (x <= 3) 0.4 else 0.7)
    // val conjuntoDifuso2 = c.ConjuntoDifuso(x => if (x <= 3) 0.8 else 0.2)
    // val unionConjuntos = c.Union(conjuntoDifuso1, conjuntoDifuso2)

    // test("Pertenece 2 en union de conjuntoDifuso1 y conjuntoDifuso2") {
    //     assert(c.Pertenece(2, unionConjuntos) == math.max(0.4, 0.8)) // Debe devolver 0.8
    // }

    // test("Pertenece 4 en union de conjuntoDifuso1 y conjuntoDifuso2") {
    //     assert(c.Pertenece(4, unionConjuntos) == math.max(0.7, 0.2)) // Debe devolver 0.7
    // }

    // test("Pertenece 3 en union de conjuntoDifuso1 y conjuntoDifuso2") {
    //     assert(c.Pertenece(3, unionConjuntos) == math.max(0.4, 0.8)) // Debe devolver 0.8
    // }

    // test("Pertenece 1 en union de conjuntoDifuso1 y conjuntoDifuso2") {
    //     assert(c.Pertenece(1, unionConjuntos) == math.max(0.4, 0.8)) // Debe devolver 0.8
    // }

    // test("Pertenece 5 en union de conjuntoDifuso1 y conjuntoDifuso2") {
    //     assert(c.Pertenece(5, unionConjuntos) == math.max(0.7, 0.2)) // Debe devolver 0.7
    // }

    //------------------------------------------------------------------------------------//


// Definir dos conjuntos difusos adicionales de prueba
    // val conjuntoDifuso3 = c.ConjuntoDifuso(x => if (x % 2 == 0) 0.5 else 0.3)
    // val conjuntoDifuso4 = c.ConjuntoDifuso(x => if (x > 5) 0.6 else 0.4)
    // val unionConjuntos2 = c.Union(conjuntoDifuso3, conjuntoDifuso4)

    // test("Pertenece 2 en union de conjuntoDifuso3 y conjuntoDifuso4") {
    //     assert(c.Pertenece(2, unionConjuntos2) == math.max(0.5, 0.4)) // Debe devolver 0.5
    // }

    // test("Pertenece 7 en union de conjuntoDifuso3 y conjuntoDifuso4") {
    //     assert(c.Pertenece(7, unionConjuntos2) == math.max(0.3, 0.6)) // Debe devolver 0.6
    // }

    // test("Pertenece 4 en union de conjuntoDifuso3 y conjuntoDifuso4") {
    //     assert(c.Pertenece(4, unionConjuntos2) == math.max(0.5, 0.4)) // Debe devolver 0.5
    // }

    // test("Pertenece 6 en union de conjuntoDifuso3 y conjuntoDifuso4") {
    //     assert(c.Pertenece(6, unionConjuntos2) == math.max(0.5, 0.6)) // Debe devolver 0.6
    // }

    // test("Pertenece 5 en union de conjuntoDifuso3 y conjuntoDifuso4") {
    //     assert(c.Pertenece(5, unionConjuntos2) == math.max(0.3, 0.4)) // Debe devolver 0.4
    // }

    //------------------------------------------------------------------------------------//

    // val conjuntoDifuso5 = c.ConjuntoDifuso(x => if (x <= 4) 0.9 else 0.2)
    // val conjuntoDifuso6 = c.ConjuntoDifuso(x => if (x % 2 == 0) 0.7 else 0.4)
    // val interseccionConjuntos = c.Interseccion(conjuntoDifuso5, conjuntoDifuso6)

    // test("Pertenece 3 en interseccion de conjuntoDifuso5 y conjuntoDifuso6") {
    //     assert(c.Pertenece(3, interseccionConjuntos) == math.min(0.9, 0.4)) // Debe devolver 0.4
    // }

    // test("Pertenece 2 en interseccion de conjuntoDifuso5 y conjuntoDifuso6") {
    //     assert(c.Pertenece(2, interseccionConjuntos) == math.min(0.9, 0.7)) // Debe devolver 0.7
    // }

    // test("Pertenece 5 en interseccion de conjuntoDifuso5 y conjuntoDifuso6") {
    //     assert(c.Pertenece(5, interseccionConjuntos) == math.min(0.2, 0.4)) // Debe devolver 0.2
    // }

    // test("Pertenece 6 en interseccion de conjuntoDifuso5 y conjuntoDifuso6") {
    //     assert(c.Pertenece(6, interseccionConjuntos) == math.min(0.2, 0.7)) // Debe devolver 0.2
    // }

    // test("Pertenece 4 en interseccion de conjuntoDifuso5 y conjuntoDifuso6") {
    //     assert(c.Pertenece(4, interseccionConjuntos) == math.min(0.9, 0.7)) // Debe devolver 0.7
    // }

    //------------------------------------------------------------------------------------//
    val conjuntoDifuso7 = c.ConjuntoDifuso(x => if (x <= 500) 0.2 else 0.5)
    val conjuntoDifuso8 = c.ConjuntoDifuso(x => if (x <= 500) 0.3 else 0.5)
    val conjuntoDifuso9 = c.ConjuntoDifuso(x => if (x <= 300) 0.6 else 0.3)

    // // Pruebas para Inclusion
    // test("Inclusion de conjuntoDifuso7 en conjuntoDifuso8") {
    //     assert(c.Inclusion(conjuntoDifuso7, conjuntoDifuso8) == true) // Debe devolver true
    // }

    // test("Inclusion de conjuntoDifuso8 en conjuntoDifuso7") {
    //     assert(c.Inclusion(conjuntoDifuso8, conjuntoDifuso7) == false) // Debe devolver false
    // }

    // test("Inclusion de conjuntoDifuso9 en conjuntoDifuso8") {
    //     assert(c.Inclusion(conjuntoDifuso9, conjuntoDifuso8) == false) // Debe devolver false
    // }

    // test("Inclusion de conjuntoDifuso7 en conjuntoDifuso9") {
    //     assert(c.Inclusion(conjuntoDifuso7, conjuntoDifuso9) == false) // Debe devolver false
    // }

    // test("Inclusion de conjuntoDifuso8 en sí mismo") {
    //     assert(c.Inclusion(conjuntoDifuso8, conjuntoDifuso8) == true) // Debe devolver true
    // }

    //----------------------------------------------------------------------------------------//
    test("Igualdad entre conjuntoDifuso7 y conjuntoDifuso7") {
    assert(c.Igualdad(conjuntoDifuso7, conjuntoDifuso7) == true) // Debe devolver true
    }

    test("Igualdad entre conjuntoDifuso7 y conjuntoDifuso8") {
        assert(c.Igualdad(conjuntoDifuso7, conjuntoDifuso8) == false) // Debe devolver false
    }

    test("Igualdad entre conjuntoDifuso8 y conjuntoDifuso9") {
        assert(c.Igualdad(conjuntoDifuso8, conjuntoDifuso9) == false) // Debe devolver false
    }

    test("Igualdad entre dos funciones idénticas") {
        val conjuntoDifuso10 = c.ConjuntoDifuso(x => 0.5)
        val conjuntoDifuso11 = c.ConjuntoDifuso(x => 0.5)
        assert(c.Igualdad(conjuntoDifuso10, conjuntoDifuso11) == true) // Debe devolver true
    }

    test("Igualdad entre conjuntos difusos con patrones distintos") {
        val conjuntoDifuso12 = c.ConjuntoDifuso(x => if (x % 2 == 0) 0.6 else 0.4)
        val conjuntoDifuso13 = c.ConjuntoDifuso(x => if (x % 2 == 0) 0.6 else 0.5)
        assert(c.Igualdad(conjuntoDifuso12, conjuntoDifuso13) == false) // Debe devolver false
    }

}
