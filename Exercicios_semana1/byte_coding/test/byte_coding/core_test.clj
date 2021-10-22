(ns byte-coding.core-test
  (:require [clojure.test :refer :all]
            [byte-coding.core :as bcod]))


 (deftest byte_coding-test

   (testing "Testando uma string"

     (is (= (bcod/byte_cod "abobrinha")

            "cesgxpvqk")))
   
   (testing "Testando uma string"

     (is (= (bcod/byte_dec "cesgxpvqk")

           "abobrinha" )))
   
   
   

   )



