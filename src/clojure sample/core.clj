(ns clojure sample.core)


(defn meditate "meditate v2" [s calmness-level]
  (println "Clojure medidate v2.0")
  (if (< calmness-level 4) (str(clojure.string/upper-case s) ", I TELL YA")
  (if(<= 4 calmness-level 9) (clojure.string/capitalize s)
  (when(= calmness-level 10) (clojure.string/reverse s)))))

(def base-co2 382)

(def base-year 2006)

(defn calculate-co2 "calculates the co2 for a given year" [year]
  (let [yeardiff (- year base-year)]
    (+ 382 (* yeardiff 2))
    )
  )




