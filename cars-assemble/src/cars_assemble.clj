(ns cars-assemble)

(defn success-rate [speed] (condp <= speed 10 0.77 9 0.8 5 0.9 1 1.0 0))

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (-> speed
      success-rate
      (* speed 221)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (-> speed
      production-rate
      (quot 60)
      int))
