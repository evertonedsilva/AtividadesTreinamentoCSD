(ns duplicate.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Pronto!"))

(defn twice
  [element]
(into [](concat element element)))
