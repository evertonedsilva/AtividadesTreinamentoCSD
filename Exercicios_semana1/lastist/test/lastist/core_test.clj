(ns lastist.core-test
  (:require [clojure.test :refer :all]
            [lastist.core :as lt]))
 
 (deftest lastist-test

  (testing "Testando retorno correto do ultimo elemento"

    (is (= (lt/lastist [10 20 30 67])

           67)))
   
 )
 
