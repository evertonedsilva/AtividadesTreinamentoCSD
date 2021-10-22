(ns byte-coding.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Pronto!"))

(defn byte_cod
  [string]
  (apply str (map char (map + (map int (concat string)) (iterate inc 2)) ))
  )

(defn byte_dec
  [string]
  (apply str (map char (map + (map int (concat string)) (iterate inc -2)) ))
  )