(ns duplicate.core-test
  (:require [clojure.test :refer :all]
            [duplicate.core :as dupl]))



(deftest duplicate-test
    (testing "Testando duplicacao"

    (is (= (dupl/twice [1])

           [1 1])))
)