(ns lista2.core-test
  (:require [clojure.test :refer :all]
            [lista2.core :as l2]))

; exercício 1
(deftest vector_product
  (testing "vetores de mesmo tamanho"
    (is (= (l2/vec_prod [3 4][2 5])
           [6 20]))))

; exercício 2
(deftest factorial
  (testing "fatorial de numero positivo"
    (is (= (l2/fact 4)
           24       ))   
  )
  
)
; exercício 3
;Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
(deftest fibonacci
  (testing "Fibonnaci numero positivo"
    (is (= (l2/fbnc 8)
           21    ))
    )
  (testing "Fibonnaci numero igual a 0"
    (is (= (l2/fbnc 0)
           0    ))
    )
  (testing "Fibonnaci numero igual a 1"
    (is (= (l2/fbnc 1)
           1    ))
    )
  (testing "Fibonnaci numero negativo"
    (is (= (l2/fbnc -8)
           "Erro! Entrada negativa não suportada"   ))
    )
  (testing "Fibonnaci numero negativo decimal"
    (is (= (l2/fbnc -8.0)
           "Erro! Entrada negativa não suportada"))
    )
 
  (testing "Fibonnaci como entrada string"
    (is (= (l2/fbnc "oi")
          "Erro! Entrada string é inválida"  ))
    )
  )

; exercício 4
(deftest FizzBuzz3-5
  (testing "testando retorno da função"
    (is (= (l2/seqFizzBuzz)
         '(1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" "Buzz" 11 "Fizz" 13 14 
          "FizzBuzz" 16 17 "Fizz" 19 "Buzz" "Fizz" 22 23 "Fizz" "Buzz" 26 
          "Fizz" 28 29 "FizzBuzz" 31 32 "Fizz" 34 "Buzz" "Fizz" 37 38 "Fizz" 
          "Buzz" 41 "Fizz" 43 44 "FizzBuzz" 46 47 "Fizz" 49 "Buzz" "Fizz" 
          52 53 "Fizz" "Buzz" 56 "Fizz" 58 59 "FizzBuzz" 61 62 "Fizz" 64 "Buzz" 
          "Fizz" 67 68 "Fizz" "Buzz" 71 "Fizz" 73 74 "FizzBuzz" 76 77 "Fizz" 
          79 "Buzz" "Fizz" 82 83 "Fizz" "Buzz" 86 "Fizz" 88 89 "FizzBuzz" 91 92 
          "Fizz" 94 "Buzz" "Fizz" 97 98 "Fizz" "Buzz")       
       )
    )   
  )
  
)
; exercício 5
(deftest inverter_sequencia
(testing "retorno com lista comum"
  (is (= (l2/invert '(1 "oi" 56 0.6)) 
      '(0.6 56 "oi" 1) ))
  
  )  

(testing "retorno com lista vazia"
  (is (= (l2/invert '()) 
      '() ))
  )
  )

; exercício 8
(deftest divisíveis
(testing "retorno com exemplos comuns"
  (is (= (l2/divis 10 3 11)
   '(12 15 18 21 24 27 30 33 36 39)  
       ) 
  )
)
)