(ns final)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; ¡¡¡¡LEA CON ATENCIÓN!!! ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; I. En esta evaluación se encontrará con un conjunto de funciones que deberá completar de acuerdo a su premisa respectiva. Así que tómese la 
;;    libertad de modificar el cuerpo de la función según lo considere apropiado.
;;    De igual modo, siempre que lo estime conveniente puede crear otras funciones que sirvan de auxiliares. Eso sí, nunca modifique el nombre 
;;    ni la cantidad de argumentos de las funciones a completar.
;;    Puede importar y requerir las librerías que juzgue convenientes (e.g. clojure.string ó clojure.set). 

;;  II. Al conectarse al REPL ¡NO! seleccione la opción :test, déjela sin marcar y presione OK en el cuadro de diálogo.

;; III. Cada función cuenta con un conjunto de tests que verifican que trabaje correctamente. Antes que nada asegúrese de evaluar los namespaces.
;;      En primer lugar, evalúe este namespace (Ctrl + Alt + c y luego Enter) y posteriormente diríjase donde se encuentran los tests test/finaltest.clj
;;      y evalúe ese namespace también. Para correr los tests,  Para correr los tests, diríjase a test/finaltest.clj
;;      Luego puede evaluar el namespace completo y ver los resultados ó diríjase a los comments y evalúe (use 'midje.repl) y
;;      finalmente (check-facts *ns*). 

;;      Si pasaran todos los tests de las preguntas obligatorias, usted habrá aprobado la evaluación con la máxima calificación. 

;;      Puede correr los tests la cantidad de veces que necesite y, obviamente, cuando haya realizado una modificación en este archivo y quiera volver
;;      a correr los tests debe guardar el archivo y evaluar la función que quiera probar.

;;      Si surge algún error al correr los tests, guarde todo, evalúe primero este namespace, luego diríjase a la carpeta test y evalúe el archivo 
;;      parcial1test.clj. 
;;      Recuerde que para evaluar todo el namespace debe presionar Ctrl + Alt + c y luego Enter. O en su defecto presionar F1 y buscar la opción 
;;      "Load / Evaluate Current File..." en el menu de comandos de Calva. 

;;      No tiene permitido bajo ninguna circunstancia modificar el archivo de tests. Caso contrario quedará reprobado.

;; IV. Utilice la forma (comment ) para explorar las respuestas y deje allí las cosas que intentó. Se considerará en la evaluación. 

;; V. No olvide guardar (Ctrl + k y luego s) sus progresos y cuando esté listo diríjase al ícono de Source Control/ Control de versiones, haga click 
;;     en el ícono al lado derecho de Commit y, finalmente, haga click sobre la opción Commit & Push para subir los cambios a su repositorio.

;; VI. Si tiene dudas o problemas no dude en presentar su consulta en el Foro del Aula Virtual. 


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; COMPLETE LAS SIGUIENTES FUNCIONES ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; 1. Cree una función que devuelva true cuando la colección que se le pase como argumento esté compuesta por números sucesivos (e.g. 1,2,3,4...) 
;;    y false en caso contrario. (5 pts)

(defn sucesivos?
  [coll]
  nil)


;; 2. Estamos creando un juego palabras en línea. Se le pide que cree una función que reciba una palabra (un String), a) convierta cada uno de sus caracteres a código ASCII,
;;    b) ordene la colección de números resultante de menor a mayor, c) que convierta de nuevo esos números a caracteres y, d) finalmente, que devuelva un String con la 
;;    palabra resultante. Por ejemplo, si recibe el String "Hola", sus caracteres son \H \o \l \a y los códigos ASCII correspondientes son 72 111 108 97. Al ordenalos tenemos
;;    72 111 108 97, llevados a caracteres es \H \a \l \o y, finalmente, como String quedaría "Halo". 
;;    Si el String que recibe como input contiene algún número, descártelo.
;;    (5 pts)

(defn sacude-palabras
  [palabra]
  nil)



