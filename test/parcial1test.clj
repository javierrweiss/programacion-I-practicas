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



