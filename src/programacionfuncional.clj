(ns programacionfuncional)

(def datos (range 1 100 2))

(map inc datos)
 
(defn sumar
  [a b]
  (+ a b))

(sumar 12 12)

(def mapa {:a "ad"
           :b 12})
(:a mapa)

[1 3232]

(list 2 423)

#{1 2 3 4}

(->> datos (map inc) (filter even?))

