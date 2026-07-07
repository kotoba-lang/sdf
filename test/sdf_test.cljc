(ns sdf-test
  (:require [clojure.test :refer [deftest is testing]]
            [sdf]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (find-ns 'sdf)))))
