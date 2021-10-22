(ns expoente.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, Pronto!"))

(defn potenciacao

  [base expoente]

  (cond

    (and (= base 0) (= expoente 0)) "Erro! Forma indeterminada!"

    (and (= base 0) (< expoente 0)) "Erro! Divisao por zero!"

    (>= expoente 0) (apply * (repeat expoente base))

    (< expoente 0) (/ 1 (apply * (repeat (* -1 expoente) base)))))


