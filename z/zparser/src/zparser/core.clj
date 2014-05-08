(ns zparser.core
  (:require [instaparse.core :as ip]))

(def as-and-bs
  (ip/parser
    "S = AB*
     AB = A B
     A = '∀'+
     B = 'b'+"))

(as-and-bs "∀∀∀bbb∀∀∀∀∀bb")
