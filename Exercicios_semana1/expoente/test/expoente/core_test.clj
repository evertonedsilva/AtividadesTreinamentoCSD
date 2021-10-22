(ns expoente.core-test
  (:require [clojure.test :refer :all]
            [expoente.core :as exp]))

(deftest potenciacao-test

  (testing "[OK] Testando funcao potenciacao com base positiva e expoente positivo"

    (is (= (exp/potenciacao 2 3)

           8)))

  (testing "[ERRO] Testando erro da funcao potenciacao"

    (is (not= (exp/potenciacao 2 3)

              4)))

  (testing "[OK] Testando funcao potenciacao com base positiva e expoente nulo"

    (is (= (exp/potenciacao 2 0)

           1)))

  (testing "[OK] Testando funcao potenciacao com base positiva e expoente igual a 1"

    (is (= (exp/potenciacao 2 1)

           2)))

  (testing "[OK] Testando funcao potenciacao com base zero e expoente positivo"

    (is (= (exp/potenciacao 0 3)

           0)))

  (testing "[OK] Testando funcao potenciacao com base positiva e expoente negativo"

    (is (= (exp/potenciacao 2 -3)

           1/8)))

  (testing "[OK] Testando funcao potenciacao com base zero e expoente zero"

    (is (= (exp/potenciacao 0 0)

           "Erro! Forma indeterminada!")))

  (testing "[OK] Testando funcao potenciacao com base zero e expoente negativo"

    (is (= (exp/potenciacao 0 -3)

           "Erro! Divisao por zero!")))
  
  (testing "[OK] Testando funcao potenciacao com base negativa e expoente positivo"

    (is (= (exp/potenciacao -2 3)

           -8)))
  
  (testing "[OK] Testando funcao potenciacao com base negativa e expoente negativo"

    (is (= (exp/potenciacao -2 -3)

           -1/8)))
  
  
           
           )
           
