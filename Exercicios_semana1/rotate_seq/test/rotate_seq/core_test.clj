(ns rotate-seq.core-test
  (:require [clojure.test :refer :all]
            [rotate-seq.core :as rot]))


(deftest rotation-test

  (testing "Testando com numero positivo"

    (is (= (rot/rotate '("a" "b" "c" "d" "e") 2)

            '("c" "d" "e" "a" "b"))
    )
  )  
 
  (testing "Testando com numero negativo"

    (is (= (rot/rotate '("a" "b" "c" "d" "e") -2)

            '("d" "e" "a" "b" "c"))
    )
  ) 
  
    (testing "Testando com numero positivo e maior que o tamanho da sequencia"

    (is (= (rot/rotate '("a" "b" "c" "d" "e") 6)
           "Erro!")
    )
  )
   (testing "Testando com numero negativo e com módulo maior que o tamanho sequencia"

    (is (= (rot/rotate '("a" "b" "c" "d" "e") -6)
           "Erro!")
    )
  )
   
   (testing "Testando com numero igual ao tamanho da sequencia"

    (is (= (rot/rotate '("a" "b" "c" "d" "e") -5)
           '("a" "b" "c" "d" "e"))
    )
  )
 
  
  
  
  
 )

