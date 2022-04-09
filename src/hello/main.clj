(ns hello.main
  (:gen-class))

(require '[clojure.core.match :refer [match]])

(defn acker [m n]
  (match [m n]
   [0 n] (+ n 1)
   [m 0] (acker (- m 1) 1)
   [m n] (acker (- m 1) (acker m (- n 1)))))
  
(defn -main [& args]
  (let [m 4
        n 1]
    (println "Ackermann(" m ", " n ")")
    (println (acker m n))))
  