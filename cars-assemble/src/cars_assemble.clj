(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (* (cond (= speed 0) 0.
           (< speed 5) 1.
           (< speed 9) 0.9
           (= speed 9) 0.8
           :else 0.77)
     speed
     221))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (quot (production-rate speed) 60)))
