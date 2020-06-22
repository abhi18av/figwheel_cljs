(ns figwheel_cljs.core
  (:require [moment]))


(println (str "Hello there it's "
              (.format (moment) "dddd")))

(comment
  (moment "1987-08-04")
  '())


(comment
  (-> (js/Promise.resolve 42)
      (.then #(js/console.log %))
      (.catch #(js/console.log %))
      (.finally #(js/console.log "cleanup")))

  '())
