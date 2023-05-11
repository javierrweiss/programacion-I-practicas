(ns parcial1test
 (:require [clojure.test :refer :all]
           [parcial1 :refer :all]))

(deftest funcion-de-diptongos-y-hiatos
  (testing "La función devuelve un vector"
    (is (vector? (obtener-diptongos-y-hiatos ["abecedario" "prueba" "numero 1"]))))
  (testing "El vector output tiene la misma cantidad de elementos que el vector input"
    (let [v ["alfa" "beta" "zeta" "theta"]] 
      (is (= (count v) (count (obtener-diptongos-y-hiatos v))))))
  (testing "Diptongos y hiatos intercalados"
    (let [input ["payaso" "barbacoa" "pochoclos" "aullar" "comprender" "feudo"]
          resultado [false true false true false true]] 
      (is (= resultado (obtener-diptongos-y-hiatos input)))))
  (testing "Solo diptongos y hiatos"
    (let [input ["maullar" "caos" "precaución" "auto" "auxilio"]
          resultado [true true true true true]]
      (is (= resultado (obtener-diptongos-y-hiatos input)))))
  (testing "Ningún diptongo ni hiato"
    (let [input ["calla" "habla" "manzana" "pedregoso" "ancla" "tabla"]
          resultado [false false false false false false]]
      (is (= resultado (obtener-diptongos-y-hiatos input)))))
  (testing "Vocales repetidas"
    (let [input ["aalba" "viir"]
          resultado [false false]]
      (is (= resultado (obtener-diptongos-y-hiatos input))))))

(deftest evalua-temperaturas
  (testing "caluroso"
    (is (= "caluroso" (evaluar-temperatura 28.5))))
  (testing "frío"
    (is (= "frío" (evaluar-temperatura 2.7))))
  (testing "templado"
    (is (= "templado" (evaluar-temperatura 12))))
  (testing "helado"
    (is (= "helado" (evaluar-temperatura -50))))
  (testing "fresco"
    (is (= "fresco" (evaluar-temperatura 22.3))))
  (testing "calor extremo"
    (is (= "calor extremo" (evaluar-temperatura 48)))))
 
(deftest aplica-descuentos
  (let [p1 {:producto "campera" :precio 13432}
        p2 {:producto "pantalones" :precio 25000}
        p3 {:producto "zapatos" :precio 39021}
        p4 {:producto "cinturón" :precio 12000}]
    (testing (str "Aplica un descuento del 20% a " p1)
      (is (== 10745.6 (:precio (aplicar-descuento p1 20)))))
    (testing (str "Aplica un descuento del 5% a " p2)
      (is (== 23750 (:precio (aplicar-descuento p2 5)))))
    (testing (str "Aplica un descuente del 10% a " p3)
      (is (== 35118.9 (:precio (aplicar-descuento p3 10)))))
    (testing (str "Aplica un descuento del 0.25% a " p4)
      (is (== 11970 (:precio (aplicar-descuento p4 0.25)))))))

(deftest palabras-unicas 
  (let [input1 ["hola" "ola" "olla" "Hola" "OLLA" "oLa"]
        resp1 ["hola" "ola" "olla"]
        input2 ["vereda" "verídico" "VeReDa" "final" "fina" "FinaL"]
        resp2 ["vereda" "verídico" "final" "fina"]]
    (testing "Palabras únicas, primera prueba"
      (is (= resp1 (obtener-palabras-unicas input1))))
    (testing "Palabras únicas, segunda prueba"
      (is (= resp2 (obtener-palabras-unicas input2))))))



(comment 
  (run-all-tests) 
  (run-test funcion-de-diptongos-y-hiatos)
  (run-test aplica-descuentos)
  (run-test palabras-unicas) 
  (run-test evalua-temperaturas)
  ) 