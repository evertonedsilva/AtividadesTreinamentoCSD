(ns palindromos.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Pronto!"))

(defn pali?
  [element]
  (= (apply str (reverse element)) element
         ))
