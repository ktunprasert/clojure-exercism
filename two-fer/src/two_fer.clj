(ns two-fer)

(defn two-fer
  "Returns what you will say as you give away the extra cookie."
  ([name]
   (str "One for " (or name "you") ", one for me."))
  ([]
   "One for you, one for me."))
