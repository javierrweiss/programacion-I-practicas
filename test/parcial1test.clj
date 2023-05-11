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

(deftest posiciones-en-la-tabla
  (let [resultados [{:local "Atlanta" :goles-local 3 :visitante "Newell's" :goles-visitante 3}
                    {:local "Real Madrid" :goles-local 2 :visitante "Manchester City" :goles-visitante 3}
                    {:local "Boca Juniors" :goles-local 2 :visitante "River Plate" :goles-visitante 6}
                    {:local "Atlanta" :goles-local 1 :visitante "Real Madrid" :goles-visitante 3}
                    {:local "River Plate" :goles-local 4 :visitante "Manchester City" :goles-visitante 5}
                    {:local "Boca Juniors" :goles-local 0 :visitante "Newell's" :goles-visitante 0}]
        posiciones (calcula-posiciones resultados)]
    (testing "El resultado es un vector y contiene mapas con la forma correcta"
      (is (and (vector? posiciones) (apply (every-pred map? #(= (keys %) (list :equipo :puntos))) posiciones)))) 
    (testing "Manchester City es el primero con 6 puntos"
      (is (= {:equipo "Manchester City" :puntos 6} (first posiciones))))
    (testing "Boca Juniors o Atalanta está de último con 1 punto"
      (is (or (= {:equipo "Boca Juniors" :puntos 1} (last posiciones))
              (= {:equipo "Atlanta" :puntos 1} (last posiciones)))))))
 

(comment 
 (run-all-tests)
  
  
) 