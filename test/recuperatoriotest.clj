(ns recuperatoriotest
  (:require [midje.sweet :as m]
            [recuperatorio :refer :all]))

(m/fact
 (deriva 0) => "Código de derivación incorrecto"
 (deriva 1) => "El paciente fue derivado a su médico de la obra social"
 (deriva 2) => "El paciente fue derivado a su médico particular"
 (deriva 3) => "El paciente fue derivado a su médico de cabecera"
 (deriva 4) => "El paciente fue derivado a Consultorios Externos del Sanatorio"
 (deriva 5) => "El paciente continúa tratamiento indicado previamente"
 (deriva 6) => "El paciente fue derivado a Internación"
 (deriva 7) => "El paciente ha fallecido"
 (deriva 8) => "El paciente fue derivado a otro Sanatorio"
 (deriva 9) => "El paciente fue derivado al Geriátrico"
 (deriva 10) => "Código de derivación incorrecto"
 (deriva 11) => "Código de derivación incorrecto"
 (deriva "deriva, derivando") => "Código de derivación incorrecto"
 (deriva ##Inf) => "Código de derivación incorrecto")


(m/fact
 (calificar []) => "Datos incorrectos. Debe ingresar un vector numérico"
 (calificar [\a \e \i \o \u]) => "Datos incorrectos. Debe ingresar un vector numérico"
 (calificar "1 2 4 3 4 3 4 3 2 3 3 4 3 3 2 4 3 5 3 2 3") => "Datos incorrectos. Debe ingresar un vector numérico"
 (count (calificar [34 4 5 6 7 10 12 10 19 100 -12])) => 6
 (calificar [3 10 9 8 10 3 4 2 0 5]) => ["3, Reprobado"
                                         "10, Aprobado, Eximido"
                                         "9, Aprobado, Eximido"
                                         "8, Aprobado, Eximido"
                                         "10, Aprobado, Eximido"
                                         "3, Reprobado"
                                         "4, Reprobado"
                                         "2, Reprobado"
                                         "0, Reprobado"
                                         "5, Aprobado, Va a finales"])


(comment
  (use 'midje.repl) 
  (check-facts *ns*)
  )  