(ns clojure.lang.protocols
  (:refer-clojure :only [alter-var-root defprotocol extend-protocol fn]))

(defprotocol IMeta
  (meta [this]))

(extend-protocol IMeta
  nil
  (meta [this] nil)
  Object
  (meta [this] nil))

(alter-var-root #'clojure.core/meta (fn [_] (fn [x] (meta x))))
