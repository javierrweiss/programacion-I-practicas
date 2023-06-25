(ns finaltest
  (:require [midje.sweet :as m]
            [final :refer :all]))

(m/fact
 (sucesivos? (range 1 11)) => true
 (sucesivos? (range 0 10 2)) => false
 (sucesivos? (range 1 10 2)) => false
 (sucesivos? (range 50 101)) => true)
 
(m/fact
 (sacude-palabras "Marmota")     => "Maamort"
 (sacude-palabras "corajudo")    => "acdjooru"
 (sacude-palabras "envejecido")  => "cdeeeijnov"
 (sacude-palabras "Altavista")   => "Aaailsttv"
 (sacude-palabras "enmienda")    => "adeeimnn"
 (sacude-palabras "ates0r4r")    => "aerrst"
 (sacude-palabras "3lev4r")      => "elrv")   

(comment
  (use 'midje.repl)
  (check-facts *ns*)
  )