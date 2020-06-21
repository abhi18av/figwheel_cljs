(ns figwheel_cljs.core
  (:require [moment]))

(js/console.log moment)

(println (str "Hello there it's "
              (.format (moment) "dddd")))