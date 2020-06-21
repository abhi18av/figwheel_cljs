;; This file is only needed for use with Leinigen
(defproject figwheel-cljs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :profiles
    {:dev
      {:dependencies [[org.clojure/clojurescript "1.10.773"]
                      [com.wsscode/pathom "2.2.31"]
                      [org.clojure/core.async "1.2.603"]
                      [appliedscience/js-interop "0.2.4"]
                      [com.bhauman/figwheel-main "0.2.9"]]
       :resource-paths ["target" "resources"]
       :clean-targets ^{:protect false} ["target"]}}
  :aliases {"fig:build" ["run" "-m" "figwheel.main" "-b" "dev" "-r"]})
