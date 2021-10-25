(ns lista2.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Pronto!"))
; exercício 1
(defn vec_prod
  [vec1 vec2]
  (mapv * vec1 vec2)   
  )
; exercício 2
(defn fact
  [number]
  (apply * (range 1 (+ 1 number)))  
)
; exercício 3
(defn fbnc
  [numero]
  (cond
    (string? numero ) "Erro! Entrada string é inválida"  
    (< numero 0) "Erro! Entrada negativa não suportada"
    (>(- numero (int numero)) 0) "Erro! Entrada decimal não suportada"  
    (= numero 0) 0
    (= numero 1) 1
    (> numero 1) (+ (fbnc (- (int numero) 1)) (fbnc (- (int numero) 2)))
    ) 
)
; exercício 4
(defn seqFizzBuzz
  []
  (for [x (range 1 101)] 
    (cond
      (and (= (rem x 3) 0) (= (rem x 5) 0))  "FizzBuzz"
      (= (rem x 3) 0) "Fizz"
      (= (rem x 5) 0) "Buzz"
      :else x)   
    )
)
; exercício 5
(defn invert
  [sequence]
  (for [x (range (- (count sequence) 1) -1 -1)]
    (get (vec sequence) x)
    )  
  )

; exercício 8
;n: numero de divisíveis
;p: divisor de interesse
;x: limite inferior de interesse
  (defn divis
    [n p x]
    (take n (iterate (partial + p)  (apply + [x (* -1 (rem x p)) p]) ))

    )

    
    