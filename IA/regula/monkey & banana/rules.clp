(defrule acercar-mono-a-silla
    ?hecho-actual <- (mono muro)
    =>
    (retract ?hecho-actual)
    (assert (mono silla) )
    (printout t "El mono esta hambriento y se acerca  en donde esta la silla " crlf)
)
(defrule llevar-silla
    ?hecho-actual  <- (silla suelo)
    ?hecho-actual2 <- (mono silla)
    ?hecho-actual3 <- (silla mesa)
    =>
    (retract ?hecho-actual ?hecho-actual2 ?hecho-actual3)
    (assert (silla mesa) (mono mesa))
    (printout t "El mono lleva la silla en donde esta  la mesa y sube la silla  a la mesa  " crlf)
)


(defrule subir-mono-a-mesa
    ?hechoactual <- (silla mesa)
    ?hechoactual1 <- (mono mesa)
    ?hechoactual2 <- (mono suelo)
    =>
    (retract ?hechoactual1 ?hechoactual2 )
    (assert (mono mesa))
    (printout t "El mono sube a la mesa parado agarrandose de la silla" crlf)
)
 
(defrule subir-mono-a-silla
    ?hechoactual <- (silla mesa)
    ?hechoactual1 <- (mono mesa)
    =>
    (retract ?hechoactual1)
    (assert (mono silla))
    (printout t "El mono sube a la silla para lograr alcanzar la banana" crlf)
)

(defrule mono-toma-la-banana
    ?hechoactual <-  (mono silla)
    ?hechoactual1 <- (banana techo)
    =>
    (retract ?hechoactual1)
    (assert (el-mono-tiene-la-banana))
    (printout t "El mono alcanza la banana" crlf)
)

(defrule mono-come-la-banana
    ?hechoactual <-  (mono silla)
    ?hechoactual1 <- (el-mono-tiene-la-banana)
    =>
    (retract ?hechoactual1)
    (assert (el-mono-come-la-banana))
    (printout t "El mono se  come la banana" crlf)
)
(defrule cambiar-estado-del-mono
    ?hechoactual <-  (el-mono-esta hambriento)
    ?hechoactual1 <-  (el-mono-come-la-banana) 
    =>
    (retract ?hechoactual ?hechoactual1)
    (assert (el-mono-esta feliz))
    (printout t "El mono está contento" crlf)
)