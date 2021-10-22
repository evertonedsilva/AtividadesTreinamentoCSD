(ns lastist.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Pronto!")
  )

(defn lastist
  [lista]
  (get lista (- (count lista) 1))
  )
