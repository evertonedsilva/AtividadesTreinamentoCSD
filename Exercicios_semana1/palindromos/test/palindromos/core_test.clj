(ns palindromos.core-test
  (:require [clojure.test :refer :all]
            [palindromos.core :as p]
            
            ))

 
 (deftest palindroms-test

  (testing "Testando um palindromo"

    (is (= (p/pali? "racecar")

           true)))
    (testing "Testando um não palindromo"

    (is (= (p/pali? "123456")

           false)))
   
   
   
   
 )
 
 
 