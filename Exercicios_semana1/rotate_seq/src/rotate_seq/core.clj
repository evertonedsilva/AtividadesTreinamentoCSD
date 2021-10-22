(ns rotate-seq.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Pronto!"))
(defn rotate
  [lista numero]
  (if (or (> numero (count lista)) (> (* -1 numero) (count lista))) "Erro!"
    (cond
    (>= numero 0) (concat (subvec (vec lista) numero) (subvec (vec lista) 0 numero))
    (< numero 0) (concat (subvec (vec lista) (apply + [(count lista) numero]) (+ (count lista)))
                         (subvec (vec lista) 0 (apply + [(count lista) numero])))
    )     
      
  )  
  
)