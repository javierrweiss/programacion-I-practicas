(ns recuperatorio)

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
;;      En primer lugar, evalúe este namespace (Ctrl + Alt + c y luego Enter) y posteriormente diríjase donde se encuentran los tests test/recuperatoriotest.clj
;;      y evalúe ese namespace también. Para correr los tests, diríjase a test/recuperatoriotest.clj 
;;      Luego puede evaluar el namespace completo y ver los resultados ó diríjase a los comments y evalúe (use 'midje.repl) y
;;      finalmente (check-facts *ns*). 

;;      Si pasaran todos los tests de las preguntas obligatorias, usted habrá aprobado la evaluación con la máxima calificación. 

;;      Puede correr los tests la cantidad de veces que necesite y, obviamente, cuando haya realizado una modificación en este archivo y quiera volver
;;      a correr los tests debe guardar el archivo y evaluar la función que quiera probar.

;;      Si surge algún error al correr los tests, guarde todo, evalúe primero este namespace, luego diríjase a la carpeta test y evalúe el archivo 
;;      correspondiente. 
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

;; 1. Un Sanatorio capitalino necesita un programa que indique adónde han sido derivados los pacientes. Para esto se manejan internamente con
;;    un código. 
;;    Si el código es 1, el paciente se deriva "a su médico de la obra social".
;;    2, "a su médico particular".
;;    3, "a su médico de cabecera".
;;    4, "a Consultorios Externos del Sanatorio".
;;    5, "continúa tratamiento indicado previamente".
;;    6, "a Internación".
;;    7, "ha fallecido".
;;    8, "a otro Sanatorio".
;;    9, "al Geriátrico".
;;    Si el código ingresado no corresponde con ninguno, devolver "Código de derivación incorrecto"
;;    Complete la función de abajo para que realice correctamente esta tarea. (valor 5pts)
;;    NOTA: Revise el texto de los tests para verificar cómo queda la respuesta completa en cada caso. 

(defn deriva
  [codigo]
  "El paciente ")


;; 2. Ayudemos a un profesor de secundaria a pasar el acta final de notas. Recibirá un vector con las calificaciones.
;;    Si la calificación es menor o igual a 4 deberá añadir "Reprobado". Y si se encuentra entre 5 y 10 "Aprobado".
;;    Adicionalmente, si es mayor a 7 deberá añadir "Eximido" y si se encuentra entre 5 y 7 deberá añadir "Va a finales".
;;    Separe los elementos con comas (,)
;;    Debe devolver un vector de strings con las modificaciones indicadas, por ejemplo ["7, Aprobado, Va a finales"...]
;;    Si alguna de las calificaciones es superior a 10 ó menor a 0, descártela. 
;;    Si recibe cualquier otro tipo de dato, un vector vacío o un vector no numérico, debe devolver:
;;    "Datos incorrectos. Debe ingresar un vector numérico"
;;    (5pts)

(defn calificar
  [calificaciones]
  [])

