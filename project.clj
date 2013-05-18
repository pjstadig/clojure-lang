(defproject name.stadig/clojure-lang "0.1.0-SNAPSHOT"
  :description "clojure.lang in Clojure"
  :url "http://github.com/pjstadig/clojure-lang/"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:resource-paths ["dummy-data"]
                   :dependencies [[org.clojure/clojure "1.5.1"]]}}
  :aot [clojure.lang.protocols])
