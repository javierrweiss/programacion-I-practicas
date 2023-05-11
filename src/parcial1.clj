(ns parcial1)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; ¡¡¡¡LEA CON ATENCIÓN!!! ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; I. En esta evaluación se encontrará con un conjunto de funciones que deberá completar de acuerdo a su premisa respectiva. Así que tómese la 
;; libertad de modificar el cuerpo de la función según lo considere apropiado.
;; De igual modo, siempre que lo estime conveniente puede crear otras funciones que sirvan de auxiliares. Eso sí, nunca modifique el nombre 
;; ni la cantidad de argumentos de las funciones a completar.
;; Puede importar y requerir las librerías que juzgue convenientes. Agréguelas en el archivo deps.edn de ser necesario y reinicie el REPL.
;; II. Cada función cuenta con un conjunto de tests que verifican que trabaje correctamente. Oprima las teclas Ctrl + Alt + c luego Shift + t
;; para correr los tests. Alternativamente, puede presionar F1, escribir calva y buscar en el menú de comandos la opción "Run All Tests".
;; Si todos los tests resultan aprobados, usted habrá aprobado la evaluación con la máxima calificación. Puede correr los tests la cantidad
;; de veces que necesite.
;; No tiene permitido bajo ninguna circunstancia modificar el archivo de tests. Caso contrario quedará reprobado.
;; III. Utilice la forma (comment ) para explorar las respuestas y deje allí las cosas que intentó. Se considerará en la evaluación. 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; COMPLETE LAS SIGUIENTES FUNCIONES ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; 1. La siguiente función recibirá un vector de strings y deberá devolver un vector de booleanos, donde cada uno marcará true si la palabra 
;;    ubicada en tal posición es un diptongo o un hiato. En caso contrario, marcará false. 
;; PISTA: Convendría definir las vocales; el namespace clojure.set puede ser de ayuda.

(defn obtener-diptongos-y-hiatos
  [palabras]
  nil)

;; 2. Necesitamos calcular las posiciones de los equipos del campeonato local de fútbol. La siguiente función recibirá un vector de mapas
;;    donde cada mapa tendrá la siguiente forma {:local "EquipoA" :goles-local 1 :visitante "EquipoB" :goles-visitante 2}. Calcule los puntos
;;    de cada equipo y devuelva un vector de mapas ordenado con el equipo con mayor puntaje de primero de la siguiente forma 
;;    [{:equipo "EquipoA" :puntos 23} {:equipo "EquipoZ" :puntos 3} ...]

(defn calcula-posiciones
  [lista-resultados]
  nil)




(comment

  
  )